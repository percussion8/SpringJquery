<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>One Green</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<form id="modform" action="/green/modify" method="post">
	번호=><input name="gid" value="${one.gid }" readonly="readonly"><br>
	이름=><input name="name" value="${one.name }" readonly="readonly"><br>
	국어=><input name="korea" value="${one.korea }"><br>
	수학=><input name="math" value="${one.math }"><br>
</form>
<button type="button" id="change">수정완료</button>
<button type="button" id="list">목록</button>

</body>

<script>
$(document).ready(function() {
	
	$("#change").on("click", function() {
		$("#modform").submit();
	});
	$("#list").on("click", function() {
		self.location="/green/list";
	});
	
})
</script>
</html>