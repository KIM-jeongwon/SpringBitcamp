<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><html lang="en">	
	<script src = "${sessionScope.path.js}/jquery-3.3.1.min.js"></script>
<div id ="wrapper">
<section>
<article >
	구매 금액 : <input id="money" type="text" placeholder="게임당 1000원/최대 5게임"/>
	<button id="btn-money">전송</button>
	<div class="item">
	 <div class="carousel-caption">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4f55SD1tyY5zmGoKlTDLmAvE1GlXFYF2hTr0znRZBDA3j5ZkEAg"
  	   alt="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyqvfGDvw1AYiP-fOEYdvnNkpy2kcOu1iPfL3sZgeaK8FeygECLw">
  	   </div>
</div>
</article>
</section>
</div>

<aside>

</aside>
<script>
$('#btn-money').on('click',function(){
	var money =$('#money').val();
	alert("입력받은돈은 "+money+" 입니다.");
location.href="${path.context}/lotto/"+money;	
})

</script>