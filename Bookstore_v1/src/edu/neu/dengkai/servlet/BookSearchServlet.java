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
		List<String> booksResult = bf.getBooks(request.getParameter("genre"));
		
		String email = getServletContext().getInitParameter("adminEmail");
		
		/*
		// test code v2
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Book Selection Advice<br>");
		
		for (String book : booksResult) {
			out.print("<br>try: " + book);
		}
		*/
		
		HttpSession session = request.getSession();
		synchronized(session) { // keep session attribute thread-safe
			session.setAttribute("books", booksResult);
			session.setAttribute("email", email);
		}
		
		// only request attributes and local variables are thread-safe
		request.setAttribute("books", booksResult);
		request.setAttribute("email", email);
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
				
	}

}
