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
<link rel="stylesheet" href="<s:url value="/style/style.css"/>">
<title>Agenzia PPP - Immobili</title>
</head>
<body>
	<header>
		<div class="sinistra cf">
			<a href="<s:url value="/" />" target="_blank">Agenzia Immobiliare PPP</a>
		</div>
		<div class="destra cf">
			<a href="visualizzaClientiAmministratore">Clienti</a> | <a href="visualizzaAgenti">Agenti</a> | <a href="logout">Logout</a>
		</div>
		<s:if test="#session.amministratoreLoggato == null">
			<jsp:forward page="/" />
		</s:if>
	</header>
	
	<div class="container">
		<div id="crea-immobile" class="panel panel-default">
			<div class="panel-heading">Crea Immobile</div>
			<div class="panel-body">
				<form class="form-inline" role="form" method="post" action="creaImmobile" enctype="multipart/form-data">
					<div class="form-group">
						<label for="provincia">Provincia:</label>
						<input type="text" name="provincia" class="form-control" id="provincia" required>
					</div>
					<div class="form-group">
						<label for="citta">Città:</label>
						<input type="text" name="citta" class="form-control" id="citta" required>
					</div>
					<div class="form-group">
						<label for="zona">Zona:</label>
						<input type="text" name="zona" class="form-control" id="zona" required>
					</div>
					<div class="form-group">
						<label for="camere">Camere:</label>
						<input type="number" name="camere" class="form-control" id="camere" required>
					</div>
					<div class="form-group">
						<label for="bagni">Bagni:</label>
						<input type="number" name="bagni" class="form-control" id="bagni" required>
					</div>
					<div class="form-group">
						<label>Tipologia:
							<select name="tipologia" class="btn btn-default">
							    <option value="Residenziale">Residenziale</option>
							    <option value="Commerciale">Commerciale</option>
							    <option value="Cessione attività">Cessione attività</option>
							    <option value="Nuovi cantieri">Nuovi cantieri</option>
							</select></label>
					</div>
					<div class="form-group">
						<label>Sub tipologia:
							<select name="subTipologia" class="btn btn-default">
							    <option value="Loft">Loft</option>
							    <option value="Appartamento">Appartamento</option>
							    <option value="Flat">Flat</option>
							    <option value="Attico">Attico</option>
							</select></label>
					</div>
					<div class="form-group">
						<label for="prezzo">Prezzo:</label>
						<input type="number" name="prezzo" class="form-control" id="prezzo" step="0.01" required>
					</div>
					<div class="form-group">
						<label for="MQ">MQ:</label>
						<input type="number" name="MQ" class="form-control" id="MQ" required>
					</div>
					<div class="form-group">
						<label for="descrizione">Descrizione:</label>
						<textarea name="descrizione" class="form-control" id="descrizione"></textarea>
					</div>
					<div class="form-group">
						<s:file name="foto" label="Foto" accept="image/*" required="true" />
					</div>
				<button type="submit" class="btn btn-default">Crea Immobile</button>
				</form>
			</div>
		</div>
		<table class="table table-hover" id="immobili-admin">
			<tr>
				<th>Città</th>
				<th>Camere</th>
				<th>Bagni</th>
				<th>Prezzo</th>
				<th>MQ</th>
			</tr>
			<s:iterator value="immobili">
				<s:url id="visualizzaImmobileLink" value="visualizzaImmobileAmministratore">
					<s:param name="idImmobile" value="%{idImmobile}" />
				</s:url>
				<tr onclick="document.location = '<s:url value="%{visualizzaImmobileLink}" />';">
					<td>
						<s:property value="citta"/><br>
					</td>
					<td>
						<s:property value="camere"/><br>
					</td>
					<td>
						<s:property value="bagni"/><br>
					</td>
					<td>
						€<s:property value="prezzo"/><br>
					</td>
					<td>
						<s:property value="mq"/>
						<s:property value="fotoPath"/>
					</td>
				</tr>
			</s:iterator>
	</table>
	<div id="errore">
		<s:actionerror/>
    </div>
	</div>
</body>
</html>