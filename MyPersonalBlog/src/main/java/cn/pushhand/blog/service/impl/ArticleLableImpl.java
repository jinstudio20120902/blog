package cn.pushhand.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.mapper.TarticlelableMapper;
import cn.pushhand.blog.model.Tarticlelable;
import cn.pushhand.blog.service.ArticleLable;

/**
 * 文章标签实现类
 * @author Errol
 *
 */
@Service("articleLable")
public class ArticleLableImpl implements ArticleLable {
	
	@Autowired
	TarticlelableMapper articleLableMapper;

	@Override
	/*
	 * 新增文章标签
	 * (non-Javadoc)
	 * @see cn.pushhand.blog.service.ArticleLable#addArticleLable(cn.pushhand.blog.model.Tarticlelable)
	 */
	public void addArticleLable(Tarticlelable tarticlelable) {
		
		//判断是否为空
		if(tarticlelable.getVcArticleid() == null || tarticlelable.getVcLableid() == null){
			//抛出异常
			throw new RuntimeException("系统错误");
		}
		
		//添加
		articleLableMapper.insert(tarticlelable);
		

	}

}
