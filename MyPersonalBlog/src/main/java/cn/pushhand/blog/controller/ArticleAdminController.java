package cn.pushhand.blog.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.pushhand.blog.model.Tarticle;
import cn.pushhand.blog.model.TarticleLableComment;
import cn.pushhand.blog.model.Tarticlelable;
import cn.pushhand.blog.model.Tarticletype;
import cn.pushhand.blog.model.Tlable;
import cn.pushhand.blog.model.Tuser;
import cn.pushhand.blog.service.ArticleLableCommentService;
import cn.pushhand.blog.service.ArticleService;
import cn.pushhand.blog.service.ArticleTypeService;
import cn.pushhand.blog.service.LableService;
import cn.pushhand.blog.util.PageUtil;
import cn.pushhand.blog.util.RedisCacheUtil;
import cn.pushhand.blog.util.Result;

/**
 * 文章controller，基于博主的
 * @author Errol
 *
 */
@Controller
public class ArticleAdminController {
	
	@Autowired
	private ArticleService articleService;
	@Autowired
	private ArticleTypeService  articleTypeService ;
	@Autowired
	private LableService lableService;
	@Autowired
	private ArticleLableCommentService articleLableService;
	@Autowired
	private RedisCacheUtil redisCache;
	
	
	/*
	 * 写文章页面
	 *	1、获取文章类型
	 *	2、获取标签
	 */
	@RequestMapping("/admin/writearticle")
	public String WriteArticle(HttpServletRequest request ,
			HttpServletResponse response){
		
		//获取文章类型 
		List<Tarticletype> aTarticletypes = new ArrayList<Tarticletype>();
		aTarticletypes = articleTypeService.findAllArticleTypes();
		request.setAttribute("articletypes", aTarticletypes);
		
		//获取文章标签
		List<Tlable> lables = new ArrayList<Tlable>();
		lables = lableService.findAllLables();
		request.setAttribute("lables", lables);
		
		return "form_editors";
		
	}
	
	/*
	 * 保存博文
	 */
	@RequestMapping("/admin/savearticle")
	@ResponseBody
	public Result AddArticle(HttpServletRequest request ,
					HttpServletResponse response) throws IOException, ServletException{
		Result result = new Result();
		/*
		 * 首先获取文章id
		 * 如果id ！= null , 则为修改文章 ，请求转发到updateArticle.action
		 * 否则为新增 
		 */
		Tarticle tarticle = new Tarticle();
		//设置ID
		tarticle.setVcArticleid(UUID.randomUUID().toString());
		//标题
		tarticle.setVcArticletitle(request.getParameter("vcArticletitle").toString());
		//类型
		tarticle.setcArticletype(request.getParameter("cArticletype").toString());
		//内容
		tarticle.setVcArticlecontent(request.getParameter("vcArticlecontent").toString());
		//获取session中的用户名
		HttpSession session = request.getSession();
		Tuser user = (Tuser) session.getAttribute("currentUser");
		//如果没有登录 
		if(user == null){
			//提示信息
			//请先登录
			result.setStatus(0);
			result.setSuccess(false);
			result.setMessage("未登录，请先登录");
			return result;
		}
		//设置用户ID
		tarticle.setVcUserid(user.getVcUserid());
		//时间
		tarticle.setDtCreatetime(new Date());
		tarticle.setDtPublishtime(new Date());
		tarticle.setnClicknum(0);
		
		//解析传入的lable id
		//拆分,以逗号拆分
		List<String> lableids = 
				Arrays.asList(request.getParameter("vcLableid").toString().split(","));
		
		
		List<Tarticlelable> tarticleLableList = new ArrayList<Tarticlelable>();
		
		//添加文章标签
		Iterator<String> it = lableids.iterator();
		while(it.hasNext()){
			String val = it.next();
			if( val != null){
				Tarticlelable tarticlelable = new Tarticlelable();
				tarticlelable.setVcLableid(val);
				tarticlelable.setVcArticleid(tarticle.getVcArticleid());
				tarticleLableList.add(tarticlelable);
			}
		}
		
		
		//添加文章和标签
		articleService.AddArticleLable(tarticle , tarticleLableList);
		//清空缓存
		redisCache.deleteKey(user.getVcUserid()+"_articleList");
		
		//返回信息，提示成功
		result.setStatus(1);
		result.setSuccess(true);
		return result;
	
	/*
		request.getRequestDispatcher("/admin/saveUpdateArticle.action").forward(request, response);
		
		result.setStatus(1);
		result.setSuccess(true);
		return result;
		*/
		
		
		
		
	}
	
	
	
