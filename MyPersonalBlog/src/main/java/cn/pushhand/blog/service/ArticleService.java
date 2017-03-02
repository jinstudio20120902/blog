package cn.pushhand.blog.service;


import java.util.List;

import cn.pushhand.blog.model.Tarticle;
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
}
