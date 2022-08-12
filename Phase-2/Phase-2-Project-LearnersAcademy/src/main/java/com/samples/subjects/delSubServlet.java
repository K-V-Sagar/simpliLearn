package com.samples.subjects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.samples.domain.MasterClasses;
import com.samples.domain.MasterSubjects;
import com.samples.utils.HibernateUtil;


@WebServlet("/delSubServlet")
public class delSubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterSubjects ms = new MasterSubjects("S03","GK");
		
		session.beginTransaction();
		session.delete(ms);
		session.getTransaction().commit();
		session.close();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Deleted!</h1>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterSubjects ms = new MasterSubjects("S03","GK");
		
		session.beginTransaction();
		session.delete(ms);
		session.getTransaction().commit();
		session.close();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Deleted!</h1>");
	}

}
