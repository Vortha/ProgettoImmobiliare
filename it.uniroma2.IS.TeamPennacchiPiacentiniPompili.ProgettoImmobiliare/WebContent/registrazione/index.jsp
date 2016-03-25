<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="../script/js/check.js"></script>
		<link rel="stylesheet" href="../style/style.css">
        <title>Agenzia PPP - Registrazione</title>
    </head>
    <body>
        <header>
		<div class="sinistra cf">
			<a href="<s:url value="/" />">Agenzia Immobiliare PPP</a>
		</div>
		<s:if test="#session.clienteLoggato != null || #session.agenteLoggato != null">
			<a href="logout">Logout</a>
		</s:if>
		<s:else>
			<div class="destra cf">
				<a href="<s:url value="/login/"/>">Login</a> | <b>Registrati</b>
			</div>
		</s:else>
	</header>

        <div class="container contenitore-form">
            <form action="registrati" id="registratiForm" method="post" onsubmit="return checkPassword('password', 'convalida_password', 'errore')">
                <div class="form-group">
                    <label>Nome: <input type="text" name="nome" class="form-control" required autofocus></label>
                </div>
                <div class="form-group">
                    <label>Cognome: <input type="text" name="cognome" class="form-control" required></label>
                </div>
                <div class="form-group">
                    <label>Telefono: <input type="tel" name="telefono" class="form-control" minlength="10" maxlength="10" pattern="[0-9]+" title="Inserire solo numeri" required></label>
                </div>
                <div class="form-group">
                    <label>Email: <input type="email" name="email" class="form-control" required></label>
                </div>
                <div class="form-group">
                    <label>Password: <input id="password" type="password" name="password" class="form-control" required></label>
                </div>
                <div class="form-group">
                    <label>Ripeti password: <input id="convalida_password" type="password" name="convalida_password" class="form-control" required></label>
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