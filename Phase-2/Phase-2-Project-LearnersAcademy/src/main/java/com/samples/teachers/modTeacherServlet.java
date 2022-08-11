package com.samples.teachers;

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

import com.samples.domain.MasterTeachers;
import com.samples.utils.HibernateUtil;

@WebServlet("/modTeacherServlet")
public class modTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<MasterTeachers> mtList = new ArrayList<>();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterTeachers mt = new MasterTeachers("T03","Solomon");
		
		session.beginTransaction();
		session.update(mt);
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		mtList.add(mt);
		request.setAttribute("Teachers_List", mtList);
					
		RequestDispatcher rd = request.getRequestDispatcher("/listTeachers.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterTeachers mt = new MasterTeachers("T03","Solomon");
		
		session.beginTransaction();
		session.update(mt);
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		mtList.add(mt);
		request.setAttribute("Teachers_List", mtList);
							
		RequestDispatcher rd = request.getRequestDispatcher("/listTeachers.jsp");
		rd.forward(request, response);
		
	}

}
