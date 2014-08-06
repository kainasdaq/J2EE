package edu.neu.dengkai.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import edu.neu.dengkai.model.*;
	
public class BookSearchServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		/*	
		// test code v1
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Book Selection Advice<br>");
		String c = request.getParameter("genre");
		out.println("<br>Got book genre <b>" + c + "</b>");
		*/
		
		BookFinder bf = new BookFinder();
		List<String> books = bf.getBooks(request.getParameter("genre"));
		
		// test code v2
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Book Selection Advice<br>");
		
		for (String book : books) {
			out.print("<br>try: " + book);
		}
				
	}

}