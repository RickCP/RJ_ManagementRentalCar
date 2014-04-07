<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp" %>
<%@ include file="/WEB-INF/jsp/include/server_variables.jsp" %>
<%@ include file="/WEB-INF/jsp/include/js_variables.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
    <!--IE Compatibility modes-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="msapplication-TileColor" content="#5bc0de">
    <meta name="msapplication-TileImage" content="${contextPath}/assets/img/metis-tile.png">

    <!-- Bootstrap -->
    <link rel="stylesheet" href="${contextPath}/assets/lib/bootstrap/css/bootstrap.min.css">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="${contextPath}/assets/lib/Font-Awesome/css/font-awesome.min.css">

    <!-- Metis core stylesheet -->
    <link rel="stylesheet" href="${contextPath}/assets/css/main.min.css">
    <link rel="stylesheet" href="${contextPath}/assets/css/theme.css">
<title>Insert title here</title>
</head>
<body>
	<div class="col-lg-12">
		<div class="box">
			<header>
			<div class="icons">
				<i class="fa fa-table"></i>
			</div>
			<h5>Thông Tin Về Các Tài Khoản</h5>
			</header>
			<div id="collapse4" class="body">
				<div id="dataTable_wrapper" class="dataTables_wrapper form-inline"
					role="grid">
					<div class="pull-right">
						<div id="dataTable_length" class="dataTables_length">
							<label>Show <select size="1" name="dataTable_length"
								aria-controls="dataTable"><option value="10"
										selected="selected">10</option>
									<option value="25">25</option>
									<option value="50">50</option>
									<option value="100">100</option></select> entries
							</label>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-9"></div>
						<div class="col-lg-3">
						<div class="dataTables_paginate paging_bootstrap">
						<a href="#" class="btn btn-success btn-lg btn-rect pagination1" data-original-title="" title="">Thêm Quản Lý</a>
						</div>
						</div>
					</div>
					<table id="dataTable"
						class="table table-bordered table-condensed table-hover table-striped dataTable">
						<thead>
							
							<tr role="row">
								<th class="sorting_asc" role="columnheader" tabindex="0"
									aria-controls="dataTable" rowspan="1" colspan="1"
									aria-sort="ascending"
									aria-label="Rendering engine: activate to sort column descending"
									style="width: 188px;">ID</th>
								<th class="sorting" role="columnheader" tabindex="0"
									aria-controls="dataTable" rowspan="1" colspan="1"
									aria-label="Browser: activate to sort column ascending"
									style="width: 262px;">Họ và Tên</th>
								<th class="sorting" role="columnheader" tabindex="0"
									aria-controls="dataTable" rowspan="1" colspan="1"
									aria-label="Platform(s): activate to sort column ascending"
									style="width: 241px;">User Name</th>
								<th class="sorting" role="columnheader" tabindex="0"
									aria-controls="dataTable" rowspan="1" colspan="1"
									aria-label="Engine version: activate to sort column ascending"
									style="width: 159px;">Password</th>
								<th class="sorting" role="columnheader" tabindex="0"
									aria-controls="dataTable" rowspan="1" colspan="1"
									aria-label="CSS grade: activate to sort column ascending"
									style="width: 111px;">Ngày Sinh</th>
								<th class="sorting_asc" role="columnheader" tabindex="0"
									aria-controls="dataTable" rowspan="1" colspan="1"
									aria-sort="ascending"
									aria-label="Rendering engine: activate to sort column descending"
									style="width: 188px;">Giới Tính</th>
								<th class="sorting" role="columnheader" tabindex="0"
									aria-controls="dataTable" rowspan="1" colspan="1"
									aria-label="Browser: activate to sort column ascending"
									style="width: 262px;">Điện Thoại</th>
								<th class="sorting" role="columnheader" tabindex="0"
									aria-controls="dataTable" rowspan="1" colspan="1"
									aria-label="Platform(s): activate to sort column ascending"
									style="width: 241px;">CMND</th>
								<th class="sorting" role="columnheader" tabindex="0"
									aria-controls="dataTable" rowspan="1" colspan="1"
									aria-label="Engine version: activate to sort column ascending"
									style="width: 159px;">Email</th>
								<th class="sorting" role="columnheader" tabindex="0"
									aria-controls="dataTable" rowspan="1" colspan="1"
									aria-label="CSS grade: activate to sort column ascending"
									style="width: 111px;">Đia Chỉ</th>
								<th>Sữa</th>
								<th>Xóa</th>


							</tr>

						</thead>
						
						<tbody role="alert" aria-live="polite" aria-relevant="all">
						<c:forEach var="user" items="${userForms}">
							<tr class="odd">
								<td class=" sorting_1">${user.quanliId}</td>
								<td class=" ">${user.hoTen}</td>
								<td class=" ">${user.userName}</td>
								<td class=" ">${user.password}</td>
								<td class=" ">${user.ngaySinh}</td>
								<td class=" sorting_1">${user.gioiTinh}</td>
								<td class=" ">${user.dienThoai}</td>
								<td class=" ">${user.cmnd}</td>
								<td class=" ">${user.email}</td>
								<td class=" ">${user.diachi}</td>
							</tr>
					   </c:forEach>
							
						</tbody>
					</table>
					<div class="row">
						<div class="col-lg-6">
							<div class="dataTables_filter" id="dataTable_filter">
								<label>Search: <input type="text"
									aria-controls="dataTable"></label>
							</div>
						</div>
						<div class="col-lg-6">
							<div class="dataTables_paginate paging_bootstrap">
								<ul class="pagination">
									<li class="prev disabled"><a href="#">← Previous</a></li>
									<li class="active"><a href="#">1</a></li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">5</a></li>
									<li class="next"><a href="#">Next → </a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>