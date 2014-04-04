<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="com.rick.management.car.spring.web.controller.HomeController"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp" %>
<%@ include file="/WEB-INF/jsp/include/server_variables.jsp" %>
<%@ include file="/WEB-INF/jsp/include/js_variables.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chào mừng bạn đến với website cho thuê xe du lịch miền trung</title>
</head>
<body>
<div class="col-md-3">
            	<form class="main-search">
              	<div class="input-group">
                <input type="text" class="input-small form-control" placeholder="Live Search ...">
                <span class="input-group-btn">
                                    <button class="btn btn-primary btn-sm text-muted" type="button"><i class="fa fa-search"></i></button>
                                </span> 
             		 </div>
           		 </form>
                    
                <p class="lead">Danh Mục Xe Cho Thuê</p>
                <div class="list-group">
                    <a href="#" class="list-group-item">Thuê xe 24 chỗ</a>
                    <a href="#" class="list-group-item">Thuê xe 16 chỗ</a>
                    <a href="#" class="list-group-item">Thuê xe 12 chỗ</a>
                    <a href="#" class="list-group-item">Thuê xe 7 chỗ</a>
                    <a href="#" class="list-group-item">Thuê xe 4 chỗ</a>
                    
                </div>
            </div>

            <div class="col-md-9">

                <div class="row carousel-holder">
			
                    <div class="col-md-12">
                        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                            </ol>
                            <div class="carousel-inner">
                          	<div class="item active">       
                                <img class="slide-image" src="${contextPath}/${dmxes.get(0).hinhAnhSlider}" alt="" >
                                </div>
                                <div class="item">
                                    <img class="slide-image" src="${contextPath}/${dmxes.get(5).hinhAnhSlider}" alt="" >
                                </div>
                                <div class="item">
                                    <img class="slide-image" src="${contextPath}/${dmxes.get(4).hinhAnhSlider}" alt="" >
                                </div>
                            </div>
                            <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                                <span class="glyphicon glyphicon-chevron-left"></span>
                            </a>
                            <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right"></span>
                            </a>
                        </div>
                    </div>

                </div>

                <div class="row">
					<c:forEach var="xe" items="${dmxes}" >
                    <div class="col-sm-4 col-lg-6 col-md-4">
                        <div class="thumbnail">
                            <img src="${contextPath}/${xe.hinhAnh}" alt="">
                            <div class="caption">
                                <h4 class="pull-right">${xe.giaThueXe} Triệu/Ngày.</h4>
                                <h4><a href="#">${xe.tenXe}</a>
                                </h4>
                                <p>${xe.thongTin}</p>
                            </div>
                            <div class="ratings">
                                <p class="pull-right">15 reviews</p>
                                <p>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                </p>
                            </div>
                        </div>
                    </div>
				    </c:forEach>
                  

                </div>
				
            </div>
</body>
</html>