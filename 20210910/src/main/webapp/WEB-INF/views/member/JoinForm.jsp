<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입창</title>
</head>
<body>
	<div align="center">
		<div><h1>JOIN</h1></div>
		<div>
			<form id="frm" name="frm" action="memberJoin.do" method="post">
				<div>
				<table border="1">
					<tr>
						<th align="center" width="100">ID</th>
						<td width="300">
							<input type="text" id="id" name="id">
						</td>
					</tr>
					<tr>
						<th align="center" width="100">PASSWORD</th>
						<td width="300">
							<input type="password" id="password" name="password">
						</td>
					</tr>
					<tr>
						<th align="center" width="100">NAME</th>
						<td width="300">
							<input type="text" id="name" name="name">
						</td>
					</tr>
					<tr>
						<th align="center" width="100">ADDRESS</th>
						<td width="300">
							<input type="text" id="address" name="address" size="30">
						</td>
					</tr>
				</table>
				</div><br/>
				<div>
					<input type="submit" value="회원가입">&nbsp;&nbsp;&nbsp;
					<input type="reset" value="취소">&nbsp;&nbsp;&nbsp;
					<input type="button" value="HOME" onclick="location.href='home.do'">
				</div>
			</form>
		</div>
	</div>
</body>
</html>