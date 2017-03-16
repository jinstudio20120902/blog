package cn.pushhand.blog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pushhand.blog.model.TarticleLableComment;
import cn.pushhand.blog.model.Tuser;
import cn.pushhand.blog.model.TuserVo;
import cn.pushhand.blog.service.ArticleService;
import cn.pushhand.blog.service.UserArticleService;
import cn.pushhand.blog.service.UserService;
import cn.pushhand.blog.util.RedisCacheUtil;

/**
 * 文章controller，基于访客的
 * @author Errol
 *
 */
@Controller
public class ArticleController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserArticleService userArticleService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private RedisCacheUtil redisCache;
	
	/*
	 * 基于访客的controller
	 */
	
	/*
	 * 博主首页 
	 */
	@RequestMapping("/blog/{username}")
	public String blogerIndex(@PathVariable("username")String username , 
			HttpServletRequest request ,
			HttpServletResponse response){
		
		/*
		 * 1、验证博主是否存在
		 * 2、将博主信息和文章列表封装起来
		 */
		Tuser user = userService.findUserByName(username);
		
		if(user == null){
			
			return "404";
			
		}
		
		//查询文章信息
		TuserVo userArticle = userArticleService.findArticleByUser(user.getVcUserid());
		//封装用户信息
		userArticle.setVcUsername(username);
		userArticle.setVcUserid(user.getVcUserid());
		
		//redis缓存博主首页访问量 + 1
		//key值：username_Blog_ViewCount
		String key = username+"_Blog_ViewCount";
		redisCache.increseCacheObject(key);
		
		//获取访问量
		String viewCount = (String) redisCache.getCacheObject(key);

		request.setAttribute("bloger", userArticle);
		request.setAttribute("viewCount", viewCount);
		
		return "blogindex";
		
	}
	
	
	
	/*
	 * 文章详情
	 */
	@RequestMapping("/blog/{username}/{articleId}")
	public String findArticltById(@PathVariable("username") String username , @PathVariable("articleId") String articleId , 
						HttpServletRequest request){
		
		
		//判断是否为空，为空则抛出异常 
		TarticleLableComment alc = articleService.selectArticltById(articleId);
		
		request.setAttribute("article", alc);
		
		return "article";
		
	}
	
	
	
	
	
	

}
