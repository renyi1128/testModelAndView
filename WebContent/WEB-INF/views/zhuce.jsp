<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ssm/register" method="post">
		<table>
			<tr>
				<th>用户注册</th>
			</tr>
		
			<tr>
				<td>请输入账号：</td>
				<td><input type="text" value="" name="username"/></td>
			</tr>
		
			<tr>
				<td>请输入密码：</td>
				<td><input type="password" value="" name="password"/></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="注册" /></td>
				<td><input type="reset" value="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>