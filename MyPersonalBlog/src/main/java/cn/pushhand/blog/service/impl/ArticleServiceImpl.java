package cn.pushhand.blog.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.mapper.TarticleLableCommentMapper;
import cn.pushhand.blog.mapper.TarticleMapper;
import cn.pushhand.blog.mapper.TarticlelableMapper;
import cn.pushhand.blog.mapper.TarticletypeMapper;
import cn.pushhand.blog.mapper.TcommentMapper;
import cn.pushhand.blog.model.Tarticle;
import cn.pushhand.blog.model.TarticleLableComment;
import cn.pushhand.blog.model.Tarticlelable;
import cn.pushhand.blog.model.TarticlelableExample;
import cn.pushhand.blog.model.TcommentExample;
import cn.pushhand.blog.model.TcommentExample.Criteria;
import cn.pushhand.blog.service.ArticleService;
/**
 * 文章service实现类
 * @author Errol
 *
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private TarticleMapper articleMapper;
	@Autowired
	TarticlelableMapper articleLableMapper;
	@Autowired
	TarticleLableCommentMapper articleLableCommentMapper;
	@Autowired
	private TcommentMapper commentMapper;
	@Autowired
	private TarticletypeMapper articleTypeMapper;

	@Override
	public int AddArticle(Tarticle tarticle) {
		return articleMapper.insert(tarticle);
		
	}


	@Override
	public int AddArticleLable(Tarticle tarticle, List<Tarticlelable> tarticleLableList) {
		
		//新增文章 
		if(tarticle.getVcArticleid() == null){
			//抛出异常
			throw new RuntimeException("系统错误");
		}
		//添加文章
		articleMapper.insert(tarticle);
		//添加文章标签
		
		Tarticlelable tarticlelable  = null;
		for(int i = 0 ; i < tarticleLableList.size() ; i++){
			tarticlelable = tarticleLableList.get(i);
			//判断是否为空
			if(tarticlelable.getVcArticleid() == null || tarticlelable.getVcLableid() == null){
				//抛出异常
				throw new RuntimeException("系统错误");
			}
			//添加
			articleLableMapper.insert(tarticlelable);
		}
		
		return 1;
	}


	@Override
	public TarticleLableComment selectArticltById(String articleId) {
		
		TarticleLableComment alc = new TarticleLableComment();
		
		//查询文章内容
		alc.setaTarticle(articleMapper.selectByPrimaryKey(articleId));
		
		//查询文章类型
		alc.setArticletype(articleTypeMapper.selectByPrimaryKey(alc.getaTarticle().getcArticletype()));
		
		//查询标签
		alc.setArticleLables(articleLableCommentMapper.findLableByArticle(articleId));
		
		//查询评论
		TcommentExample example = new TcommentExample();
		Criteria criteria = example.createCriteria();
		criteria.andVcArticleidEqualTo(articleId);
		alc.setArticleComments(commentMapper.selectByExample(example));
		
		return alc;
	}


	@Override
	public int deleteArticle(String articleId) {
		/*
		 * 删除博客
		 * 1、删除文章
		 * 2、删除文章对应的标签
		 * 3、删除文章对应的评论
		 */
		if(articleId  == null){
			return 0;
		}
		//删除文章
		articleMapper.deleteByPrimaryKey(articleId);
		//删除标签
		TarticlelableExample example = new TarticlelableExample();
		cn.pushhand.blog.model.TarticlelableExample.Criteria criteria 
									= example.createCriteria();
		criteria.andVcArticleidEqualTo(articleId);
		articleLableMapper.deleteByExample(example);
		//删除评论
		TcommentExample example2 = new TcommentExample();
		Criteria criteria2 = example2.createCriteria();
		criteria2.andVcArticleidEqualTo(articleId);
		commentMapper.deleteByExample(example2);
		
		return 1;
		
	}


	@Override
	public int updateArticleLable(Tarticle tarticle, List<Tarticlelable> tarticleLableList) {

		//更新文章
		articleMapper.updateByPrimaryKey(tarticle);
		
		//更新标签
		//先讲原有的标签删除，插入修改过后的
		TarticlelableExample example = new TarticlelableExample();
		cn.pushhand.blog.model.TarticlelableExample.Criteria criteria = example.createCriteria();
		criteria.andVcArticleidEqualTo(tarticle.getVcArticleid());
		articleLableMapper.deleteByExample(example);
		
		// 插入
		for(int i = 0 ; i < tarticleLableList.size() ; i++){
			Tarticlelable tarticlelable = tarticleLableList.get(i);
			//判断是否为空
			if(tarticlelable.getVcArticleid() == null || tarticlelable.getVcLableid() == null){
				//抛出异常
				throw new RuntimeException("系统错误");
			}
			//添加
			articleLableMapper.insert(tarticlelable);
		}
		
		
		
		return 1;
	}


	
	



	
	

}
