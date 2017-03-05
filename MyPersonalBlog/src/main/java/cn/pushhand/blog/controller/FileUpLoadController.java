package cn.pushhand.blog.controller;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * 图片上传
 *   /admin 表示该请求，需要经过shiro身份校验
 * @author Errol
 *
 */
@Controller
public class FileUpLoadController {
	
	@RequestMapping(value="/admin/upload", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFile(@RequestParam("file")MultipartFile multipartFile , 
			HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String  fileName = multipartFile.getOriginalFilename();
		//名称 
		String fileBaseName = fileName.substring(0 , fileName.lastIndexOf("."));
		//后缀
		String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
		//获取当前系统时间戳，作为文件名的一部分
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		
		//创建一个新的文件名称
		String newFileName = sf.format(new Date());
		newFileName = newFileName + "." + fileExt;
		System.out.println();
		//获取路径
		String filePath = request.getSession().getServletContext().getRealPath("/") + "jsp\\img\\upload\\" + newFileName;
		String  netfilePath = "http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/jsp/img/upload/"+newFileName;
		
		//创建文件
		File localFile = new File(filePath);
		//不存在则自动创建
		if(!localFile.exists()){
			localFile.mkdir();
		}
		//存放
		multipartFile.transferTo(localFile);
		//System.out.println(filePath);
		return netfilePath;		
	}
	
}
