 /**
  * Verifica che il contenuto del campo passato come fieldName rispetti
  * i vincoli.
  * fieldName è il nome del campo del quale si devono testare i vincoli:
  *  -almeno una minuscola;
  *  -almeno una maiuscola;
  *  -almeno un numero;
  *  -tra i 6 e i 45 (compresi) caratteri;
  * error è il nome dell'elemento html nel quale scrivere, eventualmente,
  * il messaggio di errore.
 **/
function checkPassword(nomeCampoPass, nomeCampoRipPass, error) {
	var minuscola = /[a-z]+/
	var maiuscola = /[A-Z]+/
	var numero = /[0-9]+/
	var password = document.getElementById(nomeCampoPass).value;
    var div = document.getElementById(error);
    var cpass = document.getElementById(nomeCampoRipPass).value;
    var flag = 0;
    
    if (!minuscola.test(password)) {
        div.innerHTML = '<span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>'
                + '<span class="sr-only">Errore: </span>';
        div.setAttribute('class', 'alert alert-danger');
        div.setAttribute('role', 'alert');
        div.innerHTML += "Inserire almeno una minuscola nella password";
        flag = 1;
    }
    if (!maiuscola.test(password)) {
        if (flag == 0) {
            div.innerHTML = '<span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>'
                + '<span class="sr-only">Errore: </span>';
            div.setAttribute('class', 'alert alert-danger');
            div.setAttribute('role', 'alert');
            flag = 1;
        }
        div.innerHTML += "<br>Inserire almeno una maiuscola nella password";
    }
	if (!numero.test(password)) {
        if (flag == 0) {
            div.innerHTML = '<span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>'
                + '<span class="sr-only">Errore: </span>';
            div.setAttribute('class', 'alert alert-danger');
            div.setAttribute('role', 'alert');
            flag = 1;
        }
        div.innerHTML += "<br>Inserire almeno un numero nella password";
    }
    if (password.length < 6) {
        if (flag == 0) {
            div.innerHTML = '<span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>'
                + '<span class="sr-only">Errore: </span>';
            div.setAttribute('class', 'alert alert-danger');
            div.setAttribute('role', 'alert');
            flag = 1;
        }
        div.innerHTML += "<br>La password deve essere almeno di 6 caratteri";
    }
    if (password.length > 46) {
        if (flag == 0) {
            div.innerHTML = '<span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>'
                + '<span class="sr-only">Errore: </span>';
            div.setAttribute('class', 'alert alert-danger');
            div.setAttribute('role', 'alert');
            flag = 1;
        }
        div.innerHTML += "<br>La password deve essere massimo di 45 caratteri";
    }
    if (password !== cpass) {
        if (flag == 0) {
            div.innerHTML = '<span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>'
                + '<span class="sr-only">Errore: </span>';
            div.setAttribute('class', 'alert alert-danger');
            div.setAttribute('role', 'alert');
            flag = 1;
        }
        div.innerHTML += "<br>Le password non coincidono";
    }
    
    if (flag == 1) {
    	return false;
    }
    return true;
}