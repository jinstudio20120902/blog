package cn.pushhand.blog.service;

import java.util.List;

import cn.pushhand.blog.model.Tlable;

/**
 * 标签service
 * @author Errol
 *
 */
public interface LableService {

	List<Tlable> findAllLables();
	
}
