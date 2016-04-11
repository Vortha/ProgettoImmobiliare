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
	 * Restituisce l'ultimo identificativo associato ad un immobile.
	 * 
	 * @return int - l'ultimo identificativo associato ad un immobile
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int ultimoId() throws ClassNotFoundException, SQLException;

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
	 * Dato l'id immobile dell'immobile da eliminare lo elimina
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
	 * Restituisce l'immobile associato all'identificativo passato come
	 * parametro.
	 * 
	 * @param idImmobile
	 *            - l'identificativo dell'immobile
	 * @return Immobile - l'immobile associato all'identificativo
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Immobile visualizzaImmobile(int idImmobile)
			throws ClassNotFoundException, SQLException;

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

	/**
	 * Aggiunge l'immobile, dato come parametro, agli immobili preferiti del
	 * Cliente.
	 * 
	 * @param cliente
	 *            - il cliente al quale si deve aggiungere l'immobile ai
	 *            preferiti
	 * @param immobile
	 *            - l'immobile da aggiungere ai preferiti
	 * @return true se è stato aggiunto l'immobile ai preferiti, false
	 *         altrimenti
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean aggiungiPreferiti(Cliente cliente, Immobile immobile)
			throws ClassNotFoundException, SQLException;

	/**
	 * Restituisce la lista di immobili preferiti dal cliente dato come
	 * parametro.
	 * 
	 * @param cliente
	 *            - il cliente del quale si desidera vedere gli immobili
	 *            preferiti
	 * @return List&lt;Immobile&gt; - la lista di immobili preferiti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Immobile> visualizzaPreferiti(Cliente cliente)
			throws ClassNotFoundException, SQLException;

	/**
	 * Elimina l'immobile, dato come parametro, dagli immobili preferiti del
	 * Cliente.
	 * 
	 * @param cliente
	 *            - il cliente al quale si deve rimuovere l'immobile dai
	 *            preferiti
	 * @param immobile
	 *            - l'immobile da eliminare dai preferiti
	 * @return true se sono stati modificati gli immobili preferiti, false
	 *         altrimenti
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean modificaPreferiti(Cliente cliente, Immobile immobile)
			throws ClassNotFoundException, SQLException;
}
