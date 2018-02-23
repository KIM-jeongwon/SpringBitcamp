<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
	<script src = "${js}/jquery-3.3.1.min.js"></script>

</head>
<body>
<h1>
	
</h1>
	<button id="btn">
		로그인
	</button>
<P> 레이아웃 </P>
<script>
	$('#btn').on('click',function(){
	
		location.href = "${context}/login"
	});
</script>
</body>
</html>
