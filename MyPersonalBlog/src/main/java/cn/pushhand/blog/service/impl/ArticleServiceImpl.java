package cn.pushhand.blog.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.mapper.TarticleMapper;
import cn.pushhand.blog.model.Tarticle;
import cn.pushhand.blog.service.ArticleService;
/**
 * 文章service实现类
 * @author Errol
 *
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private TarticleMapper articleMapper;

	@Override
	public int AddArticle(Tarticle tarticle) {
		return articleMapper.insert(tarticle);
		
	}
	
	

}
