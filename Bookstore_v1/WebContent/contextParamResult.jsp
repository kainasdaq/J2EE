<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Search Result</title>
</head>
<body>
	<h1>Context Param Test</h1>
	<%
		String param = (String)request.getAttribute("contextParam");
		out.print("<br>Context Param: " + param);
	%>
</body>
</html>