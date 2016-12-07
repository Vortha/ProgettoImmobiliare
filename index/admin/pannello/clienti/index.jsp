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
<title>Agenzia PPP - Clienti</title>
</head>
<body>
	<header>
		<div class="sinistra cf">
			<a href="<s:url value="/" />" target="_blank">Agenzia Immobiliare PPP</a>
		</div>
		<div class="destra cf">
			<a href="visualizzaAgenti">Agenti</a> | <a href="visualizzaImmobiliAmministratore">Immobili</a> | <a href="logout">Logout</a>
		</div>
		<s:if test="#session.amministratoreLoggato == null">
			<jsp:forward page="/" />
		</s:if>
	</header>
	
	<div class="container">
		<div id="creaCliente">
			<form class="form-inline" role="form">
				<div class="form-group">
					<label for="email">Email:</label>
					<input type="email" name="email" class="form-control" id="email">
				</div>
				<div class="form-group">
					<label for="nome">Nome:</label>
					<input type="text" name="nome" class="form-control" id="nome">
				</div>
				<div class="form-group">
					<label for="cognome">Cognome:</label>
					<input type="text" name="cognome" class="form-control" id="cognome">
				</div>
				<div class="form-group">
					<label for="telefono">Telefono:</label>
					<input type="text" name="telefono" class="form-control" id="telefono">
				</div>
				<div class="form-group">
					<label for="agenteAssegnato">Agente Assegnato:</label>
					<input type="text" name="agenteAssegnato" class="form-control" id="agenteAssegnato">
				</div>
			<button type="submit" class="btn btn-default">Crea Cliente</button>
			</form>
		</div>
		<div id="clienti">
			<table class="table table-hover">
				<tr>
					<th>Email</th>
					<th>Nome</th>
					<th>Cognome</th>
					<th>Telefono</th>
					<th>Agente Assegnato</th>
					<th>Eliminato</th>
				</tr>
				<s:iterator value="clienti">
					<tr>
						<td>
							<s:property value="email" />
						</td>
						<td>
							<s:property value="nome" />
						</td>
						<td>
							<s:property value="cognome" />
						</td>
						<td>
							<s:property value="telefono" />
						</td>
						<td>
							<s:property value="agenteAssegnato"/>
						</td>
						<td>
							<s:if test="%{eliminato == 1}">
								<img src="<s:url value="/img/utili/eliminato.png"/>" alt="Immagine eliminato" />
							</s:if>
						</td>
					</tr>
				</s:iterator>
			</table>
		</div>
		<div id="errore">
			<s:actionerror/>
		</div>
	</div>
</body>
</html>