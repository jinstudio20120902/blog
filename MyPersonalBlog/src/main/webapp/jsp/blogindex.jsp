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
    

    <title>${bloger.vcUsername }的个人博客</title>

    <%-- <link rel="<%=baseViewPath %>shortcut icon" href="favicon.ico">  --%>
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
                        <a href="#" class="navbar-brand"></a>
						
						
						<a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-search"></i> </a>
                        <form role="search" class="navbar-form-custom" method="post" action="">
                            <div class="form-group">
                                <input type="text" placeholder="请输入您需要查找的内容 …" class="form-control" name="top-search" id="top-search">
                            </div>
							
                        </form>
						
						
                    </div>
					
					
					
                    <div class="navbar-collapse collapse" id="navbar">
                        <ul class="nav navbar-nav">
                            <li class="active">
                                <a aria-expanded="false" role="button" href="#"> 首页</a>
                            </li>
                            <li class="dropdown">
                                <a aria-expanded="false" role="button" href="#" class="dropdown-toggle" > 全部文章 </a>
                                
                            </li>
                            <li class="dropdown">
                                <a aria-expanded="false" role="button" href="#" class="dropdown-toggle"> 留言板 </a>
                               
                            </li>

                        </ul>
                        <ul class="nav navbar-top-links navbar-right">
                            <li>
                                <a href="${pageContext.request.contextPath}/jsp/login.jsp">
                                    <i class="fa fa-sign-out"></i> 退出
                                </a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
            <div class="wrapper wrapper-content">
                <div class="container">
					<div class="row">
				
						<div class="col-sm-3">
							<div class="widget-head-color-box white-bg p-lg text-center">
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
								<h4 class="media-heading">${bloger.vcUsername }</h4>
								<p>程序猿</p>
								<div class="text-right">
									<a class="btn btn-xs btn-white"><i class="fa fa-thumbs-up"></i> 赞 </a>
									<a class="btn btn-xs btn-primary"><i class="fa fa-heart"></i> 留言</a>
								</div>
							</div>
						</div>	
							
						<div class="col-sm-9">
							<!-- <div class="ibox float-e-margins">  -->
							<div class="widget-head-color-box white-bg p-lg">
							
								<div class="ibox-title navy-bg">
									<h5>最新文章</h5>
									
								</div>
								
								<div class="ibox-content">

									<div>
										<div class="feed-activity-list">
										
											<!-- 最新文章 -->
											<c:set var="flag" value="true" /> 
											<c:forEach items="${bloger.articleList }" var="article" varStatus="status">
												<!-- 文章数量大于3篇，则只显示三篇 -->
												<c:if test="${fn:length(bloger.articleList) > 3 }">
													<c:if test="${flag }">
														<div class="feed-element">
															<a href="${pageContext.request.contextPath}/blog/${bloger.vcUsername}/${article.aTarticle.vcArticleid}" class="btn-link">
																<div class="pull-left">
																	<!-- 这里后期将图片修改为文章类型 -->
																	<img alt="image" class="img-circle" src="<%=baseViewPath %>img/profile.jpg">
																</div>
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
														<c:if test="${status.index == 2 }">
															<c:set var="flag" value="false"/>
														</c:if>
													</c:if>
												</c:if>
												<!-- 文章数量小于等于3，则全部显示 -->
												<c:if test="${fn:length(bloger.articleList) <= 3 }">
													<div class="feed-element">
															<a href="${pageContext.request.contextPath}/blog/${bloger.vcUsername}/${article.aTarticle.vcArticleid}" class="btn-link">
																<div class="pull-left">
																	<!-- 这里后期将图片修改为文章类型 -->
																	<img alt="image" class="img-circle" src="<%=baseViewPath %>img/profile.jpg">
																</div>
																<div class="media-body ">
																	<!-- 标题和时间 -->
																	<small class="pull-right text-navy">${article.aTarticle.dtPublishtime }</small>
																	<strong>${article.aTarticle.vcArticletitle }</strong> 
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
										
										
											<!-- <div class="feed-element">
												
												<a href="#" class="pull-left">
													<img alt="image" class="img-circle" src="<%=baseViewPath %>img/profile.jpg">
												</a>
												
												<div class="media-body ">
													<small class="pull-right text-navy">文章时间</small>
													<strong>文章标题</strong> 
													<br>
													
													<div class="well">
														抽奖，人民币2000元，从转发这个微博的粉丝中抽取一人。11月16日平台开奖。随手一转，万一中了呢？
													</div>
													
													
													<div class="actions">
														<button class="btn btn-white btn-xs" type="button">java</button>
														
													</div>
												</div>
											</div>
											 -->
										
										
										
											

											<!--
											<div class="feed-element">
												<a href="profile.html#" class="pull-left">
													<img alt="image" class="img-circle" src="<%=baseViewPath %>img/profile.jpg">
												</a>
												<div class="media-body ">
													<small class="pull-right">5分钟前</small>
													<strong>作家崔成浩</strong> 发布了一篇文章
													<br>
													<small class="text-muted">今天 10:20 来自 iPhone 6 Plus</small>

												</div>
											</div>

											<div class="feed-element">
												<a href="profile.html#" class="pull-left">
													<img alt="image" class="img-circle" src="<%=baseViewPath %>img/a2.jpg">
												</a>
												<div class="media-body ">
													<small class="pull-right">2小时前</small>
													<strong>作家崔成浩</strong> 抽奖中了20万
													<br>
													<small class="text-muted">今天 09:27 来自 Koryolink iPhone</small>
													<div class="well">
														抽奖，人民币2000元，从转发这个微博的粉丝中抽取一人。11月16日平台开奖。随手一转，万一中了呢？
													</div>
													<div class="pull-right">
														<a class="btn btn-xs btn-white"><i class="fa fa-thumbs-up"></i> 赞 </a>
														<a class="btn btn-xs btn-white"><i class="fa fa-heart"></i> 收藏</a>
														<a class="btn btn-xs btn-primary"><i class="fa fa-pencil"></i> 评论</a>
													</div>
												</div>
											</div>
											<div class="feed-element">
												<a href="profile.html#" class="pull-left">
													<img alt="image" class="img-circle" src="<%=baseViewPath %>img/a3.jpg">
												</a>
												<div class="media-body ">
													<small class="pull-right">2天前</small>
													<strong>天猫</strong> 上传了2张图片
													<br>
													<small class="text-muted">11月7日 11:56 来自 微博 weibo.com</small>
													<div class="photos">
														<a target="_blank" href="http://24.media.tumblr.com/20a9c501846f50c1271210639987000f/tumblr_n4vje69pJm1st5lhmo1_1280.jpg">
															<img alt="image" class="feed-photo" src="img/p1.jpg">
														</a>
														<a target="_blank" href="http://37.media.tumblr.com/9afe602b3e624aff6681b0b51f5a062b/tumblr_n4ef69szs71st5lhmo1_1280.jpg">
															<img alt="image" class="feed-photo" src="img/p3.jpg">
														</a>
													</div>
												</div>
											</div>
											<div class="feed-element">
												<a href="profile.html#" class="pull-left">
													<img alt="image" class="img-circle" src="<%=baseViewPath %>img/a4.jpg">
												</a>
												<div class="media-body ">
													<small class="pull-right text-navy">5小时前</small>
													<strong>在水一方Y</strong> 关注了 <strong>那二十年的单身</strong>.
													<br>
													<small class="text-muted">今天 10:39 来自 iPhone客户端</small>
													<div class="actions">
														<a class="btn btn-xs btn-white"><i class="fa fa-thumbs-up"></i> 赞 </a>
														<a class="btn btn-xs btn-white"><i class="fa fa-heart"></i> 收藏</a>
													</div>
												</div>
											</div>

										</div>
										-->

										<button class="btn btn-primary btn-block m"><i class="fa fa-arrow-down"></i> 显示更多</button>

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
    <script src="<%=baseViewPath %>js/content.min.js?v=1.0.0"></script>
    <script type="text/javascript">
    	//把文章列表里面的图片标签去掉
      	$(".well").children("img").remove();
        //然后显示摘要
        $(".well").html(function(){
	        	$(this).html($(this).html().substring(0,190));
        });   
    
    </script>
</body>

</html>