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
<link rel="stylesheet" href="../../style/style.css">
<title>Agenzia PPP - Login</title>
</head>
<body>
	<header>
		<div class="sinistra cf">
			<a href="<s:url value="/" />" target="_blank">Agenzia Immobiliare PPP</a>
		</div>
		<s:if test="#session.amministratoreLoggato == null">
			<jsp:forward page="/" />
		</s:if>
	</header>
	
	<div class="container">
		<div id="azioni">
			<a href="visualizzaClientiAmministratore"><h1 class="bg-primary">Clienti</h1></a>
			<a href="visualizzaAgenti"><h1 class="bg-success">Agenti</h1></a>
			<a href="visualizzaImmobiliAmministratore"><h1 class="bg-primary">Immobili</h1></a>
		</div>
		<div id="errore">
			<s:actionerror/>
		</div>
	</div>
</body>
</html>