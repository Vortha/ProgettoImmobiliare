package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.schedaDiRicercaDAO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database.DBAccessManager;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.SchedaDiRicerca;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.enumClass.CampoSchedaDiRicercaEnum;

/**
 * Classe DAO che implementa le funzionalità per le operazioni sulle schede di
 * ricerca. Implementa l'interfaccia ImmobileDAOI.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class SchedaDiRicercaDAO extends DBAccessManager implements
		SchedaDiRicercaDAOI {

	@Override
	public boolean creaSchedaDiRicerca(SchedaDiRicerca scheda)
			throws ClassNotFoundException, SQLException {
		String query = "insert into schedadiricerca(id_scheda";

		for (Entry<CampoSchedaDiRicercaEnum, String> entry : scheda
				.getMappaFiltro().entrySet()) {
			query += "," + entry.getKey().toString();
		}
		query += ") values(null";

		for (Entry<CampoSchedaDiRicercaEnum, String> entry : scheda
				.getMappaFiltro().entrySet()) {
			query += ",'" + entry.getValue().toString() + "'";
		}
		query += ")";

		return update(query);
	}

	@Override
	public SchedaDiRicerca visualizzaSchedaDiRicerca(int idScheda)
			throws ClassNotFoundException, SQLException {
		String query = "select * from schedadiricerca where id_scheda = "
				+ idScheda;

		Map<CampoSchedaDiRicercaEnum, String> mappaFiltro = new HashMap<CampoSchedaDiRicercaEnum, String>();
		ResultSet resultSet = select(query);
		ResultSetMetaData metaData = resultSet.getMetaData();
		resultSet.next();

		for (int i = 2; i < metaData.getColumnCount(); i++) {
			mappaFiltro.put(CampoSchedaDiRicercaEnum.valueOf(metaData
					.getColumnName(i).toUpperCase()), resultSet.getString(i));
		}

		return new SchedaDiRicerca(mappaFiltro);
	}

	@Override
	public boolean modificaSchedaDiRicerca(SchedaDiRicerca scheda) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminaSchedaDiRicerca(int idScheda) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		SchedaDiRicercaDAO dao = new SchedaDiRicercaDAO();
		SchedaDiRicerca ricerca = new SchedaDiRicerca();
		ricerca.setCitta("rm");
		ricerca.setFasciaPrezzo(0);
		System.out.println("Crea scheda di ricerca: "
				+ dao.creaSchedaDiRicerca(ricerca));

		System.out.println(dao.visualizzaSchedaDiRicerca(1));
	}
}
