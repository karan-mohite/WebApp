package com.svit.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/capitalurl")
public class CapitalServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int index= Integer.parseInt(req.getParameter("State"));
		String state[]= {"Maharashtra","Bihar","Gujrat"};
		String capitals[]= {"Mumbai"," patana"," GandhiNagar"};
		pw.println("<h1>Capital of "+state[index]+"is"+capitals[index]+"</h1>");
		pw.close();
	}

}
