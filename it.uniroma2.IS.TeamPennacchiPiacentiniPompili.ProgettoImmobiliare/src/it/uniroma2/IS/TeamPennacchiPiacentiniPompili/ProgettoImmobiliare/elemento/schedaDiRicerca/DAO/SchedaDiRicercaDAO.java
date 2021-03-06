package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.schedaDiRicerca.DAO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database.DBAccessManager;
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

	/*
	 * (non-Javadoc) Itera sui campi della mappa (scheda.getMappaFiltro()) e li
	 * aggiunge nell'insert con il valore associato.
	 * 
	 * @see
	 * it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento
	 * .
	 * schedaDiRicercaDAO.SchedaDiRicercaDAOI#creaSchedaDiRicerca(it.uniroma2.IS
	 * .
	 * TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.SchedaDiRicerca
	 * )
	 */
	@Override
	public boolean creaSchedaDiRicerca(SchedaDiRicerca scheda)
			throws ClassNotFoundException, SQLException {
		String query = "insert into schedadiricerca(id_scheda";

		for (Entry<CampoSchedaDiRicercaEnum, Object> entry : scheda
				.getMappaFiltro().entrySet()) {
			query += "," + entry.getKey().toString();
		}
		query += ") values(null";

		for (Entry<CampoSchedaDiRicercaEnum, Object> entry : scheda
				.getMappaFiltro().entrySet()) {
			query += ",'" + entry.getValue().toString() + "'";
		}
		query += ")";

		return update(query);
	}

	/*
	 * (non-Javadoc) Crea una mappa associata al filtro inserendo solo i campi
	 * presenti nel database che sono non null.
	 * 
	 * @see
	 * it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento
	 * .schedaDiRicercaDAO.SchedaDiRicercaDAOI#visualizzaSchedaDiRicerca(int)
	 */
	@Override
	public SchedaDiRicerca visualizzaSchedaDiRicerca(int idScheda)
			throws ClassNotFoundException, SQLException,
			IllegalArgumentException, IllegalAccessException {
		String query = "select * from schedadiricerca where id_scheda = "
				+ idScheda;

		Map<CampoSchedaDiRicercaEnum, Object> mappaFiltro = new HashMap<CampoSchedaDiRicercaEnum, Object>();
		ResultSet resultSet = select(query);
		ResultSetMetaData metaData = resultSet.getMetaData();
		if (!resultSet.next()) {
			return null;
		}
		int colNo = metaData.getColumnCount();
		for (int i = 1; i < colNo; i++) {
			if (resultSet.getObject(i) != null) {
				mappaFiltro.put(CampoSchedaDiRicercaEnum.valueOf(metaData
						.getColumnName(i).toUpperCase()), resultSet
						.getObject(i));
			}
		}

		return new SchedaDiRicerca(mappaFiltro);
	}

	@Override
	public boolean modificaSchedaDiRicerca(SchedaDiRicerca scheda)
			throws ClassNotFoundException, SQLException {
		String query = "update schedadiricerca set ";
		int i = 0;
		for (Entry<CampoSchedaDiRicercaEnum, Object> entry : scheda
				.getMappaFiltro().entrySet()) {
			if (i > 0) {
				query += ", ";
			}
			query += entry.getKey().toString() + " = '"
					+ entry.getValue().toString() + "' ";
			i++;
		}

		query += " where id_scheda = " + scheda.getIdScheda();
		return update(query);
	}

	@Override
	public boolean eliminaSchedaDiRicerca(int idScheda)
			throws ClassNotFoundException, SQLException {
		String query = "delete from schedadiricerca where id_scheda = "
				+ idScheda;

		return update(query);
	}
}
