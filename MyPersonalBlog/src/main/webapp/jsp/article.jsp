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
    

    <title>我的个人博客 - 文章详情</title> 
	<link href="<%=baseViewPath %>css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="<%=baseViewPath %>css/font-awesome.min.css?v=4.4.0" rel="stylesheet">

    <link href="<%=baseViewPath %>css/animate.min.css" rel="stylesheet">
    <link href="<%=baseViewPath %>css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content  animated fadeInRight article">
        <div class="row">
            <div class="col-lg-10 col-lg-offset-1">
                <div class="ibox">
                    <div class="ibox-content">
						<div class="pull-left">
							<span class="text-muted">
	                            <i class="fa fa-clock-o"></i> 
									<fmt:formatDate value="${article.aTarticle.dtPublishtime}" pattern="yyyy-MM-dd HH:mm:ss"/> &nbsp;
								 <i class="fa fa-comments-o"> </i> 
									${fn:length(article.articleComments)}评论&nbsp;
	                             <i class="fa fa-eye"> </i> 
									${article.aTarticle.nClicknum }浏览
							</span>
						</div>
						
                        <div class="pull-right">
                        	<!-- 标签 -->
                        	<c:forEach items="${article.articleLables }" var="lable">
                        		<button class="btn btn-white btn-xs" type="button">${lable.vcLablename }</button>
                        	</c:forEach>
                            
                        </div>
                        <div class="text-center article-title">
                            <h1>
                            	<!-- 标题 -->
								${article.aTarticle.vcArticletitle}
                            </h1>
                        </div>
							<!--内容-->
							${article.aTarticle.vcArticlecontent}
                        <hr>




						<!-- 评论 -->
                        <div class="row">
                            <div class="col-lg-12">

                                <h2>评论：</h2>
                                <!--  -->
                                <c:forEach items="${article.articleComments}" var="comment">
                                	<div class="social-feed-box">
	                                    <div class="social-avatar">
	                                        <a href="" class="pull-left">
	                                            <img alt="image" src="<%=baseViewPath %>img/a1.jpg">
	                                        </a>
	                                        <div class="media-body">
	                                            <a href="#">
	                                                   		${comment.vcVisitor }
	                                            </a>
	                                            <small class="text-muted">
	                                            	<fmt:formatDate value="${comment.dtComenttime}" pattern="yyyy-MM-dd HH:mm:ss"/>	
	                                            </small>
	                                        </div>
	                                    </div>
	                                    <div class="social-body">
	                                        <p>
	                                           	${comment.vcCommentcontent }
	                                        </p>
	                                    </div>
	                                </div>
                                </c:forEach>
                                
                                <!-- 
                                <div class="social-feed-box">
                                    <div class="social-avatar">
                                        <a href="" class="pull-left">
                                            <img alt="image" src="<%=baseViewPath %>img/a1.jpg">
                                        </a>
                                        <div class="media-body">
                                            <a href="#">
                                                   		 逆光狂胜蔡舞娘
                                            </a>
                                            <small class="text-muted">17 小时前</small>
                                        </div>
                                    </div>
                                    <div class="social-body">
                                        <p>
                                           	 好东西，我朝淘宝准备跟进，1折开卖
                                        </p>
                                    </div>
                                </div>
                              -->   
                                <!-- 评论结束 -->
                                
                            </div>
                        </div>


                    </div>
                </div>
            </div>
        </div>

    </div>
    <script src="<%=baseViewPath %>js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=baseViewPath %>js/bootstrap.min.js?v=3.3.5"></script>
    <script src="<%=baseViewPath %>js/content.min.js?v=1.0.0"></script>
</body>

</html>