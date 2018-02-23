<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
	<%@ include file = "../common/header.jsp" %>
	<body>
		<div id="wrapper">
			<header id="index_header">
					<h1>BIT CAMP SAMPLE PROJECT</h1>
			</header>
				<section>
					<article>
<table id ="index_table">
		<tr>
			<td colspan="5">
			<script src = "${js}/jquery-3.3.1.min.js"></script>
			<form id="login_form" action="mypage">
});
					<table >
						<tr id="index_Login_box">
							<td >
							<input  id="index_input_id" name="id" type="text" placeholder="ID 입력" />
							</td>
							<td rowspan="2">
							<input type="submit" id="index_login_btn" value="로그인" />
							</td>
						</tr>
						<tr id="index_Login_box">
							<td><input id="index_input_pass" name = "pass" type="text" placeholder="PASSWORD 입력" />
							<input type="hidden" name="cmd" value="login"/>
							<input type="hidden" name="page" value="mypage" />
						</td>
						</tr>
					</table>
				</form>
				<a id="go_admin_link" href="#">관리자</a>
				<a id="go_join_link" href="#">회원가입</a>
				<a id="go_jdbc_link" href="#">JDBC test</a>
			</td>
		  </tr>
	   </table>
   </article>
</section>
</div>
<%@ include file = "../common/footer.jsp" %>
<script>


function login(){
	alert('click');
	document.querySelector('#login_form').submit();
}

</script>
</body>
</html>
