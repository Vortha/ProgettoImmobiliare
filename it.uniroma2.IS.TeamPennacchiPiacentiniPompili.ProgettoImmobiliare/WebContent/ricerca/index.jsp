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
<title>Agenzia PPP - Ricerca</title>
</head>
<body>
	<header>
		<div class="sinistra cf">
			<a href="<s:url value="/" />">Agenzia Immobiliare PPP</a>
		</div>
		<div class="destra cf">
			<s:if test="#session.clienteLoggato != null || #session.agenteLoggato != null">
				<a href="logout">Logout</a>
			</s:if>
			<s:else>
					<a href="<s:url value="/login/"/>">Login</a> | <a href="<s:url value="/registrazione/"/>">Registrati</a>
			</s:else>
		</div>
	</header>
	<div class="container">
		<h1>Vetrina</h1>
		<div id="immobili" class="cf">
			<table class="table table-hover">
				<s:iterator value="immobili">
					<tr>
						<td>
							<div id="foto-casa" class="cf">
								<s:if test="fotoPath == null">
									<img class="img-thumbnail" src="<s:url value="/img/immobili/default.png"/>" alt="Immagine casa" />
								</s:if>
							</div>
							<div id="caratteristiche">
								<b>Città:</b> <s:property value="citta"/><br>
								<b>Camere:</b> <s:property value="camere"/><br>
								<b>Bagni:</b>  <s:property value="bagni"/><br>
								<b>Prezzo:</b> €<s:property value="prezzo"/><br>
								<b>MQ:</b>  <s:property value="mq"/>
							</div>
						</td>
					</tr>
				</s:iterator>
			</table>
			<div id="errore">
	           	<s:actionerror/>
	        </div>
	        <div id="messaggio">
	        	<s:actionmessage/>
	        </div>
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