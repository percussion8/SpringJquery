<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Green들</title>
</head>
<body>

<c:forEach items="${greens }" var="green">
	<ul>
		<li>
			<a class="get" href="<c:out value='${green.gid }'/>"><c:out value='${green.gid }'/></a>
			<c:out value='${green.name }' />
			<c:out value='${green.korea }' />
			<c:out value='${green.math }' />
			<button id="gomod" onclick="location.href='/green/one?gid=${green.gid }'">수정</button>
		</li>
	</ul>
</c:forEach>

</body>
<script>
	$(document).ready(function() {
		$(".get").click(function (e) {
			console.log($(this).attr("href"));
			$(this).attr("href", "/green/one?gid="+$(this).attr("href"));
		});
	});
	
</script>


</html>