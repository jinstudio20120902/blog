package cn.pushhand.blog.model;

import java.io.Serializable;
import java.util.List;

/**
 * Tuser的扩展类型，用户扩展需求
 * 逆向工程生成的pojo一般不会修改
 * 为了满足一些需求，单独建立
 * @author Errol
 *
 */
public class TuserVo extends Tuser implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5770465391726770853L;
	/*
	 * 所有文章 
	 */
	private List<TarticleLableComment>  articleList;
	
	

	public List<TarticleLableComment> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<TarticleLableComment> articleList) {
		this.articleList = articleList;
	}
	

}
