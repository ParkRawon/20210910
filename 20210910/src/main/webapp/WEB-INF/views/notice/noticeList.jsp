<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
	<div align="center">
		<div><h1>게시판 목록</h1></div>
		<c:forEach var="notice" items="${notices }">
			${notice.id } : ${notice.writer } : ${notice.writeDate } : ${notice.title } <br/>
		</c:forEach>
	</div>
</body>
</html>