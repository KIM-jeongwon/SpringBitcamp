<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<h1>ATTACHFILE</h1>
<form  id="form-upload" >
  <div class="form-group">
    <label for="exampleInputFile">Attach up to 10 files at a time. Total file size may not exceed 20MB</label>
    <input style="margin:0 auto" type="file" id="exampleInputFile">
  </div>
  <button id="submits-btn"type="submit" class="btn btn-primary btn-lg">UPLOAD</button>
</form>
<script>
$('#submits-btn').on('click',function(){
    $('#form-upload')
    .attr('action','${path.context}/board/write')
    .submit();
});
</script>