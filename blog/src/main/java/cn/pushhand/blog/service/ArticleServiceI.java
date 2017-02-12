package cn.pushhand.blog.service;

import java.util.List;

import cn.pushhand.blog.model.Article;

public interface ArticleServiceI {
	public Article getArticleById(String id);

	public List<Article> getAllArticle(int startrow,int pagesize);

	public String getArticleCount();
}
