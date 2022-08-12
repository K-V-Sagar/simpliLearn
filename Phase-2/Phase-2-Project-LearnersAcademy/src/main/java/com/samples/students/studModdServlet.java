package com.samples.students;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.samples.domain.MasterStudents;
import com.samples.utils.HibernateUtil;


@WebServlet("/studModdServlet")
public class studModdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	List<MasterStudents> mstuList = new ArrayList<>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterStudents mstu = new MasterStudents("ST06","Candance");
		
		session.beginTransaction();
		session.update(mstu);
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		mstuList.add(mstu);
		request.setAttribute("Students_List", mstuList);
					
		RequestDispatcher rd = request.getRequestDispatcher("/listStudents.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterStudents mstu = new MasterStudents("ST06","Candance");
		
		session.beginTransaction();
		session.update(mstu);
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		mstuList.add(mstu);
		request.setAttribute("Students_List", mstuList);
					
		RequestDispatcher rd = request.getRequestDispatcher("/listStudents.jsp");
		rd.forward(request, response);
	}

}
