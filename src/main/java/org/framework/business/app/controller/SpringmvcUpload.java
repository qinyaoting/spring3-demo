package org.framework.business.app.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


@Controller
@RequestMapping("/upload")
public class SpringmvcUpload {

	/**
	 * 
	 * @param request
	 * @param file
	 * @return
	 * @throws IOException
	 * 
	 *     Songjian  @Mar 7, 2013
	 */
	@RequestMapping(value="/test.action",method=RequestMethod.POST)
	public String upload(HttpServletRequest request,@RequestParam("myfile" ) MultipartFile file) throws IOException{
		String path = request.getSession().getServletContext().getRealPath("/")+ "fileUpload";
		FileCopyUtils.copy(file.getBytes(),new File(path+File.separator+file.getOriginalFilename())); 
		return "/index/index";
	}
	
	
	/**
	 * 多文件上传
	 * @param request
	 * @return
	 * @throws IOException
	 * 
	 *     Songjian  @Mar 7, 2013
	 */
	@RequestMapping(value="/test2.action",method=RequestMethod.POST)
	public String fileUpload(HttpServletRequest request)throws IOException { 
		System.out.println(request.getParameter("type"));
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest)request; 
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap(); 
		String path = request.getSession().getServletContext().getRealPath("/")+ "fileUpload";
		String fileName = null; 
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) { 
			//上传文件名
			MultipartFile mf = entity.getValue(); 
			fileName = mf.getOriginalFilename(); 
			File uploadFile = new File(path+File.separator+fileName); 
			FileCopyUtils.copy(mf.getBytes(), uploadFile); 
		}
		return "/index/index";
	}
	
	@RequestMapping(value="/download.action",method=RequestMethod.GET)
	public String download(HttpServletRequest request)throws IOException { 
		
		return null;
	}
}
