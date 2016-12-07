<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="<s:url value="/style/style.css" />">
<title>Agenzia PPP - Login</title>
</head>
<body>
	<header>
		<div class="sinistra cf">
			<a href="<s:url value="/" />">Agenzia Immobiliare PPP</a>
		</div>
		<s:if test="#session.clienteLoggato != null || #session.agenteLoggato != null">
			<jsp:forward page="../" />
		</s:if>
		<s:else>
			<div class="destra cf">
				<b>Login</b> | <a href="<s:url value="/registrazione/"/>">Registrati</a>
			</div>
		</s:else>
	</header>
	
	<div class="container contenitore-form">
		<form action="login" id="loginForm" method="post">
			<div class="form-group">
				<label>Email: <input type="email" name="email" class="form-control" required autofocus></label>
			</div>
			<div class="form-group">
				<label>Password: <input type="password" name="password" class="form-control" required></label>
			</div>
			<div class="form-group">
				<input type="submit" class="btn btn-default" value="Accedi">
			</div>
		</form>
		<div id="errore">
			<s:actionerror/>
		</div>
	</div>
</body>
</html>