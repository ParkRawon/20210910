<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>게시판 목록</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<div class="container">
		<div align="center"><h2>게시판</h2></div>
		<div>
			<table class="table table-striped">
				<tr>
					<th>ID</th>
					<th>Writer</th>
					<th>Title</th>
					<th>Date</th>
				</tr>
				<c:forEach var="notice" items="${notices }">
				<tr onclick="location.href='memberSelect.do'">						
					<td>${notice.id }</td>
					<td>${notice.writer }</td>
					<td>${notice.title }</td>
					<td>${notice.writeDate }</td>
				</tr>	
				</c:forEach>			
			</table>
		</div><br/>
		<div>
			<form id="frm" name="frm" action="" method="post">
				<input type="button" onclick="location.href='home.do'" value="HOME"> 
			</form>
		</div>
	</div>
</body>
</html>