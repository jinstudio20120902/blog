package cn.pushhand.blog;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pushhand.blog.model.Tuser;
import cn.pushhand.blog.model.TuserVo;
import cn.pushhand.blog.service.UserArticleService;
import cn.pushhand.blog.util.RedisCacheUtil;

public class TestTT {
	
	
	@Test
	public void testfindAllArticleByUser(){
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext(new String[]{"classpath:spring-base.xml" , "classpath:spring-mybatis.xml", "classpath:spring-redis.xml"});
		
		System.out.println(context);
		
		
		UserArticleService service = (UserArticleService) context.getBean("userArticleService");
		
		System.out.println(service.findArticleByUser("001"));
		
		
		/*UserArticleService service = 
				(UserArticleService) context.getBean("userArticleService");
		
	
		TuserVo ls = service.findArticleByUser("001");
		
		System.out.println(ls);
		
		for(int i = 0 ; i< ls.getArticleList().size() ; i++){
			
			
			System.out.println(ls.getArticleList().get(i).toString());
			
			
			
		}*/
		
		
		RedisCacheUtil cache = (RedisCacheUtil) context.getBean("redisCache");
		
		/*cache.increseCacheObject("increkey");
		
		System.out.println(cache.getCacheObject("increkey"))*/;
		
		//cache = (RedisCacheUtil) context.getBean("redisCache");
		cache.setCacheObject("str2key", new TuserVo());
		
		TuserVo user = (TuserVo) cache.getCacheObject("str2key");
		
		System.out.println(user);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
