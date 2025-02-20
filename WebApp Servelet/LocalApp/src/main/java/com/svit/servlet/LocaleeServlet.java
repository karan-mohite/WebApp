package com.svit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LocaleeServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		LocalDateTime time=LocalDateTime.now();
		Locale[] l=Locale.getAvailableLocales();
		
		if(req.getParameter("p1").equalsIgnoreCase("link1")) 
		{
			for(Locale ref:l)
				pw.println(ref.getDisplayCountry());
				
		}
		else if(req.getParameter("p1").equalsIgnoreCase("link2"))
		{
			for(Locale ref:l)
				pw.println(ref.getLanguage());
				
		}
		else if(req.getParameter("p1").equalsIgnoreCase("link3"))
		{
				pw.println("<h4>Time is "+time+"</h4>");
		}

    }
}