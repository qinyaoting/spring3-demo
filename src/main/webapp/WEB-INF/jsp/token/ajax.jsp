<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/taglibs.jsp"%>

<html>
<head>
<title>Spring MVC Exception</title>
<script type="text/javascript">
function ajaxTestException()
{
	var headers = {};
    headers['__RequestVerificationToken'] = $("#CSRFToken").val();
	$.ajax( {
		type : 'GET',
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
<body>
    <input type="hidden" name="CSRFToken" id="CSRFToken" value="${csrf}">
	<input type=button value="Ajax Exception Test" onclick="ajaxTestException();"></input>
</body>
</html>
