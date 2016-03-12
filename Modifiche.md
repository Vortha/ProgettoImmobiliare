<h1>Modifiche</h1>
Implementate le funzionalità dell'Agente:
<ul><li>
-visualizzaCliente (class diagram) è diventato public List<Cliente> visualizzaClienti(Agente agente) in quanto un Agente visualizza la lista di tutti i Clienti a lui assegnati e poi sceglie il singolo Cliente da visualizzare; questo si riduce ad una singola richiesta, cioè l'Agente dalla view richiede la lista di tutti i Clienti a lui assegnati, quando gli viene fornita clicca su uno dei Clienti e le informazioni di quel Cliente sono già presenti nella view, senza dover effettuare un'altra richiesta all'applicazione;</li><li>
-visualizzaMatchCliente (class diagram) è stato implementato come public List<Immobile> visualizzaMatch(Cliente cliente) per "EXPERT" in quanto ImmobileDAO possiede le informazioni sugli immobili e quindi i metodi per gli immobili. Questo nuovo metodo raggruppa anche il metodo visualizzaMatchPersonale (class diagram) del ClienteMobile.</li></ul>

Modificato SchedaDiRicerca.creaSchedaDiRicerca(Map<CampoSchedaDiRicercaEnum, Object> mappaFiltro) in SchedaDiRicerca.creaSchedaDiRicerca(SchedaDiRicerca scheda).
<br><br>
È stato pensato che un Agente può vedere tutti i Clienti a lui assegnati, anche quelli che sono in attesa dell'eliminazione dell'account, che possono quindi ancora riattivarlo e verranno visualizzati su view con un qualcosa che li distingua dagli altri (tipo un pallino giallo accanto). Il periodo è di 30 giorni ed è stato già creato l'evento sul database che si occupa di ciò.
<br><br>
<b>Da dover testare i metodi di AgenteDAO e visualizzaMatch di ImmobileDAO</b>
<br><br>
Y<b>o</b> b<b>r</b><i>o</i><u>!</u>
