package cn.pushhand.blog.service;

import cn.pushhand.blog.model.Tuser;
import cn.pushhand.blog.model.TuserVo;

/**
 * 用户服务接口，博主服务接口
 * @author Errol
 *
 */
public interface UserService {

	/*
	 * 根据用户名查询用户
	 */
	TuserVo findUserByName(String userName);
}
