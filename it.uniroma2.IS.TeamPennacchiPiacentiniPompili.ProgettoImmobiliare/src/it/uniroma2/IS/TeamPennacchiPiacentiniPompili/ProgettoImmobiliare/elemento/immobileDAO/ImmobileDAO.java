package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobileDAO;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database.DBAccessManager;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.enumClass.CampoSchedaDiRicercaEnum;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.enumClass.FasciaMQEnum;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.enumClass.FasciaPrezzoEnum;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
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
	public List<Immobile> visualizzaImmobili() throws ClassNotFoundException,
			SQLException {
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

	/**
	 * {@inheritDoc}<br>
	 * Il parametro mappaFiltro è una mappa &lt;CampoSchedaDiRicercaEnum,
	 * String&gt;. Per gli enum CampoSchedaDiRicercaEnum.FASCIAPREZZO e
	 * CampoSchedaDiRicercaEnum.FASCIAMQ è altamente consigliabile usare gli
	 * enum definiti per le fasce, ovvero (rispettivamente) FasciaPrezzoEnum e
	 * FasciaMQEnum.
	 */
	@Override
	public List<Immobile> visualizzaImmobili(
			Map<CampoSchedaDiRicercaEnum, Object> mappaFiltro)
			throws ClassNotFoundException, SQLException {
		String query = "select * from immobile";
		boolean first = true;
		for (Entry<CampoSchedaDiRicercaEnum, Object> entry : mappaFiltro
				.entrySet()) {
			if (first) {
				query += " where ";
				first = false;
			} else {
				query += " and ";
			}

			if (entry.getKey() == CampoSchedaDiRicercaEnum.FASCIA_PREZZO) {
				switch ((String) entry.getValue()) {
				case "FASCIA1":
					query += " prezzo <= 100000";
					break;
				case "FASCIA2":
					query += " prezzo between 100000 and 300000";
					break;
				case "FASCIA3":
					query += " prezzo > 300000";
					break;
				}
			} else if (entry.getKey() == CampoSchedaDiRicercaEnum.FASCIA_MQ) {
				switch ((String) entry.getValue()) {
				case "FASCIA1":
					query += " mq <= 50";
					break;
				case "FASCIA2":
					query += " mq between 50 and 100";
					break;
				case "FASCIA3":
					query += " mq between 100 and 200";
					break;
				case "FASCIA4":
					query += " mq > 200";
					break;
				}
			} else {
				query += entry.getKey().toString() + " = '"
						+ entry.getValue().toString() + "'";
			}
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

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		ImmobileDAO dao = new ImmobileDAO();

		System.out.println("Visualizza immobili: ");
		List<Immobile> immobiles = dao.visualizzaImmobili();
		for (Immobile i : immobiles) {
			System.out.println(i);
		}

		System.out.println("\nVisualizza immobili con filtro");
		Map<CampoSchedaDiRicercaEnum, Object> mappaFiltro = new HashMap<CampoSchedaDiRicercaEnum, Object>();
		mappaFiltro.put(CampoSchedaDiRicercaEnum.FASCIA_MQ,
				FasciaMQEnum.FASCIA1.toString());
		mappaFiltro.put(CampoSchedaDiRicercaEnum.FASCIA_PREZZO,
				FasciaPrezzoEnum.FASCIA1.toString());
		immobiles = dao.visualizzaImmobili(mappaFiltro);
		for (Immobile i : immobiles) {
			System.out.println(i);
		}
	}
}
