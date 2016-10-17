<a href="http://progettoimmobiliare-teamppp.rhcloud.com/" target="_blank">SITO</a>

<h2>Configurazione</h2>
<p>
  <b>Server</b><br>
  <b>IP:</b> <em>127.3.250.1</em><br>
  <b>Porta:</b> <em>8080</em>
</p>

<h2>Action Mobile</h2>
Come chiamare le action dall'app, lista input e output
<table>
  <tr>
    <th>Action</th>
    <th>Action name</th>
    <th>Input</th>
    <th>Output</th>
  </tr>
  <tr>
    <td>Login</td>
    <td>loginMobile</td>
    <td>String email, String password</td>
    <td>Map&lt;String, Object&gt; risposta</td>
  </tr>
  <tr>
    <td>Visualizza Immobili</td>
    <td>visualizzaImmobiliMobile</td>
    <td>//</td>
    <td>List&lt;Immobile&gt; immobili</td>
  </tr>
  <tr>
    <td>Aggiungi immobile ai preferiti</td>
    <td>aggiungiPreferitiMobile</td>
    <td>String email, int idImmobile</td>
    <td>Map&lt;String, Object&gt; risposta</td>
  </tr>
  <tr>
    <td>Rimuovi immobile dai preferiti</td>
    <td>rimuoviPreferitiMobile</td>
    <td>String email, int idImmobile</td>
    <td>Map&lt;String, Object&gt; risposta</td>
  </tr>
  <tr>
    <td>Ricerca Immobili</td>
    <td>ricercaImmobiliMobile</td>
    <td>String provincia, String citta, String zona, String fasciaPrezzo, String fasciaMQ, String tipologia, String subTipologia</td>
    <td>List&lt;Immobile&gt; immobili</td>
</table>

Contenuto che può avere la risposta in base all'action mobile
<table>
  <tr>
    <th>Action name</th>
    <th>Contenuto risposta</th>
  </tr>
  <tr>
    <td>loginMobile</td>
    <td>{"connessione":true | false}</td>
  </tr>
  <tr>
    <td>aggiungiPreferitiMobile</td>
    <td>{"inserimento":true | false}</td>
  </tr>
  <tr>
    <td>rimuoviPreferitiMobile</td>
    <td>{"rimozione":true | false}</td>
  </tr>
</table>

<h2>Login</h2>
<p>
    <em>email:</em> prova@prova.it<br>
    <em>password:</em> prova1A
</p>

<h2>Warning</h2>
<p>
Se si richiama <code>rimuoviPreferitiMobile</code> senza parametri, la risposta contiene <code>{"rimozione":true}</code>
</p>
