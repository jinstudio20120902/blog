package cn.pushhand.blog;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pushhand.blog.model.Article;
import cn.pushhand.blog.service.ArticleServiceI;

public class TestArticle {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		ArticleServiceI  articleService = (ArticleServiceI) ac.getBean("articleService");
		Article  article = articleService.getArticleById("1");
		System.out.println(article.getTitle());
		
	};
}

