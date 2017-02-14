package cn.pushhand.blog;



import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pushhand.blog.model.Tarticle;
import cn.pushhand.blog.service.ArticleServiceI;

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
	public void testsqlSessionFactory(){
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml" , "spring-mybatis.xml"});
		SqlSessionFactory sessionFactory = (SqlSessionFactory) ac.getBean("sqlSessionFactory");
		System.out.println(sessionFactory);
	}
}

