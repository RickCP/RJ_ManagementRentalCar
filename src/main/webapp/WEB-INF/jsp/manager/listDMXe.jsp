<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--Begin Datatables-->
	<div class="form-group">
		<label class="control-label col-lg-4">Single Select</label>
		<div class="col-lg-8">
			<select data-placeholder="Your Favorite Type of Bear"
				class="form-control chzn-select" tabindex="7">
				<option value=""></option>
				<option>American Black Bear</option>
				<option>Asiatic Black Bear</option>
				<option>Brown Bear</option>
				<option>Giant Panda</option>
				<option selected>Sloth Bear</option>
				<option disabled>Sun Bear</option>
				<option>Polar Bear</option>
				<option disabled>Spectacled Bear</option>
			</select>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="box">
				<header>
				<div class="icons">
					<i class="fa fa-table"></i>
				</div>
				<h5>Dynamic Table</h5>
				</header>
				<div id="collapse4" class="body">
				<label class="control-label col-lg-2">Loai Xe</label>
		<div class="col-lg-10">
			<select data-placeholder="Your Favorite Type of Bear"
				class="form-control chzn-select" tabindex="7">
				<option value=""></option>
				<option>American Black Bear</option>
				<option>Asiatic Black Bear</option>
				<option>Brown Bear</option>
				<option>Giant Panda</option>
				<option selected>Sloth Bear</option>
				<option disabled>Sun Bear</option>
				<option>Polar Bear</option>
				<option disabled>Spectacled Bear</option>
			</select>
			</br>
		</div>
					<table id="dataTable"
						class="table table-bordered table-condensed table-hover table-striped">

						<thead>
							<tr>
								<th>Danh Muc Xe ID</th>
								<th>Tem Xe</th>
								<th>Loai Xe ID</th>
								<th>Hang Xe ID</th>
								<th>Gia Xe ID</th>
								<th>So Luong</th>
								<th>Hinh Anh</th>
								<th>Thong Tin</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="dmxe" items="${dmxes}">
								<tr>
									<td>${dmxe.dmXeId }</td>
									<td>${dmxe.tenXe}</td>
									<td>a</td>
									<td>4</td>
									<td>X</td>
									<td>X</td>
									<td>X</td>
									<td>X</td>
								</tr>
							</c:forEach>
						</tbody>

					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- /.row -->
</body>
</html>