<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
	<html lang="en">	
<section>
<article >
	구매 금액 : <input id="money" type="text" value="${money}"/>
	<button id="btn-money">전송</button>
</article>
<article>
<div style="height: 40px; width:300px;">
</div>
<table id="member_list_tab">
<tr>
<th>No.</th>
<th>로또번호</th>
</tr>
<c:forEach var ="i" items="${lottos}">
<tr>
<td>1</td>
<td>${i.lottoNumber}</td>
</tr>
</c:forEach>

</table>
<div class="item">
 <div class="carousel-caption">
 		 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4f55SD1tyY5zmGoKlTDLmAvE1GlXFYF2hTr0znRZBDA3j5ZkEAg"
  	  		 alt="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyqvfGDvw1AYiP-fOEYdvnNkpy2kcOu1iPfL3sZgeaK8FeygECLw">
   </div>
</div>
</article>
</section>
<script>

</script>