package cn.pushhand.blog.service;


/**
 * 用户文章Service
 * 
 * @author Errol
 *
 */

import cn.pushhand.blog.model.TuserVo;
public interface UserArticleService {
	
	/*
	 * 查询用户所有文章
	 * 文章包括文章、类型、标签、评论
	 */
	TuserVo findArticleByUser(String userId);
	
}
