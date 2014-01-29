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
  <h2>11111</h2>


  <form action="/apps/configs/menus" method="post" id="nextForm">
      <table width="80%" cellpadding="8">
          <tr bgcolor="#EEE">
              <td width="16%"><h3>Config Id</h3></td>
              <td>
                  <c:if test="${CONFIG == null}">
                      <input type="input" name="cfgid" value="" placeholder="Ex : nokia-1.0.1">
                      <input type="button" value="Save" id="saveBtn"/> <span id="msg"></span>
                  </c:if>
                  <c:if test="${CONFIG != null}">
                      <input type="input" name="cfgid" value="${CONFIG.cfgid}" placeholder="Ex : nokia-1.0.1" readonly="true">    <!-- 1 -->
                  </c:if>
              </td>
          </tr>
          <tr bgcolor="#EEE">
              <td><h3>Header </h3></td>
              <td>
                  <c:if test="${CONFIG == null}">
                      <input type="input" name="header" value="logo,search,train,menu" placeholder="Ex : logo,search,train,menu">
                  </c:if>
                  <c:if test="${CONFIG != null}">
                      <input type="input" name="header" value="${CONFIG.header}" placeholder="Ex : logo,search,train,menu">

                  </c:if>
              </td>
          </tr>
          <tr bgcolor="#EEE">
              <td><h3>Train</h3></td>
              <td>
                  <table>
                      <tr>
                          <td>
                              <select name="country" id="country">
                                  <c:forEach items="${countryList}" var="country">
                                      <option value="${country}">${country}</option>
                                  </c:forEach>
                              </select> <a href="#" id="addBtn">Add</a><div id="train_input"></div>
                              <c:forEach items="${TRAINMAP}" var="entry"><br>
                                  <div><label>${entry.key}</label> <input type="text" name="${entry.key}" value="${entry.value}"/> <a href="#" class="delBtn">X</a></div>
                              </c:forEach>
                          </td>
                          <td></td>
                      </tr>
                  </table>
              </td>
          </tr>
          <tr bgcolor="#EEE" align="center">
              <td colspan="2">
                  <input type="button" value="next" id="nextBtn"> <span id="msg2"></span>
                  <c:if test="${FLOW != 'edit'}">
                      <input type="hidden" name="flow" value="new" />
                  </c:if>
                  <c:if test="${FLOW == 'edit'}">
                      <input type="hidden" name="flow" value="edit" />
                  </c:if>

              </td>
          </tr>
      </table>
  </form>


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
