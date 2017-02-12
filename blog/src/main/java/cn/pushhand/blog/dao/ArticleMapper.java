package cn.pushhand.blog.dao;

import cn.pushhand.blog.model.Article;

public interface ArticleMapper {
	 Article selectByPrimaryKey(String id);
}
