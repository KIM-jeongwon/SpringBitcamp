<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

	<div>
	총 게시글 수 : ${page.totalCount} 개
	</div>
<div class="container">
	<table class="table table-hover">
  	<tr id="board-list"  align="center" style="padding-right: 7px; border-collapse: collapse;
   	 word-break: break-all;" >
		<th  class="text-center">글번호</th>
		<th  class="text-center">제  목</th>
		<th  class="text-center">작성자</th>
		<th  class="text-center">작성일</th>
	</tr>

	<c:forEach begin="0" end="${page.pageSize}" items="${list}"  step="1" var="article" varStatus="">
		<tr class="active">
			<td class="info">${article.bbsSeq}</td>
			<td > <a href="${path.context}/board/detail/${article.bbsSeq}">
			${article.title}</a>
			</td>
			<td >${article.id}</td>
			<td >${article.regdate}</td>
		</tr>
	</c:forEach>
</table>
<div class="container text-center" style="margin-top: 0px;">
  <ul class="pagination">
  	
  	
  	<c:if test="${page.preBlock}"  >
  		 <li>
		    <a href="#"
     		 onclick="app.boardList(${page.pageStart-page.pageSize}); return false;" aria-label="Previous">
			     <span aria-hidden="true">&laquo;</span>
	   </a>
  		  </li> 
  	</c:if>
  
   
    <c:forEach begin="${page.pageStart}" end="${page.pageEnd}" step="1" varStatus="i">
      <li>	<a href="#" onclick="app.boardList(${i.index}); return false;" >${i.index}</a></li>
    </c:forEach>
   
    <c:if test="${page.nextBlock}">
   	    <li>
    	   <a href="#"
     		 onclick="app.boardList(${page.pageStart+page.pageSize}); return false;" aria-label="Next">
    	    <span aria-hidden="true">&raquo;</span>
     </a>
    	</li>
    </c:if>
    
    
  </ul>
</div>

</div>
<div>
	<button id="btn-write" class="button button_type2">글쓰기</button>
	
</div> 
<script>
$('#btn-write').on('click',function(){
	location.href="${path.context}/board/write"
});

</script>