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
    <title>Edit Config</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <script type="text/javascript" src="<%=basePath%>js/jquery/jquery-1.6.min.js"></script>
    <style type="text/css">
        *{padding: 0;margin: 0;line-height:20px;}
        table tr td{padding: 6px 16px;}
        table tr td table tr td{padding: 0px}
        .main {width: 1000px;margin: 20px auto;}
        .main form {width:100%;padding: 20px;}
        .main table{width:70%;margin: 0 auto;}
        #playlist1,#playlist2,#playlist3,#playlist4{display: none;}
        select{width:240px;}
        input{width:240px;}
        .btn1{width:60px;}
        div label{width:260px;overflow:hidden;font-weight: bold;}
        h2{padding: 33px;}
        h3{padding: 12px 0;}
        #box{width:600px;text-align:left;margin:0 auto;padding-top:80px;}
        #suggest,#suggest2{width:240px;}
        .gray{color:gray;}
        .ac_results {background:#fff;border:1px solid #7f9db9;position:absolute;z-index:10000;display:none;}
        .ac_results ul{margin:0;padding:0;list-style:none;}
        .ac_results li a{white-space:nowrap;text-decoration:none;display:block;color:#05a;padding:1px 3px;}
        .ac_results li{border:1px solid #fff;}
        .ac_over,.ac_results li a:hover {background:#c8e3fc;}
        .ac_results li a span{float:right;}
        .ac_result_tip{border-bottom:1px dashed #666;padding:3px; }
        .botnav{width: 100%;text-align: right;}
    </style>
    <script type="text/javascript" src="/js/j.suggest.js"></script>
    <script type="text/javascript" src="/js/j.dimensions.js"></script>
    <script type="text/javascript" src="/js/aircity.js"></script>
    <script type="text/javascript">
        $(function(){
            var map = getMap();
            // servlet map -> JS map
            var appIds=new Array();
            <c:forEach items="${apps}" var="entry">
            appIds.push(new Array('SZX','${entry.key}',' ','SZ'));
            map.put("${entry.key}","${entry.value}");
            </c:forEach>

            var versions=new Array();
            versions[0]=new Array('SHA','default',' ','SH');

            $("#appid").suggest(citys,{hot_list:appIds,dataContainer:'#arrcity_3word',onSelect:function(){$("#version").click();},attachObject:'#suggest'});
            $("#version").suggest(citys,{hot_list:versions,attachObject:"#suggest2"});

            $("#version").focus(function(){
                //$("#appid").css("background-color","#FFFFCC");
                var appid = $("#appid").val();
                if (appid != "") {
                    var versionStr = map.get(appid);

                    if (versionStr != null) {
                        var versionArray = versionStr.split(",");
                        console.log(versionArray);
                        var versions2=new Array();
                        for (var i=0;i<versionArray.length;i++) {
                            versions2.push(new Array('SHA',versionArray[i],' ','SH'))
                        }
                        $("#version").suggest(citys,{hot_list:versions2,attachObject:"#suggest2"});
                    }
                }
            });



        });
        //定义简单Map
        function getMap() {//初始化map_,给map_对象增加方法，使map_像Map
            var map_ = new Object();
            map_.put = function(key, value) {
                map_[key+'_'] = value;
            };
            map_.get = function(key) {
                return map_[key+'_'];
            };
            map_.remove = function(key) {
                delete map_[key+'_'];
            };
            map_.keyset = function() {
                var ret = "";
                for(var p in map_) {
                    if(typeof p == 'string' && p.substring(p.length-1) == "_") {
                        ret += ",";
                        ret += p.substring(0,p.length-1);
                    }
                }
                if(ret == "") {
                    return ret.split(",");
                } else {
                    return ret.substring(1).split(",");
                }
            };
            return map_;
        }
    </script>
</head>
<body>
<div class="main">

    <h2>Set Config</h2>

    <hr />

    <form method="post" action="active.action">
        <table width="70%">
            <tr>
                <td colspan="2"><b>Config id :</b> ${currcfgid}   <input type="hidden" name="cfgid" value="${currcfgid}" readonly="true"/></td>
            </tr>
            <tr>
                <td>
                    <div><label for="appid">App Id </label><input type="text" name="appid" id="appid" value="${appid}" placeholder="Choose one or type new"/> </div>
                    <div id='suggest' class="ac_results"></div>
                </td>
                <td>
                    <div><label for="version">Version </label><input type="text" name="version" id="version" value="${version}" placeholder="Choose one or type new"/></div>
                    <div id='suggest2' class="ac_results"></div>
                </td>
            </tr>
            <tr>
                <td  colspan="2" align="right">
                    <font color="red">${MESSAGE}</font>
                    <c:if test="${FORCE == 'true'}">
                        <input type="checkbox" name="force" value="true" checked="true" style="width: 22px;">Force active
                    </c:if>
                </td>
            </tr>
            <tr>
                <td  colspan="2" align="right">
                    <input type="submit" value="Submit" class="btn1">
                    <input type="hidden" name="arrcity_3word" id="arrcity_3word" value="" />
                    <input type="hidden" name="active" value="active" />
                </td>
            </tr>
        </table>





    </form>
    <hr/><br/>
    <div class="botnav"><a href="index.action">Home</a></div>
</div>
</body>
</html>


