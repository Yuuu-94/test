<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WELCOME</title>
</head>
<body>
名前とパスワードを入力して下さい。
<s:form action="LoginAction">
<s:textfield name="username" label=""/>
<s:password name="password" label=""/>
<s:submit value=""/>
</s:form>
</body>
</html>