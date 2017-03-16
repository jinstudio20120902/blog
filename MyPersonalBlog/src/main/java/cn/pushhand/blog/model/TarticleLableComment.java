package cn.pushhand.blog.model;

import java.io.Serializable;
import java.util.List;

/**
 * 文章的包装类
 * 包括文章内容、文章标签、文章评论
 * @author Errol
 *
 */
public class TarticleLableComment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4908794229969676032L;

	/*
	 * 文章 
	 */
	private Tarticle aTarticle;
	
	/*
	 * 文章类型 
	 */
	private Tarticletype articletype;
	
	
	/*
	 * 文章的所有标签
	 */
	private List<Tlable> articleLables;
	
	/*
	 * 文章的所有评论
	 */
	private List<Tcomment> articleComments;

	public List<Tlable> getArticleLables() {
		return articleLables;
	}

	public void setArticleLables(List<Tlable> articleLables) {
		this.articleLables = articleLables;
	}

	public List<Tcomment> getArticleComments() {
		return articleComments;
	}

	public void setArticleComments(List<Tcomment> articleComments) {
		this.articleComments = articleComments;
	}


	public Tarticle getaTarticle() {
		return aTarticle;
	}

	public void setaTarticle(Tarticle aTarticle) {
		this.aTarticle = aTarticle;
	}

	public Tarticletype getArticletype() {
		return articletype;
	}

	public void setArticletype(Tarticletype articletype) {
		this.articletype = articletype;
	}

	@Override
	public String toString() {
		return "TarticleLableComment [aTarticle=" + aTarticle + ", articletype=" + articletype + ", articleLables="
				+ articleLables + ", articleComments=" + articleComments + "]";
	}

	
	
	
	

}
