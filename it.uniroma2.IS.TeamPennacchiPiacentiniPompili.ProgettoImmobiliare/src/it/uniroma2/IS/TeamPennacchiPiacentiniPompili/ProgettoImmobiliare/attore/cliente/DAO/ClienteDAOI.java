package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.DAO;

import java.sql.SQLException;
import java.util.List;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;

/**
 * Interfaccia della classe DAO utilizzata per accedere ai dati relativi al
 * profilo Cliente.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public interface ClienteDAOI {
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

	/**
	 * Elimina l'account del Cliente passato come parametro.
	 * 
	 * @param cliente
	 *            - il cliente del quale si deve eliminare l'account
	 * @return true se l'account è stato eliminato con successo, false
	 *         altrimenti
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean eliminaAccount(Cliente cliente)
			throws ClassNotFoundException, SQLException;
}
