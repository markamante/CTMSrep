<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User Login</title>
<spring:url value="/resources/css/style3.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
</head>

<body >

      <form method = "post" action = "login">
		<div class='box'>
			<div class='box-form'>
				<div class='box-login-tab'></div>
				<div class='box-login-title'>
				<div class='i i-login'></div>
				<h2>LOGIN</h2>
			</div>
				<div class='box-login'>
					<div class='fieldset-body' id='login_form'>
						<p class='field'>
							<label for='user'>USERNAME</label> 
							<input type='text' id='userName' name='userName' title='Username'/> 
							<span id='valida' class='i i-warning'></span>
						</p>
						<p class='field'>
							<label for='pass'>PASSWORD</label> 
							<input type='password' id='password' name='password' title='Password'/> 
							<span id='valida' class='i i-close'></span>
						</p>

						<button id='do_login' title='Login' >LOGIN</button>
						<div>${loginError}</div>
					</div>
				</div>
			</div>
		</div>
		</form>
</body>
</html>