package com.svit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name = req.getParameter("pname");
		int age = Integer.parseInt(req.getParameter("page"));
		String mno = req.getParameter("pnum");
		if(age<=21)
		{
			pw.println("<h4>"+name+" You are Not Eligible </h4>");
		}
		else
		{
			pw.println("<h4>"+name+" You are Eligible</h4>");
		}
		pw.println("<a href='index.html'><img src='image/h.jpg'></a>");
		
	}

}
