<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
   <div id="forgot" class="tab-pane">
				<form method="post"
					action="${pageContext.request.contextPath}/user/forgotpass"
					class="form-signin">
					<p class="text-muted text-center">Vui lòng nhập e-mail</p>
					<input type="text" name="username" placeholder="mail@domain.com"
						required="required" class="form-control"> <br>
					<button class="btn btn-lg btn-danger btn-block" type="submit">Khôi phục mật khẩu</button>
				</form>
			</div>
</body>
</html>