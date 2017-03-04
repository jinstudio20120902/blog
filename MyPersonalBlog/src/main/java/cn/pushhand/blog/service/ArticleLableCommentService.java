package cn.pushhand.blog.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pushhand.blog.model.TarticleLableComment;

/**
 * 文章详细内容的service
 * @author Errol
 *
 */
public interface ArticleLableCommentService {
	
	
	/**
	 * 查询当前用户的所有文章，以及文章标签
	 */
	List<TarticleLableComment> findAllArticleByUser(String userId);
	
	/**
	 * 查询当前文章所有文章，以及类型，标签，评论等
	 * 参数，用户id，起始位置，每页数量
	 */
	List<TarticleLableComment> findAllArticleByPage(String userId ,  
													 Integer startPos , 
													Integer pageSize);
	
	
	/**
	 * 查询用户的文章数 
	 */
	int fundArticleCountByUser(String userId);

}
