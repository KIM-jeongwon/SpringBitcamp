<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>
 <style>
    .navbar-brand {
        padding-top: 3px;
    }
   .bg{
   	background-image:url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwXFUPbUfqy7yqG5ARE9421ySDP_tsFBrWb15x0_F1NRGrTjp_");
   }
</style>
<div class="jumbotron bg" style="margin-bottom:0">
 <h2 style="color:white">BITCAMP</h2>
</div>
    <nav class="navbar navbar-default">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" 
          data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">
          <img src ="${path.image}/common/logo3.jpg"></img>	
          </a> 
        </div>
        <div id="navbar" class="collapse navbar-collapse">
         
          <ul class="nav navbar-nav">
            <li class="active">
            <a id = "a-home" href="#">
				<span class="glyphicon glyphicon-home" aria-hidden="true">&nbsp;Home</span>
		</a>
		</li>
            <li>
            <a href="#">
            	<span class="glyphicon glyphicon-question-sign" aria-hidden="true">&nbsp;About</span>
        </a>
        </li>
          <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
			<c:choose>
                <c:when test="${user == null}">
                    <li>
                        <a id="a-login" href="#"> 
                            <span class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;LOGIN</span>
                        </a>
                    </li>
                    <li>
        				<a id="a-join" href="#" >
        					<span class="glyphicon glyphicon-question-sign" aria-hidden="true">&nbsp;JOIN</span>        	
        				</a>
        			</li>
                </c:when>
               <c:otherwise>
                    <li>
                        <a id="a-logout" href="#">
                            <span class="glyphicon glyphicon-remove-circle" aria-hidden="true">&nbsp;LOGOUT</span>
                        </a>
                    </li>                
               </c:otherwise>
            </c:choose>
        
		 <li class="dropdown">
		 <a href="#" class="dropdown-toggle" 
			 data-toggle="dropdown" 
			 role="button" 
			 aria-haspopup="true" 
			 aria-expanded="false">
				 유틸리티
			 <span class="caret">
		 	</span>
		 </a>
		 <ul id="ul-util" >
		 	<li><a>로또</a></li>
		 	<li><a>햄버거주문</a></li>
	   	  </ul>
	    </li> 
	   <li>
            <a id="span-board" href="#">
            	<span class="glyphicon glyphicon-question-sign" aria-hidden="true">&nbsp;Community</span>
        </a>
        </li>
	  </ul>
   </div> <!-- /example -->		<!-- 드롭다운 LAST -->     
   </div>
 </nav>
<script>

	var $ulUtil=$("#ul-util").addClass("dropdown-menu");
	$('.dropdown-menu a').eq(0).on('click',function(){
		alert('로또 하러 가자 !!')
		location.href="${path.context}/move/lotto/main"
	});
	$('.dropdown-menu a').eq(1).on('click',function(){
		alert('햄버거 주문하러 가자 !!')
		location.href="${path.context}/move/burgerking/main"
	});
	
	$('#a-login').on('click',function(){
		location.href="${path.context}/move/user/login"
	});
	$('#a-logout').on('click',function(){
		location.href="${path.context}/logout"
	});
	$('#a-join').on('click',function(){
		location.href="${path.context}/move/user/join"
	});
	$('#span-board').on('click',function(){
		app.board.list(1);
	});

</script>