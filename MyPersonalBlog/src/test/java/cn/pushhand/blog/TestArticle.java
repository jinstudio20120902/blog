package cn.pushhand.blog;



import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pushhand.blog.model.Tarticle;
import cn.pushhand.blog.model.Tuser;
import cn.pushhand.blog.model.TuserVo;
import cn.pushhand.blog.service.ArticleServiceI;
import cn.pushhand.blog.service.UserService;

public class TestArticle {
	@Test
	public void test1(){
		///blog/src/main/resources/spring.xml
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-base.xml","classpath:spring-mybatis.xml");
		ArticleServiceI  articleService = (ArticleServiceI) ac.getBean("articleService");
		Tarticle  article = articleService.getArticleById("1");
		System.out.println(article.getVcArticletitle());
		
	};
	
	
	@Test
	public void test2(){
		///blog/src/main/resources/spring.xml
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-base.xml","classpath:spring-mybatis.xml");
		UserService userService = (UserService) ac.getBean("userService");
		TuserVo user = userService.findUserByName("errol");
		
		System.out.println(user);
		
	};
	

}

