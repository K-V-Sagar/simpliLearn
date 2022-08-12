package com.samples.subjects;

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
import com.samples.domain.MasterSubjects;
import com.samples.utils.HibernateUtil;

@WebServlet("/addSubServlet")
public class addSubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<MasterSubjects> msList = new ArrayList<>();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();
			
			MasterSubjects ms = new MasterSubjects("S03","History");
		
			session.persist(ms);
			
			txn.commit();
			
			// saves data to the mtList
			msList.add(ms);
			request.setAttribute("Subjects_List", msList);
			
			RequestDispatcher rd = request.getRequestDispatcher("/listSubjects.jsp");
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
			
			MasterSubjects ms = new MasterSubjects("S03","History");
		
			session.persist(ms);
			
			txn.commit();
			
			// saves data to the mtList
			msList.add(ms);
			request.setAttribute("Subjects_List", msList);
			
			RequestDispatcher rd = request.getRequestDispatcher("/listSubjects.jsp");
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


