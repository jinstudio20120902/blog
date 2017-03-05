package cn.pushhand.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pushhand.blog.model.TarticleLableComment;
import cn.pushhand.blog.model.Tlable;

/**
 * 查询文章详细新的Mapper
 * @author Errol
 *
 */
public interface TarticleLableCommentMapper {
	
	/**
	 * 查询当前用户的所有文章，以及文章标签
	 */
	List<TarticleLableComment> findAllArticleByUser(String userId);
	
	
	/**
	 * 查询当前用户所有文章，以及类型
	 * 参数，用户id，起始位置，每页数量
	 */
	List<TarticleLableComment> findAllArticleByPage(@Param(value="userId") String userId ,  
													@Param(value="startPos") Integer startPos , 
													@Param(value="pageSize") Integer pageSize);
	
	
	/**
	 * 查询用户的文章数 
	 */
	int fundArticleCountByUser(String userId);
	
	
	/**
	 * 根据文章id，获取文章的所有标签
	 */
	List<Tlable> findLableByArticle(String articleId);

}
