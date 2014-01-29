<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  <body>
    <form:form id="form1" commandName="userInfo" action="save-user.action" method="post" modelAttribute="userInfo">
			<c:if test="${hasErrors}">
			<div class="notification error png_bg">
				<div>
					<form:errors path="*" />
				</div>
			</div>
			</c:if>
			<table id="table1" border="0">
				<tbody>
				<tr>
					<td>帐号：</td>
					<td><form:input path="account" class="text-input small-input" /></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><form:textarea path="password" class="text-input small-input" /> </td>
				</tr>
				<tr>
					<td>昵称：</td>
					<td><form:input path="name" class="text-input small-input" /></td>
				</tr>
				</tbody>
			</table>
				<br/>
				<input class="button" type="submit" value="提交" />
            </p>
			</form:form>
  </body>
  
  
  <a href="../member/add-member.action" >添加会员</a><br />
  
  <a href="../user/totest.action" >form提交2个对象</a><br />
  
  <a href="../exc/index.action" >异常测试</a><br />
  
  <a href="../token/index.action" >异常安全token</a><br />
  
  <a href="../jms/test.action" >试试JMS吧</a><br />
  <hr />
  //单文件
  <form action="../upload/test.action"  method="POST" enctype="multipart/form-data">
  		<input type="file" name="myfile" />
  		<input type="submit" value="submit"/>
  </form>

  <hr />
  多文件
  <form method="post" action="../upload/test2.action" enctype="multipart/form-data">
	 <p>Type: <input type="text" name="type" value="multiPartFileSingle" size="60" /></p>
	 <p>File 1: <input type="file" name="files[0]" size="60" /></p>
	 <p>File 2: <input type="file" name="files[1]" size="60" /></p>
	 <p><input type="submit" value="Upload" /></p>
	 </form>
  <hr />
  <a href="../download/down.action?file=logo.png">下载logo</a>
</html>
