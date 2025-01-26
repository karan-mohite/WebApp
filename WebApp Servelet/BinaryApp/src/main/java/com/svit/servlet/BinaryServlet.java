package com.svit.servlet;

import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;
import javax.annotation.*;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/img")
public class BinaryServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException, NumberFormatException
	{
		res.setContentType("image/jpeg");
		ServletOutputStream os = res.getOutputStream();
		String path = this.getServletContext().getRealPath("tree.jpg");
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		byte[] b=new byte[(int)f.length()];
		fis.read(b);
		os.write(b);
		os.close();
		fis.close();
	}
}


