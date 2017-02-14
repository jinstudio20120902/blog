package cn.pushhand.blog.service;

import java.util.List;

import cn.pushhand.blog.model.Tarticle;


public interface ArticleServiceI {
	public Tarticle getArticleById(String id);

	public List<Tarticle> getAllArticle(int startrow,int pagesize);

	public String getArticleCount();
}
