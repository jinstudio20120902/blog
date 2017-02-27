package cn.pushhand.blog.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传工具类
 * @author Errol
 *
 */
public class FileUploadUtils {

	/*
	 * 上传文件
	 */
	public static String upload(MultipartFile multipartFile, HttpServletRequest request) throws IllegalStateException, IOException {
		
		String  fileName = multipartFile.getOriginalFilename();
		//名称 
		String fileBaseName = fileName.substring(0 , fileName.lastIndexOf("."));
		//后缀
		String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
		//获取当前系统时间戳，作为文件名的一部分
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
		
		//创建一个新的文件名称
		String newFileName = sf.format(new Date());
		newFileName = newFileName + "." + fileExt;
		
		//获取路径
		String filePath = request.getSession().getServletContext().getRealPath("/") + 
					"\\upload\\" + newFileName;
		
		//创建文件
		File localFile = new File(filePath);
		//不存在则自动创建
		if(!localFile.exists()){
			localFile.mkdir();
		}
		//存放
		multipartFile.transferTo(localFile);
		return filePath;
	}

}
