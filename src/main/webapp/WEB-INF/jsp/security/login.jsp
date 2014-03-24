<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp"%>
<%@ include file="/WEB-INF/jsp/include/server_variables.jsp"%>
<%@ include file="/WEB-INF/jsp/include/js_variables.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<meta name="msapplication-TileColor" content="#5bc0de" />
<meta name="msapplication-TileImage"
	content="${contextPath}/assets/img/metis-tile.png" />
<link rel="stylesheet"
	href="${contextPath}/assets/lib/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="${contextPath}/assets/css/main.css">
<link rel="stylesheet" href="${contextPath}/assets/lib/magic/magic.css">
<style type="text/css">
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body >
	<div class="tab-content">
		<div id="login" class="tab-pane active">
			<form:form method="POST" commandName="loginForm"
				cssClass="form-signin"
				action="${pageContext.request.contextPath}/login/sign_in">
				<form:errors path="*" cssClass="errorblock" element="div" />
				<div class="error">${message}</div>
				<form:label path="message"></form:label>
				<p class="text-muted text-center">Enter your username and
					password</p>
				<form:input path="username" placeholder="Username"
					class="form-control" />
				<form:input path="password" placeholder="Password"
					class="form-control" />
				<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
					in</button>

			</form:form>
		</div>
</body>
</html>
