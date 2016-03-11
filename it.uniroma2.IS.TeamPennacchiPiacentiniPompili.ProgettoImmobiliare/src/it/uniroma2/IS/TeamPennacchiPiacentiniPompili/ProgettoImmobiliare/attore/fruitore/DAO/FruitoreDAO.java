package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.fruitore.DAO;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database.DBAccessManager;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.enumClass.DatiPersonaliEnum;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Classe DAO che implementa le funzionalità del fruitore. Implementa
 * l'interfaccia FruitoreDAOI.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class FruitoreDAO extends DBAccessManager implements FruitoreDAOI {

	@Override
	public boolean login(String email, String password)
			throws ClassNotFoundException, SQLException {
		String query = "select * from fruitore where email = '" + email
				+ "' and password = '" + password + "'";
		ResultSet resultSet = select(query);
		if (resultSet.first() == true) {
			return true;
		}
		return false;
	}

	@Override
	public boolean logout() {
		return false;
	}

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

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		FruitoreDAO dao = new FruitoreDAO();
		System.out.println("Login: " + dao.login("pomp@pomp.it", "pomp"));
		
		Map<DatiPersonaliEnum, String> datiPersonali = new HashMap<>();
		datiPersonali.put(DatiPersonaliEnum.TELEFONO, "3358969453");
		datiPersonali.put(DatiPersonaliEnum.PASSWORD, "superalmone");
		datiPersonali.put(DatiPersonaliEnum.COGNOME, "Vigliano");
		datiPersonali.put(DatiPersonaliEnum.EMAIL, "vigliano@uniroma2.it");
		datiPersonali.put(DatiPersonaliEnum.NOME, "Lory");
		datiPersonali.put(DatiPersonaliEnum.PASSWORD, "ciacia");
		System.out.println("Modifica dati personali: " + dao.modificaDatiPersonali("vigliano@uniroma2.it", datiPersonali));
	}
}
