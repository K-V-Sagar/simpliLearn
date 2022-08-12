package com.samples.subjects;

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

import com.samples.domain.MasterSubjects;
import com.samples.utils.HibernateUtil;


@WebServlet("/modSubServlet")
public class modSubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	List<MasterSubjects> msList = new ArrayList<>();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterSubjects ms = new MasterSubjects("S03","GK");
		
		session.beginTransaction();
		session.update(ms);
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		msList.add(ms);
		request.setAttribute("Subjects_List", msList);
					
		RequestDispatcher rd = request.getRequestDispatcher("/listSubjects.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterSubjects ms = new MasterSubjects("S03","GK");
		
		session.beginTransaction();
		session.update(ms);
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		msList.add(ms);
		request.setAttribute("Subjects_List", msList);
					
		RequestDispatcher rd = request.getRequestDispatcher("/listSubjects.jsp");
		rd.forward(request, response);
	}

}