	/*
	 * 博主获取文章列表
	 * 包括标签
	 */
	@RequestMapping("/admin/findAllArticle")
	public String findAllArticleByUser(HttpServletRequest request ,
			HttpServletResponse response){
		
		//首先获取session中的user
		HttpSession session = request.getSession();
		Tuser user = (Tuser) session.getAttribute("currentUser");
		if(user == null){
			return "login";
		}
		String userId = user.getVcUserid();
		
		//根据用户名，查询所有的文章
		List<TarticleLableComment> articleList = articleLableService.findAllArticleByUser(userId);
		request.setAttribute("articleList", articleList);
		//返回到页面
		return "blog";
		
	}
	
	
	/*
	 *  分页获取文章列表
	 */
	@RequestMapping("/admin/findAllArticlePage")
	public String findAllArticleByPage(HttpServletRequest request ,
			HttpServletResponse response){
		
		//首先获取session中的user
		HttpSession session = request.getSession();
		Tuser user = (Tuser) session.getAttribute("currentUser");
		if(user == null){
			return "login";
		}
		String userId = user.getVcUserid();
		
		List<TarticleLableComment> articleList = new ArrayList<TarticleLableComment>();
		//分页处理
		PageUtil page = null;
		//获取传入的页码
		String pageNow = request.getParameter("pageNow");
		//获取文章总数
		int totalCount = articleLableService.fundArticleCountByUser(userId);
		//判断当前页是第几页
		if(pageNow == null){
			//第一次打开，未传入当前页
			page = new PageUtil(totalCount, 1);
		}else{
			//传入了pageNow
			page = new PageUtil(totalCount , Integer.parseInt(pageNow));
		}
		//分页查询文章
		articleList = 
				articleLableService.findAllArticleByPage(userId, page.getStartPos(), page.getPageSize());	
		
		request.setAttribute("articleList", articleList);
		request.setAttribute("page", page);
		//返回到页面
		return "blog";
		
	}
	
	
	/*
	 * 查看单篇文章内容标签以及评论
	 */
	@RequestMapping("/admin/findArticltById")
	public String findArticltById(HttpServletRequest request ,
			HttpServletResponse response){
		//获取文章id
		String articleId = request.getParameter("articleId");
		//判断是否为空，为空则抛出异常 
		TarticleLableComment alc = articleService.selectArticltById(articleId);
		
		request.setAttribute("article", alc);
		
		return "article";
		
	}
	
	
	/*
	 * 删除文章
	 */
	@RequestMapping("/admin/deleteArticltById")
	@ResponseBody
	public Result deleteArticle(HttpServletRequest request ,
			HttpServletResponse response){
		Result result = new Result();
		
		String articleId = request.getParameter("articleId");
		if(articleId == null){
			result.setStatus(0);
			result.setSuccess(false);
			result.setMessage("文章不存在");
			return result;
		}
		
		//删除文章
		articleService.deleteArticle(articleId);

		
		result.setStatus(1);
		result.setSuccess(true);
		
		return result;
		
	}
	
	/*
	 * 修改文章
	 * 只需要修改文章
	 * 根据文章id
	 */
	@RequestMapping("/admin/updateArticltById")
	public String updateArticle(HttpServletRequest request ,
			HttpServletResponse response){
		
		String articleId = request.getParameter("articleId");
		if(articleId == null){
			//重定向提示，文章不存在
		}
		
		//根据文章id获取到TarticleLableComment对象
		TarticleLableComment alc = articleService.selectArticltById(articleId);
		
		request.setAttribute("articleLableComment", alc);
		
		//获取类型列表
		List<Tarticletype> aTarticletypes = new ArrayList<Tarticletype>();
		aTarticletypes = articleTypeService.findAllArticleTypes();
		request.setAttribute("articletypes", aTarticletypes);
		
		//获取文章标签
		List<Tlable> lables = new ArrayList<Tlable>();
		lables = lableService.findAllLables();
		request.setAttribute("lables", lables);
		
		return "form_editors";
		
	}
	
	/*
	 * 保存修改
	 */
	@RequestMapping("/admin/saveUpdateArticle")
	@ResponseBody
	public Result saveUpdateArticle(HttpServletRequest request ,
			HttpServletResponse response){
		
		Result result = new Result();
	
		//设置ID
		String articleId = request.getParameter("articleId");
		
		//获取到原文章信息
		TarticleLableComment alc = articleService.selectArticltById(articleId);
		
		alc.getaTarticle().setVcArticleid(articleId);
		//标题
		alc.getaTarticle().setVcArticletitle(request.getParameter("vcArticletitle").toString());
		//类型
		alc.getaTarticle().setcArticletype(request.getParameter("cArticletype").toString());
		//内容
		alc.getaTarticle().setVcArticlecontent(request.getParameter("vcArticlecontent").toString());
		
		
		//解析传入的lable id
		//拆分,以逗号拆分
		List<String> lableids = 
				Arrays.asList(request.getParameter("vcLableid").toString().split(","));
		
		
		List<Tarticlelable> tarticleLableList = new ArrayList<Tarticlelable>();
		
		//添加文章标签
		Iterator<String> it = lableids.iterator();
		while(it.hasNext()){
			String val = it.next();
			if( val != null){
				Tarticlelable tarticlelable = new Tarticlelable();
				tarticlelable.setVcLableid(val);
				tarticlelable.setVcArticleid(articleId);
				tarticleLableList.add(tarticlelable);
			}
		}
		
		//调用sercice处理数据 
		articleService.updateArticleLable(alc.getaTarticle(), tarticleLableList);
		
		
		//返回信息，提示成功
		result.setStatus(1);
		result.setSuccess(true);
		return result;
		
		
		
	}
	
	
	

}
