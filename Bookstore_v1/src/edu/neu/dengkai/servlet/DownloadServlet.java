package edu.neu.dengkai.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class DownloadServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		
		response.setContentType("application/pdf");
		
		ServletContext ctx = getServletContext();
		InputStream inputStream = ctx.getResourceAsStream("/downloads/MVC Tasks.pdf");
		
		int readLen = 0;
		byte[] buffer = new byte[4096];
		
		OutputStream outputStream = response.getOutputStream();
		while ((readLen = inputStream.read(buffer)) != -1) {
			outputStream.write(buffer, 0, readLen);
		}
		
		outputStream.flush();
		outputStream.close();
		
	}

}
