package com.samples.assign;

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

import com.samples.domain.MasterClasses;
import com.samples.domain.MasterTeachers;
import com.samples.utils.HibernateUtil;




// ****************************
// Assign Teachers to a class
// One Teacher Many Classes
// ****************************

@WebServlet("/assignClassServlet")
public class assignClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	List<MasterClasses> mcList = new ArrayList<>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterTeachers mt = new MasterTeachers("T01","Mark");
		MasterClasses mc1 = new MasterClasses("C01","Class 1", mt);
		MasterClasses mc2 = new MasterClasses("C02","Class 2", mt);
		
		MasterTeachers mt1 = new MasterTeachers("T02","Glen");
		MasterClasses mc3 = new MasterClasses("C03","Class 3", mt1);
		
		session.beginTransaction();
		session.update(mc1);
		session.update(mc2);
		session.update(mc3);
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		mcList.add(mc1);
		mcList.add(mc2);
		mcList.add(mc3);
		//request.setAttribute("FullClasses_List", mcList);
					
		RequestDispatcher rd = request.getRequestDispatcher("/viewFullClassServlet");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterTeachers mt = new MasterTeachers("T01","Mark");
		MasterClasses mc1 = new MasterClasses("C01","Class 1", mt);
		MasterClasses mc2 = new MasterClasses("C02","Class 2", mt);
		
		MasterTeachers mt1 = new MasterTeachers("T02","Glen");
		MasterClasses mc3 = new MasterClasses("C03","Class 3", mt1);
		
		session.beginTransaction();
		session.update(mc1);
		session.update(mc2);
		session.update(mc3);
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		mcList.add(mc1);
		mcList.add(mc2);
		mcList.add(mc3);
		request.setAttribute("Classes_List", mcList);
					
		RequestDispatcher rd = request.getRequestDispatcher("/viewFullClassServlet");
		rd.forward(request, response);
	}

}
