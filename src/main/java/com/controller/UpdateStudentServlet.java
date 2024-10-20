package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

@WebServlet("/updateStudent")
public class UpdateStudentServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");
		
		StudentDao sd = new StudentDao();
		sd.updateStudentById(id,name,email,dob,gender);
		
		resp.getWriter().print("<h1>Student Updated</h1>");
		req.getRequestDispatcher("AdminDashboard.jsp").include(req, resp);
	}
}
