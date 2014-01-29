<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/taglibs.jsp"%>

<html>
<head>
<title>Spring MVC Exception</title>
<script type="text/javascript">
function testSendJms()
{
	var cc = "<c:url value="/jms/send.action"/>";
	$.get(cc);
}
function testGetJms()
{
	var cc = "<c:url value="/jms/getjms.action"/>";
	$.get(cc);
}
</script>
</head>
<body>
	<input type=button value="Ajax SendJms" onclick="testSendJms()"></input>
	
	<input type=button value="Ajax getJms" onclick="testGetJms()"></input>
</body>
</html>
