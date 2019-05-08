<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>TEST</title>
</head>
<body>
<p>こんにちは！</p>
<% out.println(new java.util.Date()); %>
<%!
static int add(int a, int b){
	return a+b;
}
%>
</body>
</html>