<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp" %>
<%@ include file="/WEB-INF/jsp/include/server_variables.jsp" %>
<%@ include file="/WEB-INF/jsp/include/js_variables.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title><decorator:title default="Chào mừng bạn đến với website thuê xe miền trung">Chào mừng bạn đến với website thuê xe miền trung</decorator:title> </title>

<!-- Bootstrap core CSS -->
<!-- Bootstrap -->
<link rel="stylesheet" href="${contextPath}/assets/lib/bootstrap/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="${contextPath}/assets/lib/Font-Awesome/css/font-awesome.min.css">

<!-- Metis core stylesheet -->
<link rel="stylesheet" href="${contextPath}/assets/css/main.min.css">
<link rel="stylesheet" href="${contextPath}/assets/css/theme.css">
<!-- Add custom CSS here -->
<link href="${contextPath}/assets/css/shop-homepage.css" rel="stylesheet">
<link href="${contextPath}/assets/css/banner.css" rel="stylesheet">

<decorator:head></decorator:head>
</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#home">Trang chủ</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="#about">Giới Thiệu</a>
                    </li>
                    <li><a href="#services">Tin Tức</a>
                    </li>
                    <li><a href="#contact">Liên Hệ</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <div class="container" id="hinhnen">
		
        <div id="t-header" class="row">
           		<div class="col-lg-12">
                        <div  class="col-md-4" id="logo" >
                        <a href="#">
                        <img src="${contextPath}/assets/img/logobanner.png"  title="logo" alt="logo"></a>
                        </div>
                        <div class="col-lg-8">
                      	<div class="links"> 
        				<a href="${contextPath}/user/sign_in.jv" id="login-total">Đăng nhập</a>  
                        <a href="${contextPath}/user/sign_up.jv" id="register-total">Đăng kí</a> 	
                        					
    					</div>
                    </div>
               </div>
            </div>
            <br>
            <hr> 
        <div class="row">
				<decorator:body></decorator:body>
        </div>

    </div>
    <!-- /.container -->

    <div class="container">

        <hr>

        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Company 2014 -Lê Đình Thoa <a href="#">Maks</a>
                    </p>
                </div>
            </div>
        </footer>

    </div>
	<!-- /.container -->

	<!-- JavaScript -->
	<script src="${contextPath}/assets/lib/jquery.min.js"></script>
	<script src="${contextPath}/assets/lib/bootstrap/js/bootstrap.min.js"></script>
	<script src="${contextPath}/assets/lib/screenfull/screenfull.js"></script>
	<script src="${contextPath}/assets/js/main.min.js"></script>

</body>

</html>
