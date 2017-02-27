package cn.pushhand.blog.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.pushhand.blog.model.Tarticle;
import cn.pushhand.blog.model.Tuser;
import cn.pushhand.blog.service.ArticleService;
import cn.pushhand.blog.util.Result;
import net.sf.json.JSONObject;

/**
 * 文章controller，基于博主的
 * @author Errol
 *
 */
@Controller
public class ArticleAdminController {
	
	@Autowired
	private ArticleService articleService;
	
	/*
	 * 新增博文
	 */
	@RequestMapping("/admin/savearticle")
	@ResponseBody
	public Result AddArticle(HttpServletRequest request ,
					HttpServletResponse response) throws IOException{
		Result result = new Result();
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
		
		articleService.AddArticle(tarticle);
		//返回信息，提示成功
		result.setStatus(1);
		result.setSuccess(true);
		return result;
		
	}

}
