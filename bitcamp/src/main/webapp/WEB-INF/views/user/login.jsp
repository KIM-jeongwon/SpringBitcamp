<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

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
			<script src = "${path.js}/jquery-3.3.1.min.js"></script>
					<table >
						<tr id="index_Login_box">
							<td >
							  <input id="index_input_id" class="form-control" placeholder="Id를 입력하세요.."
							   name="id" value ="lokky"type="email" autofocus>
							</td>							
							<td rowspan="2">
							<input type="submit" id="index_login_btn" value="로그인" />
							</td>
						</tr>
						<tr id="index_Login_box">						   
							<td>   <input id="index_input_pass" class="form-control" 
							placeholder="Password를 입력하세요." value ="1" name="pass" type="password" >
							<input type="hidden" name="cmd" value="login"/>
							<input type="hidden" name="page" value="mypage" />							
						</td>						
						</tr>
					</table>
				<a id="go_admin_link" href="#">관리자</a>
				<a id="go_join_link" href="#">회원가입</a>
				<a id="go_jdbc_link" href="#">JDBC test</a>
			</td>
		  </tr>
	   </table>
   </article>
</section>
</div>
<script>

$('#index_login_btn').on('click', function(){
	  var id = $('#index_input_id').val();
	  var password = $('#index_input_pass').val();
	  location.href = '${path.context}/login/'+id+'/'+password;
	});
</script>
</body>
</html>
