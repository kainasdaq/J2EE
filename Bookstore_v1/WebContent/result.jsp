<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Search Result</title>
</head>
<body>
	<h1>Book Recommendations JSP</h1>
	<p>
		<%@ page import="java.util.*"%>
		<%
			List<String> books = (List<String>) request.getAttribute("books");
			for (String s : books) {
				out.print("<br>try: " + s);
			}
		%>
	</p>
	<% 
		out.print("<br>Admin email: " + request.getAttribute("email"));
	%>
</body>
</html>