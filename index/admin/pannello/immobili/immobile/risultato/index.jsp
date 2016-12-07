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
<title>Agenzia PPP - Risultato</title>
</head>
<body>
	<header>
		<div class="sinistra cf">
			<a href="<s:url value="/" />" target="_blank">Agenzia Immobiliare PPP</a>
		</div>
		<div class="destra cf">
			<a href="visualizzaClientiAmministratore">Clienti</a> | <a href="visualizzaAgenti">Agenti</a> 
			| <a href="visualizzaImmobiliAmministratore">Immobili</a> | <a href="logout">Logout</a>
		</div>
		<s:if test="#session.amministratoreLoggato == null">
			<jsp:forward page="/" />
		</s:if>
	</header>
	
	<div class="container">
		<s:actionmessage/>
		<s:actionerror/>
	</div>
</body>
</html>