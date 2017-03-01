<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<%  
	String path = request.getContextPath();  
	String baseViewPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/jsp/";  
%> 
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>写博客</title>

<link rel="shortcut icon" href="favicon.ico">
<link href="<%=baseViewPath %>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
<link href="<%=baseViewPath %>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
<link href="<%=baseViewPath %>css/animate.min.css" rel="stylesheet">
<link href="<%=baseViewPath %>css/plugins/summernote/summernote.css" rel="stylesheet">
<link href="<%=baseViewPath %>css/plugins/summernote/summernote-bs3.css" rel="stylesheet">
<link href="<%=baseViewPath %>css/style.min.css?v=4.0.0" rel="stylesheet">
<base target="_blank">

</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content">

		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<div class="form-group">
						
							<div class="input-group">
								<input type="text" class="form-control" id="articletitle" value="博客标题">

								<div class="input-group-btn">
									<button data-toggle="dropdown" class="btn btn-white dropdown-toggle" type="button">类型 <span class="caret"></span>
									</button>
									<ul class="dropdown-menu pull-right">
										
										<c:forEach items="${articletypes }" var="articletype">
											<li><a onclick="selectType(this)">${articletype.vcTypename }</a></li><span hidden id="articletypeid">${articletype.vcTypeid }</span>
										</c:forEach>
										
							
										
									</ul>
								</div>
							</div>
							<!--<label class="col-sm-2 ">写博客</label>-->
							
							<!--<input type="text" id="articletitle" class="form-control" value="博客标题">-->
							
						</div>
						<!--
						<h5>
							新建博客
						</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a> <a class="dropdown-toggle" data-toggle="dropdown"
								href="form_editors.html#"> <i class="fa fa-wrench"></i>
							</a>
							<ul class="dropdown-menu dropdown-user">
								<li><a href="form_editors.html#">选项1</a></li>
								<li><a href="form_editors.html#">选项2</a></li>
							</ul>
							<a class="close-link"> <i class="fa fa-times"></i>
							</a>
						</div> -->
					</div>
					
					<!--
					<div class="col-sm-10">
						<input type="text" class="form-control" value="博客标题">
					</div>
					-->

					<div class="ibox-content no-padding">


						<div class="summernote">
							<h2>博文正文</h2>


						</div>
						
					</div>

				</div>
			</div>
			
			<div class="ibox-content">
                    <p>
                        <a class="btn btn-info btn-rounded" >java</a>
						<a class="btn btn-info btn-rounded" >框架</a>
						<a class="btn btn-info btn-rounded" >开发语言</a>
                    </p>

                    <h3 class="font-bold">选择标签</h3>
                    <p>
                        <button type="button" class="btn btn-outline btn-default">默认</button>
                        <button type="button" class="btn btn-outline btn-primary">主要</button>
                        <button type="button" class="btn btn-outline btn-success">成功</button>
                        <button type="button" class="btn btn-outline btn-info">信息</button>
                        <button type="button" class="btn btn-outline btn-warning">警告</button>
                        <button type="button" class="btn btn-outline btn-danger">危险</button>
                    </p>
                    
                    <p>
                        <button type="button" class="btn btn-block btn-outline btn-primary" onclick="submit()">发表</button>
                    </p>
            </div>
			
			
			<!--<button id="save" class="btn btn-primary" onclick="submit()" type="button">发表</button> -->
		</div>

		

	</div>
	<script src="<%=baseViewPath %>js/jquery.min.js"></script>
	<script src="<%=baseViewPath %>js/bootstrap.min.js?v=3.3.5"></script>
	<script src="<%=baseViewPath %>js/content.min.js?v=1.0.0"></script>
	<script src="<%=baseViewPath %>js/plugins/summernote/summernote.min.js"></script>
	<script src="<%=baseViewPath %>js/plugins/summernote/summernote-zh-CN.js"></script>
	<script>
		$(document).ready(function() {
			$(".summernote").summernote({
				lang : "zh-CN",
				height: "300px", 
				callbacks:{
					onImageUpload:function(files){
						img = sendFile(files[0]);
					}
				}
			})
		});
		var edit = function() {
			$("#eg").addClass("no-padding");$(".click2edit").summernote({
				lang : "zh-CN",
				focus : true
			})
		};
		var save = function() {
			$("#eg").removeClass("no-padding");
			var aHTML = $(".click2edit").code();
			$(".click2edit").destroy()
		};
	</script>
	<!--
	<script type="text/javascript"
		src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
		-->


	<script language="javascript">

		function selectType(obj){
			console.log(obj);
			
			
			var type = $(obj).text();
			
		
			
			$(".input-group-btn button").text(type);
			
			
			
			
		}
	
		function sendFile(file) {
			data = new FormData();
			data.append("file", file);
			
			$.ajax({
				data : data,
				type : "POST",
				url : "/admin/upload.action",
				cache : false,
				contentType : false,
				processData : false,
				success : function(url) {
					$(".summernote").summernote('insertImage', url.filePath, 'image name'); // the insertImage API  
				}
			});
		}
		
		function submit(){
			var articletitle = $("#articletitle").val();
			var articletype = $("#articletypeid").text();
			var articlecontent = $('.summernote').code();

			$.ajax({ 
					url:"${pageContext.request.contextPath}/admin/savearticle.action",
					type:"POST",
					data:{'vcArticletitle' : articletitle,'cArticletype' : articletype,'vcArticlecontent' : articlecontent },
					success: function(data){
						console.log(data);
						//假设返回的json数据里有status及info2个属性
						//有时候可以直接ajaxobj.status或者ajaxobj["status"]去访问  
						//但有时候，却要通过eval()或者 $.parsejson();才可以通过ajaxobj.status访问，而且这种情况下，需要是complete而不是success
						
						//或者$.parsejson()
						if(data.status == 0)
						{
							alert("请登陆.");
						}
						else if(data.status==1)
						{
							alert("发表成功");
							//刷新页面
							window.location.href ="${pageContext.request.contextPath}/findAllArticleType.action";
						}
					},
					error:function(ajaxobj)
					{
						console.log("error");
					}
				});
			
		}

	</script>

</body>




</html>