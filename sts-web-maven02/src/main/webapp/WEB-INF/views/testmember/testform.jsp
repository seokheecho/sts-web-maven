<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>testmember 등록</title>
</head>
<body>
<h1>${name}님 환영합니다!</h1>
<h1>TestMember 등록</h1>
<form action="add" method="post">
<table border='1'>
<tr>
    <th>아이디</th><td><input type="text" name="id"></td>
</tr>
<tr>
    <th>이메일</th><td><input type="email" name="email"></td>
</tr>
<tr>
    <th>암호</th><td><input type="password" name="password"></td>
</tr>
</table>
<button>등록</button>

</form>

</body>
</html>