package cn.pushhand.blog.service;

import java.util.List;

import cn.pushhand.blog.model.Tarticle;

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
}
