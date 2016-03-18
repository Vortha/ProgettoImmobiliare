package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.fruitore.DAO;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.enumClass.DatiPersonaliEnum;

import java.sql.SQLException;
import java.util.Map;

/**
 * Interfaccia della classe DAO utilizzata per accedere ai dati relativi al
 * profilo fruitore.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public interface FruitoreDAOI {
	/**
	 * Effettua il login all'applicazione dati email e password del fruitore.
	 * 
	 * @param email
	 *            - l'email del fruitore
	 * @param password
	 *            - la password del fruitore
	 * @return true se il login ha avuto successo, false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean login(String email, String password)
			throws ClassNotFoundException, SQLException;

	/** Effettua il logout dall'applicazione. **/
	public boolean logout();

	/**
	 * Modifica i dati personali del fruitore dati i parametri.
	 * 
	 * @param email
	 *            - email del fruitore
	 * @param datiPersonali
	 *            - dati personali da modificare del fruitore presi come una
	 *            coppia (chiave, valore) dove la chiave è un enum
	 *            DatiPersonaliEnum
	 * @return true se i dati sono stati modificati con successo, false
	 *         altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean modificaDatiPersonali(String email,
			Map<DatiPersonaliEnum, String> datiPersonali)
			throws ClassNotFoundException, SQLException;
}
