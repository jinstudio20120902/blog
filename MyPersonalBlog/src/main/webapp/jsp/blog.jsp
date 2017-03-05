<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

    <link href="<%=baseViewPath %>css/animate.min.css" rel="stylesheet">
    <link href="<%=baseViewPath %>css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_self">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content  animated fadeInRight blog">
        <div class="row">
            <div class="col-lg-4">
				<c:forEach items="${articleList }" var="articleLableComment">
					<div class="ibox">
	                    <div class="ibox-content">
							
	                        <a href="${pageContext.request.contextPath}/admin/findArticltById.action?articleId=${articleLableComment.aTarticle.vcArticleid}" class="btn-link" target="_blank">
	                        	<!-- 标题 -->
								
								 <h2>
									<span class="label label-primary">${articleLableComment.articletype.vcTypename}</span>
	                             	${articleLableComment.aTarticle.vcArticletitle}
	                             </h2>
	                        </a>
	                        <div class="small m-b-xs">
	                            <!-- <strong>高 晨</strong> --> 
								
	                            <!-- 发表时间 -->
	                            <span class="text-muted">
	                            	<i class="fa fa-clock-o"></i> 
	                            	<fmt:formatDate value="${articleLableComment.aTarticle.dtPublishtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
	                            </span>
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
	                                    <div> <i class="fa fa-comments-o"> </i> 56 评论 </div>
	                                    <i class="fa fa-eye"> </i> 144 浏览
	                                </div>
	                            </div>
	                        </div>
	                    </div>
	                </div>
				</c:forEach>
				
			
                <!-- <div class="ibox">
                    <div class="ibox-content">
                        <a href="article.html" class="btn-link">
                            <h2>
                                    想知道宁泽涛每天游多少圈？送他 Misfit 最新款 Speedo Shine
                                </h2>
                        </a>
                        <div class="small m-b-xs">
                            <strong>高 晨</strong> <span class="text-muted"><i class="fa fa-clock-o"></i> 3 小时前</span>
                        </div>
                        <p>
                            就算你敢带着 Apple Watch 下水游泳，它也不能记录你游了多少圈。 夏天刚来时就不停地听到有人提起“有没有在我游泳的时候可以帮忙数圈的设备”，今天 Misfit 终于赶在夏天结束之前推出可追踪游泳运动的新款 Shine。这款新设备是 Misfit 与泳衣品牌 Speedo （速比涛）合作推出，因此被命名为 Speedo Shine。
                        </p>
                        <div class="row">
                            <div class="col-md-6">
                                <h5>标签：</h5>
                                <button class="btn btn-primary btn-xs" type="button">Apple Watch</button>
                                <button class="btn btn-white btn-xs" type="button">速比涛</button>
                            </div>
                            <div class="col-md-6">
                                <div class="small text-right">
                                    <h5>状态：</h5>
                                    <div> <i class="fa fa-comments-o"> </i> 56 评论 </div>
                                    <i class="fa fa-eye"> </i> 144 浏览
                                </div>
                            </div>
                        </div>
                    </div>
                </div> -->
                
				<!--分页-->
				<div class="hr-line-dashed"></div>
				<div class="text-center">
					<div class="btn-group">
						<!-- 上一页 -->
						<c:choose>
							<c:when test="${page.pageNow -1 >0 }">
								<button class="btn btn-white" type="button">
									<i class="fa fa-chevron-left">
										<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${page.pageNow - 1 }">上一页</a>
									</i>
								</button>	
							</c:when>
							<c:when test="${page.pageNow -1 <=0 }">
								<button class="btn btn-white" type="button">
									<i class="fa fa-chevron-left">
										<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=1">上一页</a>
									</i>
								</button>	
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
											<button class="btn btn-white active"><a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${i }">${i }</a></button>
										</c:when>
										<c:otherwise>
											<button class="btn btn-white"><a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${i }">${i }</a></button>
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
								<button class="btn btn-white" type="button">
									<i class="fa fa-chevron-right">
										<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${page.pageNow}">下一页</a>
									</i>
								</button>	
							</c:when>
							<c:when test="${page.pageNow + 1 < page.totalPageCount}">
								<button class="btn btn-white" type="button">
									<i class="fa fa-chevron-right">
										<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${page.pageNow + 1}">下一页</a>
									</i>
								</button>	
							</c:when>
							<c:when test="${page.pageNow + 1 >= page.totalPageCount}">
								<button class="btn btn-white" type="button">
									<i class="fa fa-chevron-right">
										<a href="${pageContext.request.contextPath}/admin/findAllArticlePage.action?pageNow=${page.totalPageCount}">下一页</a>
									</i>
								</button>	
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
    <script src="<%=baseViewPath %>js/content.min.js?v=1.0.0"></script>
    <!--<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>-->
</body>

</html>