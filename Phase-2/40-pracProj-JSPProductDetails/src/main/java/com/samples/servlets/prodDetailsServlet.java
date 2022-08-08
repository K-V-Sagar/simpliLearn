package com.samples.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samples.model.products;

/**
 * Servlet implementation class prodDetailsServlet
 */
@WebServlet("/prodDetailsServlet")
public class prodDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// creating a list "details" of type products 
	// i.e. it consists objects of class products as elements 
	List<products> details = new ArrayList<>();
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prodID  = request.getParameter("productID");
		String prodName = request.getParameter("productName");
		String quantity = request.getParameter("quantity");
		
		// initialsing the object of class products using the constructor
		products obj = new products(prodID, prodName, quantity );
		// adding the object "obj" to the list "details"
		details.add(obj);
		// Product_details is used in for-each loop in the .jsp file
		request.setAttribute("Product_Details", details);
		// forwarding the request to the .jsp file
		RequestDispatcher rd = request.getRequestDispatcher("/listProdDetails.jsp");
		rd.forward(request, response);
	}

}
