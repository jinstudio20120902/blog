package cn.pushhand.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.mapper.TUserQueryMapper;
import cn.pushhand.blog.model.Tuser;
import cn.pushhand.blog.model.TuserVo;
import cn.pushhand.blog.service.UserService;

/**
 * 用户service的实现类
 * @author Errol
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private TUserQueryMapper tUserQueryMapper;

	@Override
	public TuserVo findUserByName(String userName) {
		
		return tUserQueryMapper.findUserByUserName(userName);
	}

}
