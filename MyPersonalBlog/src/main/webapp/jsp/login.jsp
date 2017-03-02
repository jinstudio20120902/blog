<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%  
	String path = request.getContextPath();  
	String baseViewPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/jsp/";  
%> 

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>我的个人博客 - 登录</title>
    <!-- <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">
 -->
    <link rel="shortcut icon" href="<%=baseViewPath %>favicon.ico"> 
    <link href="<%=baseViewPath %>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="<%=baseViewPath %>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">

    <link href="<%=baseViewPath %>css/animate.min.css" rel="stylesheet">
    <link href="<%=baseViewPath %>css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_self">
    <!--[if lt IE 8]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>

<body class="gray-bg">
    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">I+</h1>

            </div>
            <h3>欢迎回来</h3>
            <h5 style="color:red">${errorInfo }</h5>

            <form class="m-t" role="form" method="post" action="${pageContext.request.contextPath}/user/login.action">
           	 <div class="form-group">
                    <input type="email" name="vcUsername" class="form-control" placeholder="用户名" required="">
                </div>
                <div class="form-group">
                    <input type="password" name="vcPassword"  class="form-control" placeholder="密码" required="">
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>


               <!--  <p class="text-muted text-center"> <a href="login.html#"><small>忘记密码了？</small></a> | <a href="register.html">注册一个新账号</a>
                </p> -->

            </form>
        </div>
    </div>
    <script src="<%=baseViewPath %>js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=baseViewPath %>js/bootstrap.min.js?v=3.3.5"></script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>