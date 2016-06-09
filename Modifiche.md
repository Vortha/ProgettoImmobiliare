<h1>Modifiche</h1>
Terminate le implementazioni per la WebApp, scritto tutto il javadoc (anche ricontrollato) e aggiunto qualche commento per qualche metodo con operazioni meno ordinarie.

<h2>Funzionalità implementate tramite Action(s)</h2>
<ul>
  <li>attore.agente.action
    <ul>
      <li>VisualizzaAgentiAction.java</li>
    </ul>
  </li>
  <li>attore.cliente.action
    <ul>
      <li>VisualizzaClientiAction.java</li>
      <li>VisualizzaClientiAmministratoreAction.java</li>
    </ul>
  </li>
  <li>attore.fruitore.action
    <ul>
      <li>LoginAction.java</li>
      <li>LogoutAction.java</li>
    </ul>
  </li>
  <li>attore.utente.action
    <ul>
      <li>RegistratiAction.java</li>
      <li>RicercaImmobiliAction.java</li>
    </ul>
  </li>
  <li>elemento.immobile.action
    <ul>
      <li>CreaImmobileAction.java</li>
      <li>EliminaImmobileAction.java</li>
      <li>VisualizzaImmobileAction.java</li>
      <li>VisualizzaImmobiliAction.java</li>
    </ul>
  </li>
</ul>

<h2>WebPage Directory Path</h2>
<ul>
  <li>WebContent
    <ul>
      <li>index.jsp</li>
      <li>admin
        <ul>
          <li>index.jsp</li>
          <li>pannello
            <ul>
              <li>index.jsp</li>
              <li>agenti
                <ul>
                  <li>index.jsp</li>
                </ul>
              </li>
              <li>clienti
                <ul>
                  <li>index.jsp</li>
                </ul>
              </li>
              <li>immobili
                <ul>
                  <li>index.jsp</li>
                  <li>immobile
                    <ul>
                      <li>index.jsp</li>
                      <li>risultato
                        <ul>
                          <li>index.jsp</li>
                        </ul>
                      </li>
                    </ul>
                  </li>
                </ul>
              </li>
            </ul>
          </li>
        </ul>
      </li>
      <li>clienti
        <ul>
          <li>index.jsp</li>
        </ul>
      </li>
      <li>img
        <ul>
          <li>immobili
            <ul>
              <li>...</li>
              <li>default.png</li>
            </ul>
          </li>
          <li>utili
            <ul>
              <li>eliminato.png</li>
            </ul>
          </li>
        </ul>
      </li>
      <li>immobile
        <ul>
          <li>index.jsp</li>
        </ul>
      </li>
      <li>immobili
        <ul>
          <li>index.jsp</li>
        </ul>
      </li>
      <li>login
        <ul>
          <li>index.jsp</li>
        </ul>
      </li>
      <li>registrazione
        <ul>
          <li>index.jsp</li>
        </ul>
      </li>
      <li>ricerca
        <ul>
          <li>index.jsp</li>
        </ul>
      </li>
      <li>script
        <ul>
          <li>js
            <ul>
              <li>check.js</li>
            </ul>
          </li>
        </ul>
      </li>
      <li>style
        <ul>
          <li>style.css</li>
        </ul>
      </li>
    </ul>
  </li>
</ul>
      

<h2>Altro</h2>
Caricata la WebApp sulla macchina virtuale, si può procedere all'interfacciamento tra Android e Struts2.<br>
<b>Problema!:</b> l'eliminazione dell'immobile non elimina le immagini associate ad esso.<br><br>
<p>
  <b>Accesso lato cliente</b><br>
    <em>indirizzo:</em> /login/<br>
    <em>email:</em> prova@prova.it<br>
    <em>password:</em> prova1A
</p>
<p>
  <b>Accesso lato agente</b><br>
    <em>indirizzo:</em> /login/<br>
    <em>email:</em> prova1@prova.it<br>
    <em>password:</em> prova1A
</p>
<p>
  <b>Accesso lato amministratore</b><br>
    <em>indirizzo:</em> /admin/<br>
    <em>email:</em> pompili@gmail.com</br>
    <em>password:</em> qwerty1A
</p>
