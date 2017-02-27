package cn.pushhand.blog.service;

import java.util.List;

import cn.pushhand.blog.model.Tarticletype;

/**
 * 文章类型Service
 * @author Errol
 *
 */
public interface ArticleTypeService {
	
	/*
	 * 获取所有的文章类型
	 */
	List<Tarticletype> findAllArticleTypes();

}
