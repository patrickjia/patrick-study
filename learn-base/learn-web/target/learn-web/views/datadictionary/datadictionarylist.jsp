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
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>数据字典管理--数据字典列表展示</title>
<meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="apple-mobile-web-app-status-bar-style" content="black"> 
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="format-detection" content="telephone=no">
  
  <link rel="stylesheet" href="<%=basePath %>/static/css/layui.css"  media="all">
  <link rel="stylesheet" href="<%=basePath %>/static/css/global.css" media="all">
  
</head>
<body>
<div class="layui-layout layui-layout-admin">
  <div class="layui-header header header-index"> 
 <div class="layui-main">             
<ul class="layui-nav">
  <li class="layui-nav-item" style="width: 1200px"><a href="">JAVA基础支撑平台</a></li>
  <!-- <li class="layui-nav-item" style="width:400px"><a href="">首页</a></li>
  -->
  <%-- <li class="layui-nav-item ">
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
  <li class="layui-nav-item"><a href="">帮助</a></li>--%>
</ul>
 </div>
 </div>

<div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
<ul class="layui-nav layui-nav-tree site-demo-nav">
 <li class="layui-nav-item layui-nav-itemed">
    <a href="javascript:;">系统管理</a>
    <dl class="layui-nav-child">
      <dd><a href="<%=basePath %>businesssystem/list">应用系统管理</a></dd>
      <dd class="layui-this"><a href="<%=basePath %>datadictionary/list">数据字典管理</a></dd>
      <dd ><a href="<%=basePath %>systemcode/list">编码规则管理</a></dd>
    </dl>
  </li>
  <li class="layui-nav-item layui-nav-itemed">
    <a href="javascript:;">用户权限管理</a>
    <dl class="layui-nav-child">
      <dd ><a href="<%=basePath %>department/list">组织架构管理</a></dd>
      <dd ><a href="<%=basePath %>user/list">用户管理</a></dd>
      <dd><a href="<%=basePath %>role/list">角色管理</a></dd>
      <dd ><a href="<%=basePath %>position/list">岗位管理</a></dd>
      <dd ><a href="<%=basePath %>menu/list">菜单管理</a></dd>
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
    <div class="layui-body " >
     <!--  <div class="layui-tab-item layui-show"> -->
       <div class="layui-main">
		<div class="layui-form" >         
		<!-- <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
		 --> <!--  <legend>查询列表</legend> -->
		  <!-- <div class="layui-btn-group">
		  </div> -->
		  
		  <div  >
		  	<form>
		  		<table class="layui-table" lay-even="" style="height: 20px" lay-skin="nob">
		  			<tr>
		  			<td>字典编码：</td>
		  			<td><input type="text" class="layui-input"/></td>
		  			<td>字典简称：</td>
		  			<td><input type="text" class="layui-input"/></td>
		  			
		  			 <td>
		  			 <button class="layui-btn layui-btn-radius">查询</button>
		  			 </td>
		  			</tr>
		  		</table>
		  	</form>
		  </div>
		  <div class="site-demo-button" style="margin-bottom: 0;">
		  <button data-method="setTop" class="layui-btn" id="addBtn"><i class="layui-icon" ></i></button>
		  <button data-method="setTop" class="layui-btn" id="updateBtn"><i class="layui-icon"></i></button>
		  <button data-method="confirmTrans" class="layui-btn"><i class="layui-icon"></i></button>
		  <button data-method="setTop" class="layui-btn" id="viewBtn"><i class="layui-icon"></i></button>
		</div>
		<!-- </fieldset>  -->
		
		<table class="layui-table" lay-even="" lay-skin="row">
		  <colgroup>
		  	<col width="100">
		    <col width="150">
		    <col width="150">
		    <col width="200">
		    <col>
		  </colgroup>
		  <thead>
		    <tr>
		      <th><input type="checkbox" name="" lay-skin="primary" ></th>
		      <th>字典编码</th>
		      <th>字典简称</th>
		      <th>父级字典</th>
		       <th>排序</th>
		       <th>状态</th>
		    </tr> 
		  </thead>
		  <tbody>
		  <c:forEach items="${sysparams }" var="sysParam">
				<tr id="tr_${sysParam.sysParamId }">
					<td ><input type="checkbox" name="personId" lay-skin="primary" value="${user.personId }"></td>
					<td>${sysParam.sysParamCode }</td>
					<td>${sysParam.sysParamName }</td>
					<td>${sysParam.superiorSysParamName }</td>
					
					<td>${sysParam.sortorder}</td>
					<%-- <td>${user.positionName }</td> --%>
					<td>
						<c:if test="${sysParam.isEnabled == 0 }">
                                                                                                                                       启用
                                       </c:if>
                                       <c:if test="${sysParam.isEnabled == 1 }">
                                                                                                                                        停用
                                       </c:if>
                                      </td>
					<%-- <td>${user.appcode }</td> --%>
				</tr>
			</c:forEach>
		  	
		  </tbody>
		</table>  
		<div id="demo7"></div>  
		</div>
  <!-- </div> -->
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
		    	var btnId=$(this).attr("id");
		    	//alert(btnId);
		    	var title = '';
		    	var chk_value =[]; 
		    	if(btnId=='updateBtn'|btnId=='viewBtn'){
				  $('input[name="personId"]:checked').each(function(){ 
				  chk_value.push($(this).val()); 
				  }); 
				  if(chk_value.length==0){
					  alert('你还没有选择任何内容！');
					  return false;
				  }
				  if(btnId=='updateBtn'){
					  title = '修改字典';
				  }
				  if(btnId=='viewBtn'){
					  title = '查看字典';
				  }
		    	}else{
		    		title = '新增字典';
		    	}
				  //alert(chk_value); 
		    	
		      var that = this; 
		      //多窗口模式，层叠置顶
		      layer.open({
				  type: 2,
				  title:title,
				  area: ['700px', '550px'],
				  fixed: false, //不固定
				  maxmin: true,
				  content: '${basePath}user/viewuser?personId='+chk_value
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