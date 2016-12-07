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
<link rel="stylesheet" href="style/style.css">
<title>Agenzia PPP</title>
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
	<div class="container">
		<div id="titolo"><h1>Vetrina</h1></div>
		<div id="immobili" class="cf">
			<s:action name="visualizzaImmobili" executeResult="true" />
		</div>
		<div id="ricerca" class="cf">
			<h1>Ricerca</h1>
			<form action="ricercaImmobili" id="ricercaImmobiliForm" method="post">
				<div class="form-group">
					<label>Provincia: <input type="text" name="provincia" class="form-control"></label>
				</div>
				<div class="form-group">
					<label>Città: <input type="text" name="citta" class="form-control"></label>
				</div>
				<div class="form-group">
					<label>Zona: <input type="text" name="zona" class="form-control"></label>
				</div>
				<label>Fascia prezzo:
					<select name="fasciaPrezzo" class="btn btn-default"> 
					    <option value="0">Seleziona fascia</option> 
					    <option value="1">fino a €100.000</option> 
					    <option value="2">da €100.000 a €300.000</option> 
					    <option value="3">oltre i €300.000</option>
					</select></label>
				<label>Fascia MQ:
					<select name="fasciaMQ" class="btn btn-default"> 
					    <option value="0">Seleziona fascia</option> 
					    <option value="1">fino a 50 MQ</option> 
					    <option value="2">da 50 MQ a 100 MQ</option> 
					    <option value="3">da 100 MQ a 200 MQ</option>
					    <option value="4">oltre i 200 MQ</option>
					</select></label>
				<label>Tipologia:
					<select name="tipologia" class="btn btn-default"> 
					    <option value="Tutte">Tutte</option> 
					    <option value="Residenziale">Residenziale</option>
					    <option value="Commerciale">Commerciale</option>
					    <option value="Cessione attività">Cessione attività</option>
					    <option value="Nuovi cantieri">Nuovi cantieri</option>
					</select></label>
				<label>Sub tipologia:
					<select name="subTipologia" class="btn btn-default"> 
					    <option value="Tutte">Tutte</option>  
					    <option value="Loft">Loft</option>
					    <option value="Appartamento">Appartamento</option>
					    <option value="Flat">Flat</option>
					    <option value="Attico">Attico</option>
					</select></label>
				<div class="form-group">
					<input type="submit" class="btn btn-default" value="Cerca">
				</div>
			</form>
			<div id="errore">
				<s:actionerror/>
			</div>
		</div>
	</div>
</body>
</html>