package cn.pushhand.blog.mapper;

import cn.pushhand.blog.model.TuserVo;

/**
 * 新增的用户查询Mapper
 * 由于逆向工厂生成的mapper查询无法满足需要，所以单独建立包装类型的pojo和Maper
 * @author Errol
 *
 */
public interface TUserQueryMapper {
	
	/*
	 * 按照用户名称查询用户
	 * username字段为唯一性索引
	 * 所以只会返回一条记录
	 */
	TuserVo findUserByUserName(String vc_username);

}
