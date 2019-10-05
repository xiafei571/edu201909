<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo Page</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>
<body>
	<h1>10进制转二进制 - SpringMVC</h1>
	<form:form action="${pageContext.request.contextPath}/demo/ten2binary"
		method="post">
		<label>十进制：</label>
		<input type="text" name="ten_number" value="${ten_number}" />
		<input type="submit" value="转换" />
		<label>二进制：</label>
		<input type="text" name="binary_number" value="${binary_number}" />
	</form:form>


	<h1>10进制转二进制 - AJAX</h1>
	<label>十进制：</label>
	<input type="text" id="ten_number" />
	<input type="button" value="转换" onclick="ten2binary_request()" />
	<label>二进制：</label>
	<input type="text" id="binary_number" />

	<script type="text/javascript">
		function ten2binary_request() {
			var ten_number = $("#ten_number").val();
			$.ajax({
				url : "ten2binary/json",
			    type: "post",
			    data:{"ten_number" : ten_number},
				success : function(result) {
					$("#ten_number").val(result.ten_number);
					$("#binary_number").val(result.binary_number);
				}
			});
		}
	</script>

</body>
</html>