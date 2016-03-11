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

	public List<Immobile> visualizzaMatch(Cliente cliente)
			throws ClassNotFoundException, SQLException;
}
