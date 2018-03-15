<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form action="" id="form-board-write">
    <div class="board_type1_wrap">
        <div class="board_type1_write_wrap">
            <table class="board_write_type1">
                <tr>
                    <td class="left" >
                        <div class="column_name">제목</div>
                        <div class="column_desc">
                        <textarea name="title" class="text_type1">${title}</textarea>
                    	</div>                    	
                    </td>
                </tr>            
                <tr>
                    <td class="left" >
                        <div class="column_name">내용</div>
                        <div class="column_desc">
                            <textarea name="content" rows="" cols="" class="textarea_type1">${content}</textarea>
                        </div>
                    </td>
                </tr>    
            </table>
        </div>
        <div class="button_margin"></div>
        <div class="board_type1_write_button_wrap">
            <div class="write_button_right">
                <button id="submit-btn" type="button" class="button button_type1">수정하기</button>
            </div>
            <div class="write_button_left">
                <button type="button" class="button button_type2">목록</button>
            </div>
        </div>
    </div>
    <div class="margin"></div>
</form>
<script>
$('#submit-btn').on('click',function(){
    $('#form-board-write')
    .attr('action','${path.context}/board/list')
    .submit();
});
</script>