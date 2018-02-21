<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
	<script src = "${js}/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>
	<button id="btn">
		ㅎㅇ
	</button>
<P>  The time on the server is ${serverTime}. </P>
<script>
	$('#btn').on('click',function(){
		alert('제이쿼리가 작동함');
	});
</script>
</body>
</html>
