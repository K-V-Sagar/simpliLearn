package com.samples.classes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.samples.domain.MasterClasses;
import com.samples.domain.MasterTeachers;
import com.samples.utils.HibernateUtil;


@WebServlet("/delClassServlet")
public class delClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterClasses mc = new MasterClasses("C04","Class IV");
		
		session.beginTransaction();
		session.delete(mc);
		session.getTransaction().commit();
		session.close();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Deleted!</h1>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterClasses mc = new MasterClasses("C04","Class IV");
		
		session.beginTransaction();
		session.delete(mc);
		session.getTransaction().commit();
		session.close();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Deleted!</h1>");
	}

}
