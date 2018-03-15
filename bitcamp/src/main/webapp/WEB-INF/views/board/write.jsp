<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="" id="form-board-write">
    <div class="board_type1_wrap">
        <div class="board_type1_write_wrap">
            <table class="board_write_type1">
                <tr>
                    <td class="left" >
                        <div class="column_name">글제목</div>
                        <div class="column_desc"><input type="text" name="title" class="text_type1"/></div>
                    </td>
                </tr>
                <tr>
                    <td class="left">
                        <ul class="split_three">
                            <li>
                                <div class="column_name">닉네임</div>
                                <div class="column_desc"><input type="text" name="name" class="text_type1"/></div>
                            </li>
                            <li>
                                <div class="column_name">비밀번호</div>
                                <div class="column_desc"><input type="text" name="" class="text_type1"/></div>
                            </li>
                            <li>
                                <div class="column_name">옵션</div>
                                <div class="column_desc">
                                    <div class="checkwrap_type1">
                                        <input type="checkbox" id="main_exposure" value="main" class="check_type1" /><label for="main_exposure">메인노출</label>
                                    </div>
                                    <div class="checkwrap_type1">
                                        <input type="checkbox" id="notice" value="notice" class="check_type1" /><label for="notice">공지여부</label>
                                       
                                    </div>
                                 	<div class="write_button_right">
										<button id="btn-upload" type="button" class="btn btn-primary">파일업로드</button>
									</div>
								</div>								 
                            </li>                          
                        </ul>
                        <div class="column_name">내용</div>
                    </td>
                </tr>            
           </table>
           <table>
              <c:choose>
                <c:when test="${uploadImage == null}">                   
                     <tr>
                       <td>
                         <textarea name="content" rows="5" class="textarea_type2"></textarea>
                        </td>
        				 <td>
                        	<img src="${path.image}/${uploadImage}" alt="" />
                        </td>        			
        			</tr>                         
                 </c:when>
              </c:choose>
          </table>                                   
<%-- <form action="">
        <label for="usr">제목</label>
        <input name="brotitle" type="text" class="form-control"><br/>
        <label for="comment">내용</label><br />
        <textarea name="brocontent" class="form-control" rows="15" >
        </textarea><br />
        <div class="">
          <img src="${path.img}/${uploadImage}" style="width: 150px; height: 150px" alt="" />
        </div>
    </form> --%>
        </div>
        <div class="button_margin"></div>
        <div class="board_type1_write_button_wrap">
            <div class="write_button_right">
                <button id="submit-btn" type="button" class="button button_type1">작성완료</button>
            </div>
            <div class="write_button_right">
                <button type="button" class="button button_type2">취소</button>
            </div>
        </div>
    </div>
</form>
<!-- link that opens popup -->
<a class="popup-with-form" href="#test-form">파일 업로드</a>
<div class="container white-popup">
<form id="test-form" 
action="${path.context}/board/fileupload"
 class="white-popup mfp-hide" 
 method="post"
  enctype="multipart/form-data">
  <div class="row">
    <div class="text-center">
      <h4 style="color: purple; font-size: 40px">File Upload</h4>
    </div>
    <div class="text-center">
      <span class="glyphicon glyphicon-sort fa-5x" style="font-size:20px;"></span>
    </div><br />
  </div>
  <div class="row" style="padding-left: 40px; padding-right: 40px">
    <div class="form-group">
      <input type="file" name="file" class="" placeholder="choose a file..." style="border: 1px solid gray; width: 100%"><br>
    </div>
  </div>
   <div class="row">
    <div class="btn-group pull-right" style="margin-right: 40px">
      <input class="btn btn-danger" type="reset" value="취소">
      <input class="btn btn-primary" type="submit" value="확인">
    </div>
  </div>
</form>
</div>
<script>
$(document).ready(function(){
	$('.popup-with-form').magnificPopup({
		type: 'inline',
		preloader: false,
		focus: '#name',
		// When elemened is focused, some mobile browsers in some cases zoom in
		// It looks not nice, so we disable it:
		callbacks: {
			beforeOpen: function() {
				if($(window).width() < 700) {
					this.st.focus = false;
				} else {
					this.st.focus = '#name';
				}
			}
		}
	});
});
$('#submit-btn').on('click',function(){
    $('#form-board-write')
    .attr('action','${path.context}/board/list')
    .submit();
});
/* $('#btn-upload').on('click',function(){
	app.move('board/fileupload');
}); */
</script>