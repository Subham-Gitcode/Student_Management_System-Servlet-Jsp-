package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.dto.Student;

@WebServlet("/createStudent")
public class CreateStudentServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");
		
		//System.out.println(name+" "+email+" "+pass+" "+dob+" "+gender);
		Student s = new Student();
		s.setName(name);
		s.setEmail(email);
		s.setPassword(pass);
		s.setDob(dob);
		s.setGender(gender);
		
		StudentDao st =new StudentDao();
		st.saveStudent(s);
		
		resp.getWriter().print("<h1>Student Save Sucessfull</h1>");
		req.getRequestDispatcher("AdminDashboard.jsp").include(req, resp);
		
	}
}
