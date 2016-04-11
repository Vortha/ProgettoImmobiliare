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
<title>Agenzia PPP - Visualizza Immobile</title>
</head>
<body>
	<header>
		<div class="sinistra cf">
			<a href="<s:url value="/" />"><b>Agenzia Immobiliare PPP</b></a>
		</div>
		<div class="destra cf">
			<s:if test="#session.agenteLoggato != null">
				<s:a href="visualizzaClienti">Portfolio Clienti</s:a> | 
			</s:if>
			<s:if test="#session.clienteLoggato != null || #session.agenteLoggato != null">
				<a href="logout">Logout</a>
			</s:if>
			<s:else>
					<a href="<s:url value="/login/"/>">Login</a> | <a href="<s:url value="/registrazione/"/>">Registrati</a>
			</s:else>
		</div>
	</header>
	<div id="immobile" class="container">
		<div id="foto-casa-tot" class="cf">
			<s:set name="fotoLink" value="immobile.foto"/>
			<s:if test="%{immobile.foto != null && immobile.foto != ''}">
				<img class="img-thumbnail" src="<s:url value="%{#fotoLink}" />" alt="Immagine casa" />
			</s:if>
			<s:else>
				<img class="img-thumbnail" src="<s:url value="/img/immobili/default.png"/>" alt="Immagine casa" />
			</s:else>
		</div>
		<div id="caratteristiche-tot">
			<b>Provincia:</b> <s:property value="immobile.provincia"/><br>
			<b>Città:</b> <s:property value="immobile.citta"/><br>
			<b>Zona:</b> <s:property value="immobile.zona"/><br>
			<b>Camere:</b> <s:property value="immobile.camere"/><br>
			<b>Bagni:</b>  <s:property value="immobile.bagni"/><br>
			<b>Tipologia:</b> <s:property value="immobile.tipologia"/><br>
			<b>Sub tipologia:</b> <s:property value="immobile.subTipologia"/><br>
			<b>Prezzo:</b> €<s:property value="immobile.prezzo"/><br>
			<b>MQ:</b>  <s:property value="immobile.mq"/><br>
			<b>Descrizione:</b> <s:property value="immobile.descrizione"/><br>
		</div>
	</div>
</body>
</html>