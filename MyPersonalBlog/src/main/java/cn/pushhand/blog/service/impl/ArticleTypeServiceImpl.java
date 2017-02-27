package cn.pushhand.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.mapper.TarticletypeMapper;
import cn.pushhand.blog.model.Tarticletype;
import cn.pushhand.blog.service.ArticleTypeService;

/**
 * 文章类型Service实现
 * @author Errol
 *
 */
@Service("articleTypeService")
public class ArticleTypeServiceImpl implements ArticleTypeService {

	@Autowired
	private TarticletypeMapper tarticletypeMapper;
	
	public List<Tarticletype> findAllArticleTypes() {
		
		return tarticletypeMapper.selectByExample(null);
	}

}
