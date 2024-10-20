package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminlogin")
public class AdminLoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un =req.getParameter("email"); 
		String pass =req.getParameter("pass");
		
		if(un.equalsIgnoreCase("admin@gmail.com") && pass.equalsIgnoreCase("admin123")) {
			resp.getWriter().print("<h1>Admin Login Successfull</h1>");
			req.getRequestDispatcher("AdminDashboard.jsp").include(req, resp);
		}else {
			resp.getWriter().print("<h1>Invalid Credentials</h1>");
			req.getRequestDispatcher("AdminSignUp.jsp").include(req, resp);
		}
	}
}
