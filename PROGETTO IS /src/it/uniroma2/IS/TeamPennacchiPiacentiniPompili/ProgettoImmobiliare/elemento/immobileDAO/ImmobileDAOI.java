package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobileDAO;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.Enum.CampiImmobileEnum;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Interfaccia della classe DAO utilizzata per accedere ai dati relativi agli
 * immobili.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public interface ImmobileDAOI {
	/**
	 * Restituisce la lista di immobili dato il filtro come paramentro. Se non
	 * settato, il metodo restituisce tutti gli immobili presenti
	 * nell'applicazione.
	 * 
	 * @param mappaFiltro
	 *            - filtro degli immobili da ricercare
	 * @return List&lt;Immobile&gt; la lista degli immobili
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public List<Immobile> visualizzaImmobili(
			Map<CampiImmobileEnum, String> mappaFiltro)
			throws ClassNotFoundException, SQLException;

	/**
	 * Restituisce la lista di tutti gli immobili presenti nell'applicazione.
	 * 
	 * @return List&lt;Immobile&gt; la lista degli immobili
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<Immobile> visualizzaImmobili() throws ClassNotFoundException,
			SQLException;
}
