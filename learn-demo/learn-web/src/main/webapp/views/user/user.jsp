<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String serverUrl = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.getSession().setAttribute("serverUrl", serverUrl);
	request.getSession().setAttribute("basePath", basePath);
%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>用户管理</title>

<body class="hold-transition skin-blue sidebar-mini">
	
</html>
