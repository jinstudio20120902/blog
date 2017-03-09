package cn.pushhand.blog.service;


import java.util.List;

import cn.pushhand.blog.model.Tarticle;
import cn.pushhand.blog.model.TarticleLableComment;
import cn.pushhand.blog.model.Tarticlelable;

/**
 * 文章service接口
 * @author Errol
 *
 */
public interface ArticleService {
	
	/*
	 * 新增博文
	 */
	int AddArticle(Tarticle tarticle);
	
	
	/*
	 * 新增博文，以及标签
	 */
	int AddArticleLable(Tarticle tarticle , List<Tarticlelable> tarticleLableList);
	
	/*
	 * 查看博文
	 * 根据博客id
	 */
	TarticleLableComment selectArticltById(String articleId);
	
	/*
	 * 删除博客
	 */
	int deleteArticle(String articleId);
	
	
	/*
	 * 修改博客，以及标签
	 */
	int updateArticleLable(Tarticle tarticle , List<Tarticlelable> tarticleLableList);
	

}
