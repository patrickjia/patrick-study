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

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>表单 - 在线演示 - layui</title>
<meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="apple-mobile-web-app-status-bar-style" content="black"> 
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="format-detection" content="telephone=no">
  
  <link rel="stylesheet" href="<%=basePath %>/static/css/layui.css"  media="all">
  <link rel="stylesheet" href="<%=basePath %>/static/css/main.css" media="all">
  
</head>
<body>
<div id="container">  
    <div id="header">
	  <div class="layui-main">             
		<ul class="layui-nav">
		  <li class="layui-nav-item"><a href="">JAVA基础支撑平台</a></li>
		  <li class="layui-nav-item layui-this"><a href="">首页</a></li>
		  <li class="layui-nav-item ">
		    <a href="javascript:;">系统管理</a>
		    <dl class="layui-nav-child">
		      <dd><a href="">应用管理</a></dd>
		      <dd><a href="">数据字典管理</a></dd>
		      <dd><a href="">编码规则管理</a></dd>
		    </dl>
		  </li>
		  
		  <li class="layui-nav-item">
		    <a href="javascript:;">用户权限管理</a>
		    <dl class="layui-nav-child">
		      <dd><a href="">组织架构管理</a></dd>
		      <dd><a href="<%=basePath %>user/list">用户管理</a></dd>
		      <!-- <dd class="layui-this"><a href="">选中项</a></dd> -->
		      <dd><a href="">角色管理</a></dd>
		      <dd><a href="">岗位管理</a></dd>
		      <dd><a href="">菜单管理</a></dd>
		    </dl>
		  </li>
		  <li class="layui-nav-item">
		    <a href="javascript:;">第三方组件管理</a>
		    <dl class="layui-nav-child">
		      <dd><a href="">缓存管理</a></dd>
		      <dd><a href="">消息队列管理</a></dd>
		      <dd><a href="">流程实例管理</a></dd>
		      <!-- <dd class="layui-this"><a href="">选中项</a></dd> -->
		    </dl>
		  </li>
		  <li class="layui-nav-item"><a href="">帮助</a></li>
		</ul>
	 </div>
    </div>  
    <div id="main">  
        <div class="cat">
        	<div class="layui-side-scroll">
			<ul class="layui-nav layui-nav-tree site-demo-nav">
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
        </div>  
        <div class="content">内容(content)</div>  
    </div>  
    <div id="footer">
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
</div>  

<script src="<%=basePath %>/static/layui.js" charset="utf-8">
</script>
<script>
layui.use('element', function(){
	  var element = layui.element(); //导航的hover效果、二级菜单等功能，需要依赖element模块
	  
	  //监听导航点击
	  element.on('nav(demo)', function(elem){
	    //console.log(elem)
	    layer.msg(elem.text());
	  });
	});
layui.use('form', function(){
	  var $ = layui.jquery, form = layui.form();
	  
	  //全选
	  form.on('checkbox(allChoose)', function(data){
	    var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]');
	    child.each(function(index, item){
	      item.checked = data.elem.checked;
	    });
	    form.render('checkbox');
	  });
	  
	});

	layui.use('layer', function(){ //独立版的layer无需执行这一句
		  var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
		  
		  //触发事件
		  var active = {
		    setTop: function(){
		      var that = this; 
		      //多窗口模式，层叠置顶
		      layer.open({
				  type: 2,
				  title:'修改用户信息',
				  area: ['700px', '450px'],
				  fixed: false, //不固定
				  maxmin: true,
				  content: '${basePath}user/viewuser'
				});
		    },confirmTrans: function(){
		        //配置一个透明的询问框
		        layer.msg('您要做删除<br>xx记录吗', {
		          time: 20000, //20s后自动关闭
		          btn: ['确定', '取消']
		        });
		      }
		    ,notice: function(){
		        //示范一个公告层
		        layer.open({
		          type: 1
		          ,title: false //不显示标题栏
		          ,closeBtn: false
		          ,area: '500px;'
		          ,shade: 0.8
		          ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
		          ,btn: ['火速围观', '残忍拒绝']
		          ,moveType: 1 //拖拽模式，0或者1
		          ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">你知道吗？亲！<br>layer ≠ layui<br><br>layer只是作为Layui的一个弹层模块，由于其用户基数较大，所以常常会有人以为layui是layerui<br><br>layer虽然已被 Layui 收编为内置的弹层模块，但仍然会作为一个独立组件全力维护、升级。<br><br>我们此后的征途是星辰大海 ^_^</div>'
		          ,success: function(layero){
		            var btn = layero.find('.layui-layer-btn');
		            btn.css('text-align', 'center');
		            btn.find('.layui-layer-btn0').attr({
		              href: '${basePath}user/viewuser'
		              ,target: '_blank'
		            });
		          }
		        });
		      }
		    ,offset: function(othis){
		      var type = othis.data('type')
		      ,text = othis.text();
		      
		      layer.open({
		        type: 1
		        ,offset: type //具体配置参考：http://www.layui.com/doc/modules/layer.html#offset
		        ,id: 'LAY_demo'+type //防止重复弹出
		        ,content: '<div style="padding: 20px 100px;">'+ text +'</div>'
		        ,btn: '关闭全部'
		        ,btnAlign: 'c' //按钮居中
		        ,shade: 0 //不显示遮罩
		        ,yes: function(){
		          layer.closeAll();
		        }
		      });
		    }
		  };
		  
		  $('.site-demo-button .layui-btn').on('click', function(){
		    var othis = $(this), method = othis.data('method');
		    active[method] ? active[method].call(this, othis) : '';
		  });
		  
		});	  
		
		
	layui.use(['laypage', 'layer'], function(){
		  var laypage = layui.laypage
		  ,layer = layui.layer;
		  
		  laypage({
		    cont: 'demo7'
		    ,pages: 100
		    ,skip: true
		  });
		  
		});
</script>
</div>
</body>
</html>