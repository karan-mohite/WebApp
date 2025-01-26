package com.svit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishesServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter  pw=res.getWriter();
		res.setHeader("refresh","3");
		LocalDateTime lit=LocalDateTime.now();
		int time=lit.getHour();
		
		if(time<12)
			pw.println("<h1>Good Morning Ashwini</h1>");
					
		else if(time<18)
			pw.println("<h1>Good Afternoon Ashwini</h1>");
		
		else
		{
			pw.println("<h1>Good Night Ashwini</h1>");
		}
		
		pw.println("<h1>Date and Time is:"+lit+"</h1>");
		pw.close();
	}

}
