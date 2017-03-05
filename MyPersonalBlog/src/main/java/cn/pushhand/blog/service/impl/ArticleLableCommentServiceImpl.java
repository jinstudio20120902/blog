package cn.pushhand.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.mapper.TarticleLableCommentMapper;
import cn.pushhand.blog.mapper.TlableMapper;
import cn.pushhand.blog.model.TarticleLableComment;
import cn.pushhand.blog.model.Tlable;
import cn.pushhand.blog.service.ArticleLableCommentService;

@Service("articleLableCommentService")
public class ArticleLableCommentServiceImpl implements ArticleLableCommentService {

	
	@Autowired
	private TarticleLableCommentMapper articleLableCommentMapper;
	
	@Override
	public List<TarticleLableComment> findAllArticleByUser(String userId) {
		if (userId != null){
			return articleLableCommentMapper.findAllArticleByUser(userId);
		}
		return null;
	}

	@Override
	public List<TarticleLableComment> findAllArticleByPage(String userId, Integer startPos, Integer pageSize) {
		List<TarticleLableComment> articleList = new ArrayList<TarticleLableComment>();
		//分页获取所有文章
		articleList = articleLableCommentMapper.findAllArticleByPage(userId, startPos, pageSize);
		//为每篇文章获取标签
		for(int i = 0 ; i < articleList.size() ; i++){
			TarticleLableComment alc = articleList.get(i);
			List<Tlable> lables = 
					articleLableCommentMapper.findLableByArticle(alc.getaTarticle().getVcArticleid());
			//插回原来的对象中
			alc.setArticleLables(lables);
			articleList.set(i, alc);
		}
		return articleList;
	}

	@Override
	public int fundArticleCountByUser(String userId) {
		// TODO Auto-generated method stub
		return articleLableCommentMapper.fundArticleCountByUser(userId);
	}

}
