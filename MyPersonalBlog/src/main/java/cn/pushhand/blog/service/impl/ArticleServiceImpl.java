package cn.pushhand.blog.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.mapper.TarticleMapper;
import cn.pushhand.blog.mapper.TarticlelableMapper;
import cn.pushhand.blog.model.Tarticle;
import cn.pushhand.blog.model.Tarticlelable;
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
	



	
	

}
