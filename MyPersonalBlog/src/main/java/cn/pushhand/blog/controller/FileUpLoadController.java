package cn.pushhand.blog.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.pushhand.blog.util.FileUploadUtils;

/**
 * 图片上传
 *   /admin 表示该请求，需要经过shiro身份校验
 * @author Errol
 *
 */
@Controller
@RequestMapping("/admin")
public class FileUpLoadController {
	
	@RequestMapping("/upload")
	@ResponseBody
	public String uploadFile(@RequestParam("file")MultipartFile multipartFile , 
			HttpServletRequest request , HttpServletResponse response) throws Exception{
		
		String filePath = null;
		filePath = FileUploadUtils.upload(multipartFile , request);
		
		
		//如果filePath为空，则上传失败
		if (filePath == null || filePath == ""){
			return null;
		}
		
		ObjectMapper mapper = new ObjectMapper();
		filePath = mapper.writeValueAsString(filePath);
		return filePath;
		
	}
	
}
