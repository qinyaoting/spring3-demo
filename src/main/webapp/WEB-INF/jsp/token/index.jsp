<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>token</title>
	<script type="text/javascript">
		$(function(){
			$("#center-div").center(true);
		})
		function ajaxTestException()
		{
			var headers = {};
		    headers['__RequestVerificationToken'] = $("#CSRFToken").val();
			$.ajax( {
				type : 'GET',
				headers: headers,
				url : '${basePath}/token/ajaxtoken.action',   
				async: false,//禁止ajax的异步操作，使之顺序执行。
				dataType : 'json',
				success : function(data,textStatus){
					alert(JSON.stringify(data));
				},
				error : function(data,textstatus){
					alert(data.responseText);
				}
			});
		}
	</script>
</head>
<body style="margin: 0;padding: 0;background-color: #f5f5f5;">
	<div id="center-div">
		 <form action="${basePath}/token/mytoken.action" method="post">
		 	<input type="hidden" name="CSRFToken" value="${csrf}" />
		 	<input type="submit"/>
		 </form>
	</div>
	___________________________________________________________<br/>
	<input type="hidden" name="CSRFToken" id="CSRFToken" value="${csrf}">
	<input type=button value="Ajax Exception Test" onclick="ajaxTestException();"></input>
</body>
</html>