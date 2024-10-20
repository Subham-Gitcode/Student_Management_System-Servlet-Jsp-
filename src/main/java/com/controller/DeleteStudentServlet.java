package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.dto.Student;

@WebServlet("/deleteStudent")
public class DeleteStudentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		StudentDao sd = new StudentDao();
		sd.deleteStudentbyId(id);
		resp.getWriter().print("<h1>Student Deleted</h1>");
		req.getRequestDispatcher("AdminDashboard.jsp").include(req, resp);
	}
}
