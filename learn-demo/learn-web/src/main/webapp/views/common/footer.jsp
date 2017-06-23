<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
  <meta charset="utf-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="<%=basePath %>/static/css/layui.css"  media="all">
  <link rel="stylesheet" href="<%=basePath %>/static/css/global.css"  media="all">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<title>Insert title here</title>
</head>
<body>
<div class="layui-footer footer footer-index">
  <div class="layui-main">
    <p>&copy; 2017 <a href="/">layui.com</a> MIT license</p>
    <p>
      <a href="http://fly.layui.com/case/2017/" target="_blank">案例</a>
      <a href="http://fly.layui.com/jie/3147.html" target="_blank">捐赠</a>
      <!--<a href="javascript:layer.msg('暂无此页');">关于我们</a>-->
      <a href="mailto:xianxin@layui.com">联系</a>
      <a href="http://fly.layui.com/jie/4281.html" target="_blank">Git仓库</a>
      <a href="http://fly.layui.com/jie/2461.html" target="_blank">微信公众号</a>
    </p>
  </div>
</div> 
</body>
</html>