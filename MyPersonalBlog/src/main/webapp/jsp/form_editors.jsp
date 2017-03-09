<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
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
<script src="<%=baseViewPath %>js/jquery.min.js"></script>
<link href="<%=baseViewPath %>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
<script src="<%=baseViewPath %>js/bootstrap.min.js?v=3.3.5"></script>
<link href="<%=baseViewPath %>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
<script src="<%=baseViewPath %>js/plugins/summernote/summernote.min.js"></script>
<script src="<%=baseViewPath %>js/plugins/summernote/summernote-zh-CN.js"></script>
<link href="<%=baseViewPath %>css/style.min.css?v=4.0.0" rel="stylesheet">
<link href="<%=baseViewPath %>css/animate.min.css" rel="stylesheet">
<link href="<%=baseViewPath %>css/plugins/summernote/summernote.css" rel="stylesheet">
<link href="<%=baseViewPath %>css/plugins/summernote/summernote-bs3.css" rel="stylesheet">

<script src="<%=baseViewPath %>js/content.min.js?v=1.0.0"></script>

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
								<input type="text" class="form-control" id="articletitle" value="${articleLableComment.aTarticle.vcArticletitle }">

								<div class="input-group-btn">
									<!-- 类型 -->
									<c:if test="${articleLableComment.articletype.vcTypename != null}">
										<button data-toggle="dropdown" class="btn btn-white dropdown-toggle" type="button" data-typeid="${articleLableComment.articletype.vcTypeid }">
											${articleLableComment.articletype.vcTypename } <span class="caret"></span></button>
									</c:if>
									<c:if test="${articleLableComment.articletype.vcTypename == null}">
										<button data-toggle="dropdown" class="btn btn-white dropdown-toggle" type="button">类型 <span class="caret"></span></button>
									</c:if>
									
									<!-- 类型列表 -->
									<ul class="dropdown-menu pull-right">
										<c:forEach items="${articletypes }" var="articletype" varStatus="status">
											<li><a onclick="selectType(this)" data-typeid="${articletype.vcTypeid }">${articletype.vcTypename }</a></li>
											<!--<span hidden id="articletypeid${status.index }"></span>-->
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
						
							${articleLableComment.aTarticle.vcArticlecontent }


						</div>
						
					</div>

				</div>
			</div>
			
			<div class="ibox-content">
                    <p id="mylable">
                    	<c:forEach items="${articleLableComment.articleLables }" var="mylable">
                    		<a class="btn btn-info btn-rounded" onclick="deleteLable(this)" data-lableid="${mylable.vcLableid }">
                    			${mylable.vcLablename }
                    		</a>
                    	
                    	</c:forEach>
                    	
                        <!--
						<a class="btn btn-info btn-rounded" >java</a>
						<a class="btn btn-info btn-rounded" >框架</a>
						<a class="btn btn-info btn-rounded" >开发语言</a>
						-->
                    </p>

                    <h3 class="font-bold">选择标签</h3>
                    <p id="alllable">
					
						<c:forEach items="${lables }" var="lable" varStatus="status">
							
							 
							<button type="button" onclick="selectLable(this)" class="btn btn-outline btn-info" data-lableid="${lable.vcLableid}">
								${lable.vcLablename}
							</button>
							 
						</c:forEach>
						<!--
	                        <button type="button" class="btn btn-outline btn-default">默认</button>
	                        <button type="button" class="btn btn-outline btn-primary">主要</button>
	                        <button type="button" class="btn btn-outline btn-success">成功</button>
	                        <button type="button" class="btn btn-outline btn-info">信息</button>
	                        <button type="button" class="btn btn-outline btn-warning">警告</button>
	                        <button type="button" class="btn btn-outline btn-danger">危险</button>
						-->
                    </p>
                    
                    <p>
                        <button type="button" class="btn btn-block btn-outline btn-primary" onclick="submit()">发表</button>
                    </p>
            </div>
			
			
			<!--<button id="save" class="btn btn-primary" onclick="submit()" type="button">发表</button> -->
		</div>

		

	</div>
	<script>
		$(document).ready(function() {
			$(".summernote").summernote({
				lang : "zh-CN",
				height: "300px", 
				onImageUpload: function(files, editor, $editable) {  
			    sendFile(files[0],editor,$editable);  
			    }
				
			});
			
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
	


	<script language="javascript">

		//选择类型 
		function selectType(obj){

			var type = $(obj).text();
			var typeid = $(obj).data("typeid");

			$(".input-group-btn button").text(type);
			$(".input-group-btn button").data("typeid" , typeid);//设置id
			$(".input-group-btn button").append("<span class=\"caret\"></span>");
			

		}
		
		//添加 标签
		function selectLable(obj){
			var lable = $(obj).text(); 
			var lableid = $(obj).data("lableid"); //lableid
			
			//遍历,去重
			var flag = "0";
			 $("#mylable").children().each(function(){
				var lab = $(this).text();
				if($.trim(lab) == $.trim(lable)){
					//存在相同的标签则，不增加
					flag = "1";
					return false;
				}
			});
			//遍历之后，增加标签
			if(flag == "0"){
				$("#mylable").append("<a class=\"btn btn-info btn-rounded\" onclick=\"deleteLable(this)\" data-lableid="+lableid+">"+lable+"</a>");
			}
			$(obj).remove();
			
		}
		
		//删除标签
		function deleteLable(obj){
			var lable = $(obj).text();
			var lableid = $(obj).data("lableid"); //lableid
			
			var flag = "0";
			$("#alllable").children().each(function(){
				var lab = $(this).text();
				 if($.trim(lab) == $.trim(lable)){
					//存在相同的标签则，不增加
					flag = "1";
					return false;
				}
			});
			if(flag == "0"){
				$("#alllable").append("<button type=\"button\" onclick=\"selectLable(this)\" class=\"btn btn-outline btn-info\" data-lableid="+lableid+">"+lable+"</button>");
			}
			$(obj).remove();
			
		}
		
	
		function sendFile(file, editor, $editable) {
			data = new FormData();
			data.append("file", file);
			
			$.ajax({
				data : data,
				type : "POST",
				url : "${pageContext.request.contextPath}/admin/upload.action",
				cache : false,
				contentType : false,
				processData : false,
				success : function(url) {
					editor.insertImage($editable, url);
				}
			});
		}
		
		//提交，新增博客
		function submit(){
			var articleId = "${articleLableComment.aTarticle.vcArticleid }";
			console.log(articleId);
			var articletitle = $("#articletitle").val();
			var articletype = $(".input-group-btn button").data("typeid");//id存放在data当中	
			var articlecontent = $('.summernote').code();
			//获取标签, 是一个List，需要循环遍历
			
			var vcLableid = ""; 
			$("#mylable").children().each(function(){
				var lable = $(this).data("lableid");
				if (lable != null && lable != undefined && lable != '') {
					vcLableid = vcLableid  + $(this).data("lableid") + ",";
				}	
			});
			
			$(".summernote").summernote({
				lang : "zh-CN",
				height: "300px", 
				callbacks:{
					onImageUpload:function(files){
						img = sendFile(files[0]);
					}
				}
			});
			
			var url = "";
			/*如果id不为空，则请求修改*/
			if (articleId != null && articleId != undefined && articleId != '') {
				url = "${pageContext.request.contextPath}/admin/saveUpdateArticle.action";
			}else{
				url = "${pageContext.request.contextPath}/admin/savearticle.action";
			}
			
			console.log(articleId + "," + url);

			$.ajax({ 
					url: url,
					type:"POST",
					data:{'articleId':articleId ,'vcArticletitle' : articletitle,'cArticletype' : articletype,'vcArticlecontent' : articlecontent ,'vcLableid' : vcLableid},
					success: function(data){
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
							/*如果id不为空，则请求修改*/
							if (articleId != null && articleId != undefined && articleId != '') {
								// 如果是修改，则刷新列表页面
								window.location.href ="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=1";
							}else{
								//新增博文刷新写博客页面
								window.location.href ="${pageContext.request.contextPath}/admin/writearticle.action";
							}
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