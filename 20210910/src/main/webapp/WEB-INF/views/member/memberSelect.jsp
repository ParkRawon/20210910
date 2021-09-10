<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 한명씩 보기</title>
</head>
<body>
	<div align="center">
		<div><h1>회원 상세조회</h1></div>
		<div>
			<table border="1">
				<tr>
					<th width="100">ID</th>
					<td width="100">${member.id }</td>
					<th width="100">PASSWORD</th>
					<td width="100">${member.password }</td>
					<th width="100">NAME</th>
					<td width="100">${member.name }</td>
					<th width="100">AUTH</th>
					<td width="100">${member.auth }</td>
				</tr>
				<tr>
					<th width="200">ADDRESS</th>
					<td colspan="7">${member.address }</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>