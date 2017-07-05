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
<div class="layui-side-scroll">
<ul class="layui-nav layui-nav-tree site-demo-nav" lay-filter="demo">
  <li class="layui-nav-item layui-nav-itemed">
    <a href="javascript:;">系统管理</a>
    <dl class="layui-nav-child">
      <dd><a href="javascript:;">应用系统管理</a></dd>
      <dd><a href="javascript:;">数据字典管理</a></dd>
      <dd><a href="javascript:;">编码规则管理</a></dd>
    </dl>
  </li>
  <li class="layui-nav-item layui-nav-itemed">
    <a href="javascript:;">用户权限管理</a>
    <dl class="layui-nav-child">
       <dd><a href="">组织架构管理</a></dd>
      <dd ><a href="<%=basePath %>user/list">用户管理</a></dd>
      <!-- <dd class="layui-this"><a href="">选中项</a></dd> -->
      <dd><a href="">角色管理</a></dd>
      <dd><a href="">岗位管理</a></dd>
      <dd><a href="">菜单管理</a></dd>
    </dl>
  </li>
  <li class="layui-nav-item layui-nav-itemed">
  	<a href="javascript:;">第三方组件管理</a>
  	<dl class="layui-nav-child">
       <dd><a href="">缓存管理</a></dd>
      <dd><a href="">消息队列管理</a></dd>
      <dd><a href="">流程实例管理</a></dd>
    </dl>
  </li>
  <li class="layui-nav-item">
  <a href="javascript:;">帮助</a>
  </li>
</ul>
 </div>
</body>
<script src="<%=basePath %>/static/layui.js" charset="utf-8"></script>
<script>
layui.use('element', function(){
  var element = layui.element(); //导航的hover效果、二级菜单等功能，需要依赖element模块
  
  //监听导航点击
  element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
});
</script>
</html>