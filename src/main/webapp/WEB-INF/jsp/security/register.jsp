<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp"%>
<%@ include file="/WEB-INF/jsp/include/server_variables.jsp"%>
<%@ include file="/WEB-INF/jsp/include/js_variables.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="${contextPath}/assets/css/datepicker.css">
<style type="text/css">
.frmSignUp {
	margin: 0 auto;
	width: 100%;
	text-align: center;
	clear: both;
}
</style>


</head>
<body>

	<div class="tab-content">
		<div id="sign_up" class="tab-pane-active">
			<form:form method="POST" commandName="userForm"
				action="${pageContext.request.contextPath }/login/sign_up"
				cssClass="form-signin">
				<form:errors path="*" cssClass="errorblock" element="div" />

				<form:input path="userName" class="form-control"
					placeholder="Username" />

				<form:password path="password" class="form-control"
					placeholder="Password" />


				<form:password path="confirmPassword" class="form-control"
					placeholder="Confirm Password" />
				<form:input path="hoTen" class="form-control" placeholder="Ho Ten" />
				<legend style="color: white; font-size: 18px;">Gioi Tinh</legend>
				<form:radiobutton path="gioiTinh" value="M"
					placeholder="Confirm Password" />Male 
				<form:radiobutton path="gioiTinh" value="F" />Female
				<form:input path="email" class="form-control" placeholder="Email" />
				<legend style="color: white; font-size: 18px;">Ngay Sinh</legend>
				<form:input path="ngaySinh" class="form-control"
					placeholder="Ngay Sinh" id="ngaySinh" />

				<form:input path="dienThoai" class="form-control"
					placeholder="Dien Thoai" />
				<legend style="color: white; font-size: 18px;">CMND</legend>
				<form:input path="cmnd" class="form-control" placeholder="CMND" />

				<form:input path="diachi" class="form-control" placeholder="Dia Chi" />


				<button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
			</form:form>
		</div>
</div>

</body>
</html>