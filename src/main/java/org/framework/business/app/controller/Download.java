package org.framework.business.app.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



/******************************************************************************
 * 名称：UserBasicEditorController.java</br>
 * 日期：2011-8-15</br>
 * 功能：</br>
 * 编写：Willson Huang</br>
 * 复核：</br>
 * 其他：</br>
 * 历史:(说明,修改人,时间)</br>
 * 1.create ,Willson Huang ,2011-8-15
 *****************************************************************************/
@Controller
@RequestMapping("/download")
public class Download {

	
	@RequestMapping(value="/down.action",method=RequestMethod.GET)
	public void downloadFile(@RequestParam("file")String fileName,HttpServletResponse response,HttpServletRequest request){

		response.setCharacterEncoding("utf-8");
		response.setContentType("multipart/form-data");
		response.setHeader("Content-Disposition", "attachment;fileName="+fileName);
		try {
			String path = request.getSession().getServletContext().getRealPath("/")+ "fileUpload";
			File file=new File(fileName);
			InputStream inputStream=new FileInputStream(path+File.separator+file);
			OutputStream os=response.getOutputStream();
			byte[] b=new byte[1024];
			int length;
			while((length=inputStream.read(b))>0){
				os.write(b,0,length);
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
