<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloServlet</title>
</head>
<body>
<input type="button" value="HelloServlet" onClick="location.href='HelloServlet'">

<input type="button" value="WelcomeServlet" onClick="location.href='welcome.jsp'">

<input type="button" value="お問い合わせフォーム" onClick="location.href='inquiry.jsp'"><br>


GET通信
<form method="get" action="TestServlet">
<input type="text" name="username">
<input type="password" name="password">
<input type="submit" name="送信">
</form>

POST通信
<form method="get" action="TestServlet">
<input type="text" name="username">
<input type="password" name="password">
<input type="submit" name="送信">
</form>

</body>
</html>