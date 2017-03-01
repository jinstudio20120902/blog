package cn.pushhand.blog.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.pushhand.blog.model.Tarticletype;
import cn.pushhand.blog.service.ArticleTypeService;
import cn.pushhand.blog.util.Result;

/**
 * 文章类型的controller
 * @author Errol
 *
 */
@Controller
public class ArticleTypeController {
	
	@Autowired
	private ArticleTypeService  articleTypeService ;
	
	/*
	 * 查询所有的文章类别
	 */
	@RequestMapping("/findAllArticleType")
	public String findAllArticleType(HttpServletRequest request ,
			HttpServletResponse response){
		
		List<Tarticletype> aTarticletypes = new ArrayList<Tarticletype>();
		aTarticletypes = articleTypeService.findAllArticleTypes();
		
		request.setAttribute("articletypes", aTarticletypes);
		
		return "form_editors";
		
	}
	
}
