package edu.neu.dengkai.servlet;

import edu.neu.dengkai.model.*;

import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		ServletContext sc = event.getServletContext();
		String param = sc.getInitParameter("ContextParam");
		ContextParamHandler cph = new ContextParamHandler(param); 
		sc.setAttribute("contextParamHandler", cph);
	}

}
