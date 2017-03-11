<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    

    <title>我的个人博客 - 文章列表</title>
    <link rel="shortcut icon" href="favicon.ico"> 
	<link href="<%=baseViewPath %>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="<%=baseViewPath %>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
	<link href="<%=baseViewPath %>css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <link href="<%=baseViewPath %>css/animate.min.css" rel="stylesheet">
    <link href="<%=baseViewPath %>css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_self">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content  animated fadeInRight blog">
        <div class="row">
            <div class="col-lg-4">
				<c:forEach items="${articleList }" var="articleLableComment">
					<div class="ibox" data-articleid="${articleLableComment.aTarticle.vcArticleid}">
	                    <div class="ibox-content">
							<div class="ibox-tools">
							<!--编辑 -->
								<a class="dropdown-toggle">
									<i class="fa fa-wrench"></i>
								</a>
							<!--删除 -->
								<a class="close-link">
									<i class="fa fa-times"></i>
								</a>
							</div>
	                        <a href="${pageContext.request.contextPath}/admin/findArticltById.action?articleId=${articleLableComment.aTarticle.vcArticleid}" class="btn-link" target="_blank">
	                        	<!-- 标题 -->
								
								 <h2>
									<span class="label label-primary">${articleLableComment.articletype.vcTypename}</span>
	                             	${articleLableComment.aTarticle.vcArticletitle}
	                             </h2>
								 <!--操作-->
								 
								 
	                        </a>
							
	                        <div class="small m-b-xs">
	                            <!-- <strong>高 晨</strong> --> 
								
	                            <!-- 发表时间 -->
	                            <span class="text-muted">
	                            	<i class="fa fa-clock-o"></i> 
	                            	<fmt:formatDate value="${articleLableComment.aTarticle.dtPublishtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
	                            </span>
	                        </div>
							<!-- 文章内容摘要 -->
	                         <div class="content">
	                           ${articleLableComment.aTarticle.vcArticlecontent}
	                         </div> 
	                       
	                       
	                    
	                        <div class="row">
	                            <div class="col-md-6">
	                                <h5>标签：</h5>
	                                <c:forEach items="${articleLableComment.articleLables}" var="lable">
	                                	<button class="btn btn-white btn-xs" type="button">${lable.vcLablename }</button>
	                                
	                                </c:forEach>
	                                
	                               <!--  <button class="btn btn-primary btn-xs" type="button">Apple Watch</button>
	                                <button class="btn btn-white btn-xs" type="button">速比涛</button> -->
	                            </div>
	                            <div class="col-md-6">
	                                <div class="small text-right">
	                                    <h5>状态：</h5>
	                                    <div> <i class="fa fa-comments-o"> </i> ${fn:length(articleLableComment.articleComments)}评论 </div>
	                                    <i class="fa fa-eye"> </i> ${articleLableComment.aTarticle.nClicknum }浏览
	                                </div>
	                            </div>
	                        </div>
	                    </div>
	                </div>
				</c:forEach>
				

                
				<!--分页-->
				<div class="hr-line-dashed"></div>
				<div class="text-center">
					<div class="btn-group">
						<!-- 上一页 -->
						<c:choose>
							<c:when test="${page.pageNow -1 >0 }">
								<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${page.pageNow - 1 }">
									<button class="btn btn-white" type="button">
										<i class="fa fa-chevron-left">
											上一页
										</i>
									</button>
								</a>	
							</c:when>
							<c:when test="${page.pageNow -1 <=0 }">
								<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=1">
									<button class="btn btn-white" type="button">
										<i class="fa fa-chevron-left">
											上一页
										</i>
									</button>	
								</a>								
							</c:when>
						</c:choose>
						
						<!-- <button class="btn btn-white" type="button">
							<i class="fa fa-chevron-left"><a>上一页</a></i>
						</button> -->
						
						<!-- 页数 -->
						<c:choose>
							<c:when test="${page.totalPageCount > 0 }">
								<c:forEach var="i" begin="1" end="${page.totalPageCount }">
									<c:choose>
										<c:when test="${i == page.pageNow }">
											<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${i }">
												<button class="btn btn-white active">${i }</button>
											</a>
										</c:when>
										<c:otherwise>
											<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${i }">
												<button class="btn btn-white">${i }</button>
											</a>
										</c:otherwise>
									</c:choose>
								</c:forEach>						
							</c:when>
						</c:choose>
						
						
						<!-- <button class="btn btn-white active">1</button>
						<button class="btn btn-white">2</button>
						<button class="btn btn-white">3</button>
						<button class="btn btn-white">4</button>
						<button class="btn btn-white">5</button>
						<button class="btn btn-white">6</button>
						<button class="btn btn-white">7</button> -->
						
						<!-- 下一页 -->
						<c:choose>
							<c:when test="${page.totalPageCount == 0 }">
								<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${page.pageNow}">
									<button class="btn btn-white" type="button">
										<i class="fa fa-chevron-right">
											下一页
										</i>
									</button>
								</a>	
							</c:when>
							<c:when test="${page.pageNow + 1 < page.totalPageCount}">
								<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${page.pageNow + 1}">
									<button class="btn btn-white" type="button">
										<i class="fa fa-chevron-right">
											下一页
										</i>
									</button>
								</a>	
							</c:when>
							<c:when test="${page.pageNow + 1 >= page.totalPageCount}">
								<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${page.totalPageCount}">
									<button class="btn btn-white" type="button">
										<i class="fa fa-chevron-right">
											下一页
										</i>
									</button>
								</a>	
							</c:when>
						</c:choose>
						
						<!-- <button class="btn btn-white" type="button">
							<i class="fa fa-chevron-right"></i>
						</button> -->
						
					</div>
				</div>
				
            </div>
        </div>
    </div>
    
    <script src="<%=baseViewPath %>js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=baseViewPath %>js/bootstrap.min.js?v=3.3.5"></script>
    <%-- <script src="<%=baseViewPath %>js/content.min.js?v=1.0.0"></script> --%>
    <!--<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>-->
	<script src="<%=baseViewPath %>js/plugins/sweetalert/sweetalert.min.js"></script>
	<script type="text/javascript">
	  
	    //把文章列表里面的图片标签去掉
      	$(".content").children("img").remove();
        //然后显示摘要
        $(".content").html(function(){
	        	$(this).html($(this).html().substring(0,190));
        });   
      
             
		//编辑
		$(".dropdown-toggle").click(function(){
			 
			var articleId=$(this).closest("div.ibox").data("articleid");
			
		
			/* //菜单标题修改 
			$(".page-tabs-content").children("a[class='active J_menuTab']").text("修改文章<i class=\"fa fa-times-circle\"></i>");
			$(".page-tabs-content").children("a[class='active J_menuTab']").data("id" , articleId);
			 */			
			//发送页面请求
			window.location.href="${pageContext.request.contextPath}/admin/updateArticltById.action?articleId="+articleId;
		
		});
		
		
		
		//删除
		$(".close-link").click(function(){
			var o=$(this).closest("div.ibox");
			
			swal({
			        title: "您确定要删除这条博客吗",
			        text: "删除后将无法恢复，请谨慎操作！",
			        type: "warning",
			        showCancelButton: true,
			        confirmButtonColor: "#DD6B55",
			        confirmButtonText: "删除",
			        closeOnConfirm: false
			    }, function () {
			    	//获取id			    	
			    	//var articleId = $(this).parent().parent().parent().data("articleid");
			    	var articleId = o.data("articleid");
			    	//发送ajax请求
			    	$.ajax({
			    		url : "${pageContext.request.contextPath}/admin/deleteArticltById.action",
			    		type:"post",
			    		data:{'articleId':articleId},
			    		dataType:'json',
			    		success : function(result) {
							if(result.status==1){
								swal("删除成功！", "您已经永久删除了这篇文章。", "success");
								 //var o=$(this).closest("div.ibox");
								o.remove(); 
							}else{
								swal("删除失败！", result.message, "error");
							}
						}
			    	
			    	});
			    	
			        
			    });
		
		});
		
		
                
	</script>
   
	
</body>

</html>