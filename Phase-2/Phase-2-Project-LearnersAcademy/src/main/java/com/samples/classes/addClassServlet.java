package com.samples.classes;

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
import org.hibernate.Transaction;

import com.samples.domain.MasterClasses;
import com.samples.domain.MasterTeachers;
import com.samples.utils.HibernateUtil;


@WebServlet("/addClassServlet")
public class addClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	List<MasterClasses> mcList = new ArrayList<>();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();
			
			MasterClasses mc = new MasterClasses("C03","Class 3");
		
			session.persist(mc);
			
			txn.commit();
			
			// saves data to the mtList
			mcList.add(mc);
			request.setAttribute("Classes_List", mcList);
			
			RequestDispatcher rd = request.getRequestDispatcher("/listClasses.jsp");
			rd.forward(request, response);
			
			PrintWriter out =response.getWriter();
			out.println("Operation Complete!");
			
		} catch (Exception ex) {
			if (txn != null) {
				txn.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();
			
			MasterClasses mc = new MasterClasses("C03","Class 3");
		
			session.persist(mc);
			
			txn.commit();
			
			// saves data to the mtList
			mcList.add(mc);
			request.setAttribute("Classes_List", mcList);
			
			RequestDispatcher rd = request.getRequestDispatcher("/listClasses.jsp");
			rd.forward(request, response);
			
			PrintWriter out =response.getWriter();
			out.println("Operation Complete!");
			
		} catch (Exception ex) {
			if (txn != null) {
				txn.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
	}

}
