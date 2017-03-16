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
    

    <title>Errol的个人博客</title>

   
	<link href="<%=baseViewPath %>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="<%=baseViewPath %>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="<%=baseViewPath %>css/animate.min.css" rel="stylesheet">
    <link href="<%=baseViewPath %>css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg top-navigation">

    <div id="wrapper">
        <div id="page-wrapper" class="gray-bg">
            <div class="row border-bottom white-bg">
                <nav class="navbar navbar-static-top" role="navigation">
                    <div class="navbar-header">
                        <button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
                            <i class="fa fa-reorder"></i>
                        </button>
                        <a href="#" class="navbar-brand" target="_self">学无止境、滴水石穿</a>
						
						
						<!--
						<a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#">
						<i class="fa fa-search"></i> </a>
						
                        <form role="search" class="navbar-form-custom" method="post" action="">
                            <div class="form-group">
                                <input type="text" placeholder="请输入您需要查找的内容 …" class="form-control" name="top-search" id="top-search">
                            </div>
							
                        </form>
						-->
						
						
                    </div>
					
					
					
                    <div class="navbar-collapse collapse" id="navbar">
                        <ul class="nav navbar-nav navbar-right">

                            <li class="dropdown">
                                <a aria-expanded="false" role="button" href="#" class="dropdown-toggle" > 全部文章 </a>
                                
                            </li>
                            <li class="dropdown">
                                <a aria-expanded="false" role="button" href="#" class="dropdown-toggle"> 留言板 </a>
                               
                            </li>
							
							<li>
                                <a href="${pageContext.request.contextPath}/jsp/login.jsp">
                                    <i class="fa fa-sign-out"></i> 登录
                                </a>
                            </li>

                        </ul>
                        <!--<ul class="nav navbar-top-links navbar-right">
                            <li>
                                <a href="${pageContext.request.contextPath}/jsp/login.jsp">
                                    <i class="fa fa-sign-out"></i> 退出
                                </a>
                            </li>
                        </ul>-->
                    </div>
                </nav>
            </div>
            <div class="wrapper wrapper-content">
                <div class="container">
					<div class="row">
				
						<div class="col-sm-3 white-bg">
							<div class="widget-head-color-box navy-bg p-lg text-center">
								<div class="m-b-md">
									<h2 class="font-bold no-margins">
											${bloger.vcUsername }
										</h2>
									<small>博主</small>
								</div>
								<img src="<%=baseViewPath %>img/a3.jpg" class="img-circle circle-border m-b-md" alt="profile">
								<div>
									<!-- 文章数 -->
									<span>${fn:length(bloger.articleList)}文章</span> |
									
									<!-- 留言数 -->
									<span>350 留言</span> 
									
								</div>
							</div>
							<div class="widget-text-box">
								<h4 class="media-heading">一个不会写程序的程序猿</h4>
								<hr>
								<p>您是本站第${viewCount }位访客~</p>
								<div class="text-right">
									<a class="btn btn-xs btn-white"><i class="fa fa-thumbs-up"></i> 赞 </a>
									<a class="btn btn-xs btn-primary"><i class="fa fa-heart"></i> 留言</a>
								</div>
							</div>
						</div>	
						
						
						<div class="col-sm-9">
							<div class="tabs-container">
								<ul class="nav nav-tabs">
									<li class="active"><a data-toggle="tab" href="#tab-1" aria-expanded="true"> 最近心情</a>
									</li>
									<li class=""><a data-toggle="tab" href="#tab-2" aria-expanded="false">最新文章</a>
									</li>
									<li class=""><a data-toggle="tab" href="#tab-3" aria-expanded="false">最热文章</a>
									</li>
								</ul>
								<div class="tab-content">
									<div id="tab-1" class="tab-pane active">
										<div class="panel-body">
											<p>学无止境</p>
										</div>
									</div>
									
									
									
									<div id="tab-2" class="tab-pane">
										<div class="panel-body">
										
											<!-- 最新文章 -->
											<c:set var="flag" value="true" /> 
											<c:forEach items="${bloger.articleList }" var="article" varStatus="status">
												<!-- 文章数量大于3篇，则只显示三篇 -->
												<c:if test="${fn:length(bloger.articleList) > 3 }">
													<c:if test="${flag }">
														<div class="feed-element">
															<div class="pull-left">
																<!-- 这里后期将图片修改为文章类型 -->
																<img alt="image" class="img-circle" src="<%=baseViewPath %>img/profile.jpg">
															</div>
															<a href="${pageContext.request.contextPath}/blog/${bloger.vcUsername}/${article.aTarticle.vcArticleid}" class="btn-link">
																
																<div class="media-body ">
																	<!-- 标题和时间 -->
																	
																	<h3><strong>${article.aTarticle.vcArticletitle }</strong></h3>
																	<small class="pull-right text-muted">
																		<i class="fa fa-clock-o"></i> 
																		<fmt:formatDate value="${article.aTarticle.dtPublishtime }" pattern="yyyy-MM-dd HH:mm:ss"/>
																	</small>
																	<br>
																	
																	<!-- 摘要 -->
																	<%-- <div class="well">
																		${article.aTarticle.vcArticlecontent}
																	</div> --%>
																	
																	<!-- 文章标签-->
																	<div class="pull-left">
																		<c:forEach items="${article.articleLables}" var="lable">
																			<button class="btn btn-white btn-xs" type="button">${lable.vcLablename }</button>
																		</c:forEach>
																	</div>

																	<div class="pull-right">
																		<span class="text-muted">
																			<i class="fa fa-comments-o"> </i> 
																				${fn:length(article.articleComments)}评论&nbsp;
																			 <i class="fa fa-eye"> </i> 
																				${article.aTarticle.nClicknum }浏览
																		</span>
																	</div>
																	
																</div>
															
															</a>
														</div>
														<hr>
														<c:if test="${status.index == 2 }">
															<c:set var="flag" value="false"/>
														</c:if>
													</c:if>
												</c:if>
												<!-- 文章数量小于等于3，则全部显示 -->
												<c:if test="${fn:length(bloger.articleList) <= 3 }">
													<div class="feed-element">
														<div class="pull-left">
															<!-- 这里后期将图片修改为文章类型 -->
															<img alt="image" class="img-circle" src="<%=baseViewPath %>img/profile.jpg">
														</div>
														<a href="${pageContext.request.contextPath}/blog/${bloger.vcUsername}/${article.aTarticle.vcArticleid}" class="btn-link">
															
															<div class="media-body ">
																<!-- 标题和时间 -->
																
																<strong>${article.aTarticle.vcArticletitle }</strong> 
																<small class="pull-right text-muted">
																	<i class="fa fa-clock-o"></i> 
																	<fmt:formatDate value="${article.aTarticle.dtPublishtime }" pattern="yyyy-MM-dd HH:mm:ss"/>
																</small>
																<br>
																
																<!-- 摘要 -->
																<div class="well">
																	${article.aTarticle.vcArticlecontent}
																</div>
																
																<!-- 文章标签-->
																<div class="pull-left">
																	<c:forEach items="${article.articleLables}" var="lable">
																		<button class="btn btn-white btn-xs" type="button">${lable.vcLablename }</button>
																	</c:forEach>
																</div>

																<div class="pull-right">
																	<span class="text-muted">
																		<i class="fa fa-comments-o"> </i> 
																			${fn:length(article.articleComments)}评论&nbsp;
																		 <i class="fa fa-eye"> </i> 
																			${article.aTarticle.nClicknum }浏览
																	</span>
																</div>
																
															</div>
														
														</a>
													</div>
												</c:if>
											</c:forEach>
										
										
										
											
											
											
										
											<button class="btn btn-primary btn-block m"><i class="fa fa-arrow-down"></i> 显示更多</button>
										
										</div>
									</div>
									<div id="tab-3" class="tab-pane">
										<div class="panel-body">
									
											
										</div>
										
										
									</div>
								</div>


							</div>
						</div>
						
						

						
					</div>
                </div>
            </div>
            <div class="footer">
                <div class="pull-right">
                    By：<a href="#" target="_blank">Errol's blog</a>
                </div>
                <div>
                    <strong>Copyright</strong> &copy; 2017
                </div>
            </div>
			
        </div>
    </div>

    <script src="<%=baseViewPath %>js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=baseViewPath %>js/bootstrap.min.js?v=3.3.5"></script>
	<!--
    <script src="js/content.min.js?v=1.0.0"></script>
	-->
    
</body>

</html>