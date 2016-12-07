package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.fruitore.DAO;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Agente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Amministratore;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Fruitore;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database.DBAccessManager;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.enumClass.DatiPersonaliEnum;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Classe DAO che implementa i metodi per la gestione del fruitore. Implementa
 * l'interfaccia FruitoreDAOI.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class FruitoreDAO extends DBAccessManager implements FruitoreDAOI {

	/*
	 * (non-Javadoc) Verifica quale è il campo associato al profilo (Cliente,
	 * Agente, Amministratore) posto a 1 e istanzia un fruitore di quel tipo.
	 * 
	 * @see
	 * it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore
	 * .fruitore.DAO.FruitoreDAOI#login(java.lang.String, java.lang.String)
	 */
	@Override
	public Fruitore login(String email, String password)
			throws ClassNotFoundException, SQLException {
		String query = "select * from fruitore where email = '" + email
				+ "' and password = '" + password + "'";
		ResultSet resultSet = select(query);
		if (resultSet.first() == true) {
			if (resultSet.getBoolean("cliente")
					|| resultSet.getBoolean("cliente_mobile")) {
				return new Cliente(resultSet.getString("nome"),
						resultSet.getString("cognome"),
						resultSet.getString("telefono"), email, "");
			} else if (resultSet.getBoolean("agente")) {
				return new Agente(resultSet.getString("nome"),
						resultSet.getString("cognome"),
						resultSet.getString("telefono"), email, "");
			} else if (resultSet.getBoolean("amministratore")) {
				return new Amministratore(resultSet.getString("nome"),
						resultSet.getString("cognome"),
						resultSet.getString("telefono"), email, "");
			}
		}
		return null;
	}

	@Override
	public boolean logout() {
		return false;
	}

	/*
	 * (non-Javadoc) Aggiunge alla query, in modo dinamico, i campi da
	 * modificare con i valori associati, prendendoli dalla mappa.
	 * 
	 * @see
	 * it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore
	 * .fruitore.DAO.FruitoreDAOI#modificaDatiPersonali(java.lang.String,
	 * java.util.Map)
	 */
	@Override
	public boolean modificaDatiPersonali(String email,
			Map<DatiPersonaliEnum, String> datiPersonali)
			throws ClassNotFoundException, SQLException {
		String query = "update fruitore set ";
		boolean first = true;
		for (Entry<DatiPersonaliEnum, String> entry : datiPersonali.entrySet()) {
			if (first) {
				first = false;
			} else {
				query += ", ";
			}
			query += entry.getKey().toString() + " = '"
					+ entry.getValue().toString() + "'";
		}
		query += " where email = '" + email + "'";

		if (update(query)) {
			return true;
		}

		return false;
	}
}
