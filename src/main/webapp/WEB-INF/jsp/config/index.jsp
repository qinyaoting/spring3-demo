<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Config List</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <style type="text/css">
        *{padding: 0;margin: 0;line-height:20px;}
        table tr td{padding: 6px 16px;}
        table tr td table tr td{padding: 0px}
        .main {width: 1000px;margin: 20px auto;}
        #playlist1,#playlist2,#playlist3,#playlist4{display: none;}
        select{width:240px;}
        div label{display:block;width:260px;overflow:hidden;float: left;}
        input{width:240px;}
        .btn1{width:60px;}
        h2{padding: 33px;}
        h3{padding: 12px 0;}
        .botnav{width: 100%;text-align: right;}
    </style>
</head>
<body>
<div class="main">

    <h2>Config List</h2>
    <table width="100%">
        <tr align="center" bgcolor="#EEE">
            <td>Config name</td>
            <td>Edit</td>
            <td>Active</td>
        </tr>
        <c:forEach items="${configList}" var="config">
            <tr>
                <td align="center">${config.cfgid} </td>

                <td  align="center"><a href="edit.action?cfgid=${config.cfgid}">header</a></td>
                <!--
                <td  align="center"><a href="/apps/configs/menus?cfgid=${config.cfgid}&flow=edit">menu slots</a></td> -->
                <td  align="center">
                    <c:if test="${config.actived != 'true'}">
                        <a href="set.action?cfgid=${config.cfgid}">Active</a>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
    <hr /><br/>
    <div class="botnav"><a href="new.action">New config</a></div>
</div>
</body>
</html>

