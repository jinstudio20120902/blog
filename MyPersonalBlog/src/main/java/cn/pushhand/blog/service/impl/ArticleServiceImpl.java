package cn.pushhand.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.mapper.TarticleMapper;
import cn.pushhand.blog.model.Tarticle;
import cn.pushhand.blog.service.ArticleServiceI;
@Service("articleService")
public class ArticleServiceImpl implements ArticleServiceI {
	@Autowired
	private TarticleMapper articleMapper;
	
	public TarticleMapper getArticleMapper() {
		return articleMapper;
	}

	
	public void setArticleMapper(TarticleMapper articleMapper) {
		this.articleMapper = articleMapper;
	}

	public Tarticle getArticleById(String id) {
		// TODO Auto-generated method stub
		return articleMapper.selectByPrimaryKey(id);
	}

	public List<Tarticle> getAllArticle(int startrow, int pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getArticleCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
