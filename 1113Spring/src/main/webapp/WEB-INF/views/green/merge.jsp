<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
</head>
<body>
<form action="" method="" class="enterform">
	first character: <input type="text" name="one">
	second character: <input type="text" name="two">
	<input type="hidden" id="repeat" name="repeat" value="">
</form>
<br>
<hr>
<br>
<div>
	<input type="number" id ="f" value="1"><br>
	<input type="number" id ="s" value="2"><br>
	<input type="number" id ="th" value="3"><br>
</div>
<br>
<button type="button" class="click">Click</button><br>
<br>
<c:forEach items="${merges }" var="mergs">
	<c:out value="${mergs.merged }"/><br>
</c:forEach>

</body>

<script>
	$(document).ready(function() {
		$(".click").on("click", function() {
			var tot = parseInt($("#f").val()) + parseInt($("#s").val()) + parseInt($("#th").val());
			$("#repeat").val(tot);
			$(".enterform").attr("action", "/green/merge").attr("method", "post").submit();
		});
	});
</script>
</html>