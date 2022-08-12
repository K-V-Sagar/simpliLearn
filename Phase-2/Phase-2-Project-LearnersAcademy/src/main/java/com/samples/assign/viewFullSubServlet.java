package com.samples.assign;

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


@WebServlet("/viewFullSubServlet")
public class viewFullSubServlet extends HttpServlet {
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
			
			// using ResultSet to store the result and then print using the results object
			ResultSet results = statement.executeQuery("select * from MasterSubjects");
			PrintWriter out = response.getWriter();
			
			out.println("<h1>Subjects assinged...</h1>");
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>Subject ID</th>");
			out.println("<th>Subject Name</th>");
			out.println("<th>Class ID</th>");
			out.println("</tr>");
			while (results.next()) {
				out.println("<tr>");
				out.println("<td>" + results.getString(1) + "</td>");
				out.println("<td>" + results.getString(2) + "</td>");
				out.println("<td>" + results.getString(3) + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			

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
