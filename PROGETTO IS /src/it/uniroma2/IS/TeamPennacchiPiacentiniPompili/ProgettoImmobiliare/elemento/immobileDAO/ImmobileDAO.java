package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobileDAO;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.Enum.CampiImmobileEnum;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database.DBAccessManager;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Classe DAO che implementa le funzionalità per le operazioni sugli immobili.
 * Implementa l'interfaccia ImmobileDAOI.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class ImmobileDAO extends DBAccessManager implements ImmobileDAOI {
	@Override
	public List<Immobile> visualizzaImmobili() throws ClassNotFoundException, SQLException {
		String query = "select * from immobile";
		List<Immobile> listaImmobili = new ArrayList<>();
		ResultSet resultSet = select(query);
		while (resultSet.next()) {
			listaImmobili.add(new Immobile(resultSet.getInt(1), resultSet
					.getString(2), resultSet.getString(3), resultSet
					.getString(4), resultSet.getInt(5), resultSet.getInt(6),
					resultSet.getString(7), resultSet.getString(8), resultSet
							.getDouble(9), resultSet.getInt(10), resultSet
							.getString(11), resultSet.getString(12)));
		}

		return listaImmobili;
	}
	
	@Override
	public List<Immobile> visualizzaImmobili(
			Map<CampiImmobileEnum, String> mappaFiltro)
			throws ClassNotFoundException, SQLException {
		String query = "select * from immobile where ";
		boolean first = true;
		for (Entry<CampiImmobileEnum, String> entry : mappaFiltro.entrySet()) {
			if (first) {
				first = false;
			} else {
				query += " and ";
			}
			query += entry.getKey().toString() + " = '"
					+ entry.getValue().toString() + "'";
		}
		List<Immobile> listaImmobili = new ArrayList<>();
		ResultSet resultSet = select(query);
		while (resultSet.next()) {
			listaImmobili.add(new Immobile(resultSet.getInt(1), resultSet
					.getString(2), resultSet.getString(3), resultSet
					.getString(4), resultSet.getInt(5), resultSet.getInt(6),
					resultSet.getString(7), resultSet.getString(8), resultSet
							.getDouble(9), resultSet.getInt(10), resultSet
							.getString(11), resultSet.getString(12)));
		}
		
		return listaImmobili;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ImmobileDAO dao = new ImmobileDAO();
		List<Immobile> immobiles = dao.visualizzaImmobili();
		for (Immobile i : immobiles) {
			System.out.println(i);
		}
	}
}
