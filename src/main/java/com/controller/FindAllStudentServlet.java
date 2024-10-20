package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.dto.Student;

@WebServlet("/findAllStudent")
public class FindAllStudentServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao sd = new StudentDao();
		List<Student> listofstudent  = sd.findall();
		req.getSession().setAttribute("listofstudent", listofstudent);
		req.getRequestDispatcher("findAll.jsp").include(req, resp);
	}
}
