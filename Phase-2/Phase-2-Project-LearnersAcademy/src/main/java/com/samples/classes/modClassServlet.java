package com.samples.classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.hibernate.Session;

import com.samples.domain.MasterClasses;
import com.samples.domain.MasterTeachers;
import com.samples.utils.HibernateUtil;


@WebServlet("/modClassServlet")
public class modClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	List<MasterClasses> mcList = new ArrayList<>();
	
	 @Transactional
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterClasses mc = new MasterClasses("C03","Class III");
		
		session.beginTransaction();
		session.update(mc);
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		mcList.add(mc);
		request.setAttribute("Classes_List", mcList);
					
		RequestDispatcher rd = request.getRequestDispatcher("/listClasses.jsp");
		rd.forward(request, response);
	}

	 @Transactional
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterClasses mc = new MasterClasses("C03","Class III");
		
		session.beginTransaction();
		session.update(mc);
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		mcList.add(mc);
		request.setAttribute("Classes_List", mcList);
					
		RequestDispatcher rd = request.getRequestDispatcher("/listClasses.jsp");
		rd.forward(request, response);
	}

}
