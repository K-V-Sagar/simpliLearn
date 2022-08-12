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
import com.samples.domain.MasterSubjects;
import com.samples.utils.HibernateUtil;



// ****************************
// Assign Classes for Subjects
// One Class Many Subjects
// ****************************

@WebServlet("/assignSubServlet")
public class assignSubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	List<MasterSubjects> msList = new ArrayList<>();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterClasses mc1 = new MasterClasses("C01","Class 1");
		MasterSubjects ms1 = new MasterSubjects("S01","Mathematics", mc1);
		
		MasterClasses mc2 = new MasterClasses("C02","Class 2");
		MasterSubjects ms2 = new MasterSubjects("S03","English",mc2);
		MasterSubjects ms3 = new MasterSubjects("S04","II Language",mc2);
		MasterSubjects ms4 = new MasterSubjects("S06","Mathematics II",mc2);
		
		MasterClasses mc3 = new MasterClasses("C03","Class 3");
		MasterSubjects ms5 = new MasterSubjects("S02","EVS",mc3);
		MasterSubjects ms6 = new MasterSubjects("S05","III Language",mc3);
		MasterSubjects ms7 = new MasterSubjects("S07","Mathematics III",mc3);
		MasterSubjects ms8 = new MasterSubjects("S08","English II",mc3);
		
		session.beginTransaction();
		session.update(ms1);session.update(ms2);
		session.update(ms3);session.update(ms4);
		session.update(ms5);session.update(ms6);
		session.update(ms7);session.update(ms8);
		
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		msList.add(ms1);msList.add(ms2);
		msList.add(ms3);msList.add(ms4);
		msList.add(ms5);msList.add(ms6);
		msList.add(ms7);msList.add(ms8);
		//request.setAttribute("Subjects_List", msList);
					
		RequestDispatcher rd = request.getRequestDispatcher("/viewFullSubServlet");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterClasses mc1 = new MasterClasses("C01","Class 1");
		MasterSubjects ms1 = new MasterSubjects("S01","Mathematics", mc1);
		
		MasterClasses mc2 = new MasterClasses("C02","Class 2");
		MasterSubjects ms2 = new MasterSubjects("S03","English",mc2);
		MasterSubjects ms3 = new MasterSubjects("S04","II Language",mc2);
		MasterSubjects ms4 = new MasterSubjects("S06","Mathematics II",mc2);
		
		MasterClasses mc3 = new MasterClasses("C03","Class 3");
		MasterSubjects ms5 = new MasterSubjects("S02","EVS",mc3);
		MasterSubjects ms6 = new MasterSubjects("S05","III Language",mc3);
		MasterSubjects ms7 = new MasterSubjects("S07","Mathematics III",mc3);
		MasterSubjects ms8 = new MasterSubjects("S08","English II",mc3);
		
		session.beginTransaction();
		session.update(ms1);session.update(ms2);
		session.update(ms2);session.update(ms4);
		session.update(ms5);session.update(ms6);
		session.update(ms7);session.update(ms8);
		
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		msList.add(ms1);msList.add(ms2);
		msList.add(ms3);msList.add(ms4);
		msList.add(ms5);msList.add(ms6);
		msList.add(ms7);msList.add(ms8);
		//request.setAttribute("Subjects_List", msList);
					
		RequestDispatcher rd = request.getRequestDispatcher("/viewFullSubServlet");
		rd.forward(request, response);
	}

}
