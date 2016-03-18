package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.amministratore.DAO;

import java.sql.SQLException;
import java.util.List;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Agente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;

/**
 * Interfaccia della classe DAO utilizzata per accedere ai dati relativi al
 * profilo Amministratore.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public interface AmministratoreDAOI {
	/**
	 * Dato l'agente come parametro, lo registra all'interno dell'applicazione.
	 * 
	 * @param agente
	 *            - l'agente che si vuole registrare all'applicazione
	 * @return true se l'agente è stato registrato, false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean creaAgente(Agente agente) throws ClassNotFoundException,
			SQLException;

	/**
	 * Restituisce la lista degli agenti presenti all'interno dell'applicazione.
	 * 
	 * @return List&lt;Agente&gt; - la lista degli agenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Agente> visualizzaAgenti() throws ClassNotFoundException,
			SQLException;

	/**
	 * Modifica l'agente identificato dal campo email, dato come parametro, con
	 * i campi del parametro agente.
	 * 
	 * @param email
	 *            - l'email dell'agente del quale si vogliono modificare i dati
	 * @param agente
	 *            - l'oggetto agente istanziato con i nuovi dati
	 * @return true se l'agente è stato modificato, false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean modificaAgente(String email, Agente agente)
			throws ClassNotFoundException, SQLException;

	/**
	 * Data l'email come parametro, elimina l'agente associato a quell'email.
	 * 
	 * @param email
	 *            - l'email dell'agente da eliminare
	 * @return true se ha eliminato l'agente, false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean eliminaAgente(String email) throws ClassNotFoundException,
			SQLException;

	/**
	 * Assegna l'agente al cliente dati come parametri.
	 * 
	 * @param agente
	 *            - l'agente che si vuole assegnare al cliente
	 * @param cliente
	 *            - il cliente al quale assegnare l'agente
	 * @return true se ha assegnato il cliente all'agente, false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean assegnaCliente(Agente agente, Cliente cliente)
			throws ClassNotFoundException, SQLException;
}
