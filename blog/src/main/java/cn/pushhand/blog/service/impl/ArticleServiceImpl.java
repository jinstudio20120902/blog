package cn.pushhand.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.dao.ArticleMapper;
import cn.pushhand.blog.model.Article;
import cn.pushhand.blog.service.ArticleServiceI;
@Service("articleService")
public class ArticleServiceImpl implements ArticleServiceI {
	private ArticleMapper articleMapper;
	
	public ArticleMapper getArticleMapper() {
		return articleMapper;
	}

	@Autowired
	public void setArticleMapper(ArticleMapper articleMapper) {
		this.articleMapper = articleMapper;
	}

	public Article getArticleById(String id) {
		// TODO Auto-generated method stub
		return articleMapper.selectByPrimaryKey(id);
	}

	public List<Article> getAllArticle(int startrow, int pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getArticleCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
