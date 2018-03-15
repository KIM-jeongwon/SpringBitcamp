<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<head>
	<meta charset="UTF-8" />
	<h1>마이페이지</h1>
</head>
<body>
<article>
</article>
<script src = "${path.js}/jquery-3.3.1.min.js"></script>
<table id = "mypage_table">
<tr id ="mypage_table tr">
	<td rowspan="5"><img src="${path.image}/common/profile_0.jpg">
	</td>
	<td class="title">ID</td>
	<td>${user.id}</td>
	<td>PW</td>
	<td>${user.pass}</td>
</tr>
<tr>
	<td class="title">NAME</td>
	<td>${user.name}</td>
	<td>GENDER</td>
	<td></td>
</tr>
<tr>
	<td class="title">BIRTH</td>
	<td></td>
	<td>E-MAIL</td>
	<td>${user.email}</td>
</tr>
<tr>
	<td class="title">PHONE</td>
	<td id ="td-phone">
	
	</td>
	<td>ADDRESS</td>
	<td></td>
</tr>
<tr>
	<td class="title" >ACCOUNT</td>
	<td >${user.account}</td>
	<td>D-A-T-E</td>
	<td></td>
</tr>
</table>
<button id = "btn_change_pass">비번 변경</button>
<button id = "btn_delete_btn">회원 탈퇴</button>
<script>

$(function(){
	var phone =("${phone}"==="") ? "개통하기" : "010-1234-5678";
		$('#td-phone').html('<a href="#" id="td-phone">010-5566-9840</a>');
		
	 $('#btn_change_pass').on('click',function(){
		 alert('마이페이지 확인');
		 location.href = "${path.context}/move/common/nav"
	 });
});

$('#td-phone').on('click',function(){
	alert('폰개통?');
	var phone =$('#mypage_phone').val();
	location.href='${path.context}/mobile/shop';
}); 
</script>