<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
	<%@ include file = "../common/nav.jsp" %>
<head>
	<meta charset="UTF-8" />
	<h1>마이페이지</h1>
</head>
<body>
<article>
</article>
<script src = "${js}/jquery-3.3.1.min.js"></script>
<form action="change_form">
<table id = "mypage_table">
<tr id ="mypage_table tr">
	<td rowspan="5"><img src="<%=application.getContextPath()%>/resources/img/images.jpg"
							id = "img" alt="" />  </td>
	<td class="title">ID</td>
	<td>${sessionScope.member.id}</td>
	<td>PW</td>
	<td>${sessionScope.member.pass}</td>
</tr>
<tr>
	<td class="title">NAME</td>
	<td>${sessionScope.member.name}</td>
	<td>GENDER</td>
	<td>${sessionScope.member.ssn}</td>
</tr>
<tr>
	<td class="title">BIRTH</td>
	<td>${sessionScope.member.ssn}</td>
	<td>E-MAIL</td>
	<td>${sessionScope.member.email}</td>
</tr>
<tr>
	<td class="title">PHONE</td>
	<td>${sessionScope.member.mobile.mobilenum}</td>
	<td>ADDRESS</td>
	<td>${sessionScope.member.addr}</td>
</tr>
<tr>
	<td class="title" >ACCOUNT</td>
	<td >${sessionScope.account.accountNum}</td>
	<td>D-A-T-E</td>
	<td>${sessionScope.member.mobile.regdate}</td>
</tr>
</table>
</form>
<button id = "change_pass">비번 변경</button>
<button id = "delete_btn">회원 탈퇴</button>
<button id = "nav_btn">네비로간다@</button>
<script>
 $('#nav_btn').on('click',function(){
	 
	 location.href = "${context}/nav"
 });
</script>
</body>
</html>