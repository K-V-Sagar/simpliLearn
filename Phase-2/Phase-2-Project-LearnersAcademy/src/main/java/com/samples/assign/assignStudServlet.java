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
import com.samples.domain.MasterStudents;
import com.samples.utils.HibernateUtil;


//****************************
//Assign Students to Classes
//One Class Many Students
//****************************

@WebServlet("/assignStudServlet")
public class assignStudServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	List<MasterStudents> mstuList = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterClasses mc1 = new MasterClasses("C01","Class 1");
		MasterStudents mstu1 = new MasterStudents("ST01","Helen",mc1);
		
		MasterClasses mc2 = new MasterClasses("C02","Class 2");
		MasterStudents mstu2 = new MasterStudents("ST02","Iyan",mc2);
		MasterStudents mstu3 = new MasterStudents("ST03","Phineas",mc2);
		
		MasterClasses mc3 = new MasterClasses("C03","Class 3");
		MasterStudents mstu4 = new MasterStudents("ST04","Ferb",mc3);
		MasterStudents mstu5 = new MasterStudents("ST05","Rick",mc3);
		
		session.beginTransaction();
		session.update(mstu1);
		session.update(mstu2);
		session.update(mstu3);
		session.update(mstu4);
		session.update(mstu5);
		
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		mstuList.add(mstu1);
		mstuList.add(mstu2);
		mstuList.add(mstu3);
		mstuList.add(mstu4);
		mstuList.add(mstu5);
		
		RequestDispatcher rd = request.getRequestDispatcher("/viewFullStudServlet");
		rd.forward(request, response);

		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		MasterClasses mc1 = new MasterClasses("C01","Class 1");
		MasterStudents mstu1 = new MasterStudents("ST01","Helen",mc1);
		
		MasterClasses mc2 = new MasterClasses("C01","Class 2");
		MasterStudents mstu2 = new MasterStudents("ST02","Iyan",mc2);
		MasterStudents mstu3 = new MasterStudents("ST03","Phineas",mc2);
		
		MasterClasses mc3 = new MasterClasses("C01","Class 3");
		MasterStudents mstu4 = new MasterStudents("ST04","Ferb",mc3);
		MasterStudents mstu5 = new MasterStudents("ST05","Rick",mc3);
		
		session.beginTransaction();
		session.update(mstu1);
		session.update(mstu2);
		session.update(mstu3);
		session.update(mstu4);
		session.update(mstu5);
		
		session.getTransaction().commit();
		session.close();
		
		// saves data to the mtList
		mstuList.add(mstu1);
		mstuList.add(mstu2);
		mstuList.add(mstu3);
		mstuList.add(mstu4);
		mstuList.add(mstu5);
		
		RequestDispatcher rd = request.getRequestDispatcher("/viewFullStudServlet");
		rd.forward(request, response);

		
	}

}
