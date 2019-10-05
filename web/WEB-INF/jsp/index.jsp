<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Hello</h1>
    
	<table border="1">
		<thead>
			<tr>
				<th>1.USERID</th>
				<th>2.USERNAME</th>
				<th>3.AGE</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="p">
				<tr>
					<td>${p.userId}</td>
					<td>${p.userName}</td>
					<td>${p.age}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>