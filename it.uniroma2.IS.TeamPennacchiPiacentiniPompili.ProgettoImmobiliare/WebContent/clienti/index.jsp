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
<title>Agenzia PPP - Portfolio Clienti</title>
</head>
<body>
	<header>
		<div class="sinistra cf">
			<a href="<s:url value="/" />"><b>Agenzia Immobiliare PPP</b></a>
		</div>
		<div class="destra cf">
			<s:if test="#session.agenteLoggato != null">
				<b>Portfolio Clienti</b> | 
			</s:if>
			<s:if test="#session.clienteLoggato != null || #session.agenteLoggato != null">
				<a href="logout">Logout</a>
			</s:if>
			<s:else>
					<jsp:forward page="../"></jsp:forward>
			</s:else>
		</div>
	</header>
	<div class="container">
		<div id="clienti">
			<table class="table table-hover">
				<tr>
					<th>Email</th>
					<th>Nome</th>
					<th>Cognome</th>
					<th>Telefono</th>
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