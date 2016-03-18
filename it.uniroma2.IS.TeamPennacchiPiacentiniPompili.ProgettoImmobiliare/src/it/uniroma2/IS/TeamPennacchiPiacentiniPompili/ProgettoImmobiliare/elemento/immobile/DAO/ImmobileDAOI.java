package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.DAO;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.SchedaDiRicerca;

import java.sql.SQLException;
import java.util.List;

/**
 * Interfaccia della classe DAO utilizzata per accedere ai dati relativi agli
 * immobili.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public interface ImmobileDAOI {
	/**
	 * Dato l'immobile come parametro, lo aggiunge all'applicazione.
	 * 
	 * @param immobile
	 *            - l'immobile da aggiungere all'interno dell'applicazione
	 * @return true se l'immobile è stato creato, false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean creaImmobile(Immobile immobile)
			throws ClassNotFoundException, SQLException;

	/**
	 * Dato l'id immobile come parametro e un oggetto di tipo immobile, modifica
	 * nell'applicazione l'immobile corrispondente all'id immobile con i
	 * parametri dell'immobile dato in input.
	 * 
	 * @param id_immobile
	 *            - l'id dell'immobile da modificare
	 * @param immobile
	 *            - l'oggetto immobile con i dati aggiornati
	 * @return true se l'immobile e' stato correttamente aggiornato, false
	 *         altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean modificaImmobile(int id_immobile, Immobile immobile)
			throws ClassNotFoundException, SQLException;

	/**
	 * dato l'id immobile dell'immobile da eliminare lo elimina
	 * dall'applicazione
	 * 
	 * @param id_immobile
	 *            - id dell'immobile da eliminare
	 * @return true se l'ha eliminato false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean eliminaImmobile(int id_immobile)
			throws ClassNotFoundException, SQLException;

	/**
	 * Restituisce la lista di immobili data la scheda di ricerca come parametro
	 * del metodo.<br>
	 * Se il filtro della scheda di ricerca è vuoto, allora il metodo
	 * restituisce tutti gli immobili presenti nell'applicazione.
	 * 
	 * @param scheda
	 *            - la scheda di ricerca da dover utilizzare per filtrare gli
	 *            immobili
	 * @return List&lt;Immobile&gt; - la lista degli immobili
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public List<Immobile> visualizzaImmobili(SchedaDiRicerca scheda)
			throws ClassNotFoundException, SQLException;

	/**
	 * Restituisce la lista di tutti gli immobili presenti nell'applicazione.
	 * 
	 * @return List&lt;Immobile&gt; - la lista degli immobili
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Immobile> visualizzaImmobili() throws ClassNotFoundException,
			SQLException;

	/**
	 * Dato il cliente come parametro, seleziona tutti gli immobili che matchano
	 * con le schede di ricerca di questo cliente e li restituisce.
	 * 
	 * @param cliente
	 *            - il cliente del quale si vogliono vedere i match degli
	 *            immobili
	 * @return List&lt;Immoble&gt; - la lista degli immobili che matchano con le
	 *         schede di ricerca di un cliente
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Immobile> visualizzaMatch(Cliente cliente)
			throws ClassNotFoundException, SQLException;
}
