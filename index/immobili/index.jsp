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
<title>Agenzia PPP - Ricerca Immobili</title>
</head>
<body>
    <table class="table table-hover">
		<s:iterator value="immobili">
			<tr>
				<td>
					<s:url id="visualizzaImmobileLink" value="visualizzaImmobile">
						<s:param name="idImmobile" value="%{idImmobile}" />
					</s:url>
					<s:a href="%{visualizzaImmobileLink}">
						<div id="%{idImmobile}">
							<div id="foto-casa" class="cf">
								<s:set name="fotoLink" value="foto"/>
								<s:if test="%{foto != null && foto != ''}">
									<img class="img-thumbnail" src="<s:url value="%{#fotoLink}" />" alt="Immagine casa" />
								</s:if>
								<s:else>
									<img class="img-thumbnail" src="<s:url value="/img/immobili/default.png"/>" alt="Immagine casa" />
								</s:else>
							</div>
							<div id="caratteristiche">
								<b>Città:</b> <s:property value="citta"/><br>
								<b>Camere:</b> <s:property value="camere"/><br>
								<b>Bagni:</b>  <s:property value="bagni"/><br>
								<b>Prezzo:</b> €<s:property value="prezzo"/><br>
								<b>MQ:</b>  <s:property value="mq"/>
							</div>
						</div>
					</s:a>
				</td>
			</tr>
		</s:iterator>
	</table>
	<div id="errore">
		<s:actionerror/>
    </div>
</body>
</html>