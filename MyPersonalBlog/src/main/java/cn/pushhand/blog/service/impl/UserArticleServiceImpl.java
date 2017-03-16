package cn.pushhand.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.mapper.TarticleLableCommentMapper;
import cn.pushhand.blog.model.TuserVo;
import cn.pushhand.blog.service.UserArticleService;
import cn.pushhand.blog.util.RedisCacheUtil;

/**
 * 实现类
 * @author Errol
 *
 */
@Service("userArticleService")
public class UserArticleServiceImpl implements UserArticleService {
	
	@Autowired
	private TarticleLableCommentMapper articleLableCommentMapper;
	@Autowired
	private RedisCacheUtil redisCache;
	

	@Override
	public TuserVo findArticleByUser(String userId) {
		
		/*
		 * 后期需要增加评论，将评论查询出来
		 */
		//先获取缓存
		Object o = redisCache.getCacheObject(userId+"_articleList");
		TuserVo userArticle = (TuserVo) o;
		if(userArticle != null){
			return userArticle;
		}
		
		userArticle = new TuserVo();
		
		userArticle.setArticleList(articleLableCommentMapper.findAllArticleByUser(userId));
		
		//设置到缓存当中
		//redisCache.setCacheObject(userId+"_articleList", userArticle);
		
		return userArticle;
	}

}
