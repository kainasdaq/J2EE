package edu.neu.dengkai.servlet;

import edu.neu.dengkai.model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServletContextServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
			ContextParamHandler cph = (ContextParamHandler) getServletContext().getAttribute("contextParamHandler");
			
			request.setAttribute("contextParam", cph.getParam());
			RequestDispatcher view = request.getRequestDispatcher("contextParamResult.jsp");
			view.forward(request, response);
	}
	

}
