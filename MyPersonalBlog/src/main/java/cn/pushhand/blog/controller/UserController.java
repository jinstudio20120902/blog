package cn.pushhand.blog.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pushhand.blog.model.Tuser;
import cn.pushhand.blog.util.CryptographyUtil;

/**
 * 用户控制层，也就是博主控制层
 * @author Errol
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	/*
	 * 登录请求处理
	 */
	@RequestMapping("/login")
	public String Login(Tuser user , HttpServletRequest request){
		
		//获取当前登录的主体，用于身份验证
		Subject subject = SecurityUtils.getSubject();
		//将密码进行MD5加密，进行验证
		String passwordMd5 = CryptographyUtil.md5(user.getVcPassword(), "javacoder");
		//封装到token中
		UsernamePasswordToken token = new UsernamePasswordToken(user.getVcUsername(), passwordMd5);
		//身份验证
		try {
			/*
			 * 调用MyRealm中的doGetAuthenticationInfo方法进行身份认证
			 */
			subject.login(token);
			//验证成功，页面重定向
			return "redirect:/jsp/index.jsp";
		} catch (Exception e) {
			//验证不成功，抛出异常,返回信息到登录页面
			//这里其实不需要写返回到哪个页面，shiro配置已经帮我们做了
			e.printStackTrace();
			request.setAttribute("user", user);
			request.setAttribute("errorInfo", "用户名或密码错误");
			return "login";
		}
	}

}
