package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.schedaDiRicercaDAO;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database.DBAccessManager;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.SchedaDiRicerca;

/**
 * Classe DAO che implementa le funzionalità per le operazioni sulle schede di
 * ricerca. Implementa l'interfaccia ImmobileDAOI.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class SchedaDiRicercaDAO extends DBAccessManager implements SchedaDiRicercaDAOI {

	@Override
	public boolean creaSchedaDiRicerca(SchedaDiRicerca scheda) {
		
		return false;
	}

	@Override
	public SchedaDiRicerca visualizzaSchedaDiRicerca(int idScheda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modificaSchedaDiRicerca(SchedaDiRicerca scheda) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminaSchedaDiRicerca(int idScheda) {
		// TODO Auto-generated method stub
		return false;
	}
}
