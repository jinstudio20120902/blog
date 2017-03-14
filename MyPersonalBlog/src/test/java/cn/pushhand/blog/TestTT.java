package cn.pushhand.blog;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pushhand.blog.model.TarticleLableComment;
import cn.pushhand.blog.model.TuserVo;
import cn.pushhand.blog.service.ArticleLableCommentService;
import cn.pushhand.blog.service.UserArticleService;
import cn.pushhand.blog.service.impl.ArticleLableCommentServiceImpl;

public class TestTT {
	
	
	@Test
	public void testfindAllArticleByUser(){
		
		@SuppressWarnings("resource")
		ApplicationContext context = 
			new ClassPathXmlApplicationContext(new String[]{"classpath:spring-base.xml" , "classpath:spring-mybatis.xml"});
		
		UserArticleService service = 
				(UserArticleService) context.getBean("userArticleService");
		
	
		TuserVo ls = service.findArticleByUser("001");
		
		System.out.println(ls);
		
		for(int i = 0 ; i< ls.getArticleList().size() ; i++){
			
			
			System.out.println(ls.getArticleList().get(i).toString());
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
