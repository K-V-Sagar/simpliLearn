package com.samples.teachers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.samples.domain.MasterTeachers;
import com.samples.utils.HibernateUtil;


@WebServlet("/delTeacherServlet")
public class delTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterTeachers mt = new MasterTeachers("T03","Solomon");
		
		session.beginTransaction();
		session.delete(mt);
		session.getTransaction().commit();
		session.close();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Deleted!</h1>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterTeachers mt = new MasterTeachers("T03","Solomon");
		
		session.beginTransaction();
		session.delete(mt);
		session.getTransaction().commit();
		session.close();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Deleted!</h1>");
		
	}

}
