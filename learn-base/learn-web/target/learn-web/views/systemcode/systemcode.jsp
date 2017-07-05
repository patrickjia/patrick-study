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
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>系统编码规则管理--系统编码规则基本信息</title>
<link rel="stylesheet" href="<%=basePath %>/static/css/layui.css"  media="all">
<script src="$<%=basePath %>/static/jquery1.11.1.min.js"></script>
</head>
<body>

<form class="layui-form " action="">

  <div class="layui-form-item">
  	<div class="layui-inline">
	    <label class="layui-form-label">人员编码</label>
	    <div class="layui-input-inline">
	      <input type="text" name="title" value="${person.personCode}" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
	    </div>
	    <div class="layui-form-mid layui-word-aux"></div>
    </div>
    <div class="layui-inline">
	    <label class="layui-form-label">用户姓名</label>
	    <div class="layui-input-block">
	      <input type="text" name="title" value="${person.personName}" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
	    </div>
	 </div>
  </div>
  
  <div class="layui-form-item">
  <div class="layui-inline">
    <label class="layui-form-label">登录名</label>
    <div class="layui-input-inline">
      <input type="text" name="username" value="${person.loginName}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">请务必填写用户名</div>
  </div>
  
   <div class="layui-inline">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-inline">
      <input type="password" name="password" value="${person.pwd}" lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
    </div>
  </div>
  
  <div class="layui-form-item">
  <div class="layui-inline">
    <label class="layui-form-label">邮箱</label>
    <div class="layui-input-inline">
      <input type="text" name="email" value="${person.email}" lay-verify="email" placeholder="请输入" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-inline">
    <label class="layui-form-label">手机</label>
    <div class="layui-input-inline">
      <input type="text" name="phone" value="${person.mobilePhone}" lay-verify="phone" placeholder="请输入" autocomplete="off" class="layui-input">
    </div>
  </div>
  </div>
  
  <div class="layui-form-item">
  <div class="layui-inline">
    <label class="layui-form-label">人员岗位</label>
    <div class="layui-input-inline">
      <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-inline">
    <label class="layui-form-label">人员类型</label>
    <div class="layui-input-block">
      <select name="interest" lay-filter="aihao">
        <option value=""></option>
        <option value="0">正式</option>
        <option value="1" selected="">临时</option>
        <option value="2">其他</option>
      </select>
    </div>
    </div>
  </div>
  
  
  <div class="layui-form-item" pane="">
  	<div class="layui-inline">
	    <label class="layui-form-label">人员状态-开</label>
	    <div class="layui-input-block">
	      <input type="checkbox" checked="" name="open" lay-skin="switch" lay-filter="switchTest" title="启用停用">
	    </div>
    </div>
    <div class="layui-inline">
    	<label class="layui-form-label">性别</label>
	    <div class="layui-input-block">
	      <input type="radio" name="sex" value="男" title="男" checked="">
	      <input type="radio" name="sex" value="女" title="女">
	      <input type="radio" name="sex" value="禁" title="禁用" disabled="">
	    </div>
    </div>
  </div>
 <!--  <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
  <legend>演示上传</legend>
</fieldset>
<div class="site-demo-upload">
  <img id="LAY_demo_upload" src="/Users/Patrick/Downloads/patrick/发票.jpg">
  <div class="site-demo-upbar">
    <input type="file" name="file" class="layui-upload-file" id="test">
  </div>
</div>
 -->
  <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">备注</label>
    <div class="layui-input-block">
      <textarea name="content" placeholder="请输入内容" class="layui-textarea"></textarea>
    </div>
  </div>
  <div style="width: 100%" align="center">
    <button class="layui-btn" lay-submit="" lay-filter="demo2">保存</button>
  </div>
</form>
          
<script src="<%=basePath %>/static/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form()
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  
  //创建一个编辑器
  var editIndex = layedit.build('LAY_demo_editor');
 
  //自定义验证规则
  form.verify({
    title: function(value){
      if(value.length < 5){
        return '标题至少得5个字符啊';
      }
    }
    ,pass: [/(.+){6,12}$/, '密码必须6到12位']
    ,content: function(value){
      layedit.sync(editIndex);
    }
  });
  
  //监听指定开关
  form.on('switch(switchTest)', function(data){
    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
      offset: '6px'
    });
    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
  });
  
  //监听提交
  form.on('submit(demo1)', function(data){
    layer.alert(JSON.stringify(data.field), {
      title: '最终的提交信息'
    })
    return false;
  });
  
  
});
</script>

</body>
</html>