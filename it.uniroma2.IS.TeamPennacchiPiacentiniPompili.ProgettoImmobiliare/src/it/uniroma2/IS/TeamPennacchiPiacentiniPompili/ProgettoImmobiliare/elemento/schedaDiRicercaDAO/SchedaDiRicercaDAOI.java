package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.schedaDiRicercaDAO;

import java.sql.SQLException;
import java.util.Map;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.SchedaDiRicerca;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.enumClass.CampoSchedaDiRicercaEnum;

/**
 * Interfaccia della classe DAO utilizzata per accedere ai dati relativi alle
 * schede di ricerca.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public interface SchedaDiRicercaDAOI {
	/**
	 * Dati i parametri, crea una nuova scheda di ricerca.
	 * 
	 * @param mappaScheda
	 *            - campi compilati dal fruitore
	 * @return true se la scheda di ricerca è stata creata, false altrimenti
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public boolean creaSchedaDiRicerca(SchedaDiRicerca scheda) throws ClassNotFoundException, SQLException;

	/**
	 * Dato l'id della scheda di ricerca, restituisce la scheda di ricerca che
	 * si vuole visualizzare.
	 * 
	 * @param idSchedaDiRicerca
	 *            - l'id della scheda di ricerca che si vuole visualizzare
	 * @return la scheda di ricerca voluta
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public SchedaDiRicerca visualizzaSchedaDiRicerca(int idScheda) throws ClassNotFoundException, SQLException;

	public boolean modificaSchedaDiRicerca(SchedaDiRicerca scheda);

	public boolean eliminaSchedaDiRicerca(int idScheda);
}
