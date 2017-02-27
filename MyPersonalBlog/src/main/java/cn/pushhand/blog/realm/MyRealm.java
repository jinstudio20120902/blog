package cn.pushhand.blog.realm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import cn.pushhand.blog.model.Tuser;
import cn.pushhand.blog.service.UserService;

/**
 * shiro的自定义realm
 * spring配置文件中加入shiro的配置
 * web.xml中加入拦截器
 * @author Errol
 *
 */
public class MyRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	/**
	 * 为当前登陆的用户授予角色和权限
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		// 这个个人博客项目是没有这一项的，因为就一个用户
		return null;
	}

	/**
	 * 对前登陆的用户进行身份认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		
		String username = (String) token.getPrincipal(); // 获取用户名
		
		System.out.println("当前用户名:"+ username);
		//获取用户的信息
		Tuser user = userService.findUserByName(username);

		if (user != null) {
			//把当前用户存到session中
			SecurityUtils.getSubject().getSession().setAttribute("currentUser", user);
			
			AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(
					user.getVcUsername() , user.getVcPassword(), "MyRealm");
			
			return authcInfo;
		} else {
			return null;
		}

	}

}
