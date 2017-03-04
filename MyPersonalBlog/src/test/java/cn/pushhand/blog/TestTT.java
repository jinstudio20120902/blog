package cn.pushhand.blog;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pushhand.blog.model.TarticleLableComment;
import cn.pushhand.blog.service.ArticleLableCommentService;
import cn.pushhand.blog.service.impl.ArticleLableCommentServiceImpl;

public class TestTT {
	
	
	@Test
	public void testfindAllArticleByUser(){
		
		@SuppressWarnings("resource")
		ApplicationContext context = 
			new ClassPathXmlApplicationContext(new String[]{"classpath:spring-base.xml" , "classpath:spring-mybatis.xml"});
		
		ArticleLableCommentService service = 
				(ArticleLableCommentService) context.getBean("articleLableCommentService");
		
		
		System.out.println(service.fundArticleCountByUser("001"));
		
		List<TarticleLableComment> ls = service.findAllArticleByPage("001", 1 , 2);
		
		for(int i = 0 ; i< ls.size() ; i++){
			
			
			System.out.println(ls.get(i).toString());
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
