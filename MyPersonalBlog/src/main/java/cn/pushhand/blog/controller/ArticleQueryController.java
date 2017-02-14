package cn.pushhand.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.pushhand.blog.model.Tarticle;
import cn.pushhand.blog.service.ArticleServiceI;

@Controller
@RequestMapping("/article")
public class ArticleQueryController {
	@Autowired
	private ArticleServiceI articleServiceI;
	
	
	
	@RequestMapping("/findArticle")
	public ModelAndView findArticle(){
		
		Tarticle tarticle = articleServiceI.getArticleById("1");
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("tarticle" , tarticle);
		
		mv.setViewName("article");
		
		return mv;
		
	}

}
