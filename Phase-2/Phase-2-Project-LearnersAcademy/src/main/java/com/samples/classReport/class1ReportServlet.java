package com.samples.classReport;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/class1ReportServlet")
public class class1ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection connection;

	@Override
	public void init() throws ServletException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/learnersacademy", "root", "admin");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		System.out.println("doGet");
		try (Statement statement = connection.createStatement();) {
			
			// Table 1
			// using ResultSet to store the result and then print using the results object
			ResultSet results = statement.executeQuery("SELECT b.classID, b.className, d.subjectID,"
					+ " d.subjectName FROM masterclasses b JOIN mastersubjects d ON b.classID = d.classID"
					+ " WHERE b.classID='C01' ORDER BY b.classID;");
			PrintWriter out = response.getWriter();
			
			out.println("<h1>Class 1 Report:</h1>");
			out.println("<h3>Class - Subject</h3>");
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>Class ID</th>");
			out.println("<th>Class Name</th>");
			out.println("<th>Subject ID</th>");
			out.println("<th>Subject Name</th>");
			out.println("</tr>");
			while (results.next()) {
				out.println("<tr>");
				out.println("<td>" + results.getString(1) + "</td>");
				out.println("<td>" + results.getString(2) + "</td>");
				out.println("<td>" + results.getString(3) + "</td>");
				out.println("<td>" + results.getString(4) + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
			
			
			// Table 2
			// using ResultSet to store the result and then print using the results object
			ResultSet results1 = statement.executeQuery("SELECT b.classID, b.className, c.studentID,"
					+ "c.studentName FROM masterclasses b JOIN masterstudents c ON b.classID = c.classID "
					+ "WHERE b.classID='C01' ORDER BY b.classID;");
			PrintWriter out1 = response.getWriter();
			
			out1.println("<h3>Class - Student</h3>");
			out1.println("<table>");
			out1.println("<tr>");
			out1.println("<th>Class ID</th>");
			out1.println("<th>Class Name</th>");
			out1.println("<th>Student ID</th>");
			out1.println("<th>Student Name</th>");
			out1.println("</tr>");
			while (results1.next()) {
				out1.println("<tr>");
				out1.println("<td>" + results1.getString(1) + "</td>");
				out1.println("<td>" + results1.getString(2) + "</td>");
				out1.println("<td>" + results1.getString(3) + "</td>");
				out1.println("<td>" + results1.getString(4) + "</td>");
				out1.println("</tr>");
			}
			out1.println("</table>");
			
			
			// Table 3
			// using ResultSet to store the result and then print using the results object
			ResultSet results2 = statement.executeQuery("SELECT b.classID, b.className, a.teacherID,"
					+ " a.teacherName FROM masterclasses b JOIN masterteachers a ON b.teacherID = a.teacherID"
					+ " WHERE b.classID='C01' ORDER BY b.classID;");
			PrintWriter out2 = response.getWriter();
			
			out2.println("<h3>Class - Teacher</h3>");
			out2.println("<table>");
			out2.println("<tr>");
			out2.println("<th>Class ID</th>");
			out2.println("<th>Class Name</th>");
			out2.println("<th>Teacher ID</th>");
			out2.println("<th>Teacher Name</th>");
			out2.println("</tr>");
			while (results2.next()) {
				out2.println("<tr>");
				out2.println("<td>" + results2.getString(1) + "</td>");
				out2.println("<td>" + results2.getString(2) + "</td>");
				out2.println("<td>" + results2.getString(3) + "</td>");
				out2.println("<td>" + results2.getString(4) + "</td>");
				out2.println("</tr>");
			}
			out2.println("</table>");

			

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
