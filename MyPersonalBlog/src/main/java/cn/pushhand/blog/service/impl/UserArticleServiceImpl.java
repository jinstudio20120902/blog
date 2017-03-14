package cn.pushhand.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.mapper.TarticleLableCommentMapper;
import cn.pushhand.blog.model.TuserVo;
import cn.pushhand.blog.service.UserArticleService;

/**
 * 实现类
 * @author Errol
 *
 */
@Service("userArticleService")
public class UserArticleServiceImpl implements UserArticleService {
	
	@Autowired
	private TarticleLableCommentMapper articleLableCommentMapper;
	

	@Override
	public TuserVo findArticleByUser(String userId) {
		
		/*
		 * 后期需要增加评论，将评论查询出来
		 */
		
		TuserVo userArticle = new TuserVo();
		
		userArticle.setArticleList(articleLableCommentMapper.findAllArticleByUser(userId));
		
		return userArticle;
	}

}
