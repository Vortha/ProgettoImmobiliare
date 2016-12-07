package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.DAO;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database.DBAccessManager;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.SchedaDiRicerca;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.enumClass.CampoSchedaDiRicercaEnum;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Classe DAO che implementa i metodi per la gestione degli immobili. Implementa
 * l'interfaccia ImmobileDAOI.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class ImmobileDAO extends DBAccessManager implements ImmobileDAOI {

	@Override
	public boolean creaImmobile(Immobile immobile)
			throws ClassNotFoundException, SQLException {
		String query = "insert into immobile values(NULL, '"
				+ immobile.getProvincia() + "', '" + immobile.getCitta()
				+ "', '" + immobile.getZona() + "', " + immobile.getCamere()
				+ ", " + immobile.getBagni() + ", '" + immobile.getTipologia()
				+ "', '" + immobile.getSubTipologia() + "', "
				+ immobile.getPrezzo() + ", " + immobile.getMq() + ", '"
				+ immobile.getDescrizione() + "', '" + immobile.getFoto()
				+ "')";

		return update(query);
	}

	@Override
	public int ultimoId() throws ClassNotFoundException, SQLException {
		String query = "select max(id_immobile) as id_immobile from immobile";
		ResultSet resultSet = select(query);
		resultSet.next();
		return resultSet.getInt("id_immobile");
	}

	@Override
	public boolean modificaImmobile(int id_immobile, Immobile immobile)
			throws ClassNotFoundException, SQLException {
		String query = "update immobile set provincia = '"
				+ immobile.getProvincia() + "', citta = '"
				+ immobile.getCitta() + "', zona = '" + immobile.getZona()
				+ "', camere = '" + immobile.getCamere() + "', bagni = '"
				+ immobile.getBagni() + "', tipologia = '"
				+ immobile.getTipologia() + "', subtipologia = '"
				+ immobile.getSubTipologia() + "', prezzo = '"
				+ immobile.getPrezzo() + "', mq = " + immobile.getMq()
				+ ", descrizione = '" + immobile.getDescrizione()
				+ "', foto = '" + immobile.getFoto() + "'"
				+ " where id_immobile = " + id_immobile;

		update(query);
		return true;
	}

	@Override
	public boolean eliminaImmobile(int id_immobile)
			throws ClassNotFoundException, SQLException {
		String query = "delete from immobile where id_immobile = "
				+ id_immobile;

		return update(query);
	}

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

	@Override
	public Immobile visualizzaImmobile(int idImmobile)
			throws ClassNotFoundException, SQLException {
		String query = "select * from immobile where id_immobile = "
				+ idImmobile;
		ResultSet resultSet = select(query);
		resultSet.next();
		Immobile immobile = new Immobile(resultSet.getInt("id_immobile"),
				resultSet.getString("provincia"), resultSet.getString("citta"),
				resultSet.getString("zona"), resultSet.getInt("camere"),
				resultSet.getInt("bagni"), resultSet.getString("tipologia"),
				resultSet.getString("subtipologia"),
				resultSet.getDouble("prezzo"), resultSet.getInt("mq"),
				resultSet.getString("descrizione"), resultSet.getString("foto"));
		return immobile;
	}

	@Override
	public boolean aggiungiPreferiti(Cliente cliente, Immobile immobile)
			throws ClassNotFoundException, SQLException {
		String query = "insert into preferiti values('" + cliente.getEmail()
				+ "', " + immobile.getIdImmobile() + ")";

		return update(query);
	}

	@Override
	public List<Immobile> visualizzaPreferiti(Cliente cliente)
			throws ClassNotFoundException, SQLException {
		List<Immobile> preferiti = new ArrayList<Immobile>();

		String query = "select * from preferiti where email = '"
				+ cliente.getEmail() + "'";

		ResultSet resultSet = select(query);
		ResultSet resultSet2;
		while (resultSet.next()) {
			query = "select * from immobile where id_immobile = "
					+ resultSet.getInt("id_immobile");
			resultSet2 = select(query);

			resultSet2.next();
			preferiti.add(new Immobile(resultSet2.getInt(1), resultSet2
					.getString(2), resultSet2.getString(3), resultSet2
					.getString(4), resultSet2.getInt(5), resultSet2.getInt(6),
					resultSet2.getString(7), resultSet2.getString(8),
					resultSet2.getDouble(9), resultSet2.getInt(10), resultSet2
							.getString(11), resultSet2.getString(12)));
		}

		return preferiti;
	}

	@Override
	public boolean modificaPreferiti(Cliente cliente, Immobile immobile)
			throws ClassNotFoundException, SQLException {
		String query = "delete from preferiti where email = '"
				+ cliente.getEmail() + "' and id_immobile = "
				+ immobile.getIdImmobile();

		return update(query);
	}

	@Override
	public List<Immobile> visualizzaImmobili(SchedaDiRicerca scheda)
			throws ClassNotFoundException, SQLException {
		String query = "select * from immobile";
		boolean first = true;
		for (Entry<CampoSchedaDiRicercaEnum, Object> entry : scheda
				.getMappaFiltro().entrySet()) {
			if (first) {
				query += " where";
				first = false;
			} else {
				query += " and ";
			}

			if (entry.getKey() == CampoSchedaDiRicercaEnum.FASCIA_PREZZO) {
				switch (entry.getValue().toString()) {
				case "1":
					query += " prezzo <= 100000 ";
					break;

				case "2":
					query += " prezzo between 100000 and 300000 ";
					break;

				case "3":
					query += " prezzo > 300000 ";
					break;
				}
			} else if (entry.getKey() == CampoSchedaDiRicercaEnum.FASCIA_MQ) {
				switch (entry.getValue().toString()) {
				case "1":
					query += " mq <= 50 ";
					break;

				case "2":
					query += " mq between 50 and 100 ";
					break;

				case "3":
					query += " mq between 100 and 200 ";
					break;

				case "4":
					query += " mq > 200 ";
					break;
				}
			} else {
				query += " " + entry.getKey().toString() + " = '"
						+ entry.getValue().toString() + "' ";
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

	/*
	 * (non-Javadoc) Seleziona le schede di ricerca associate al cliente e, per
	 * ogni risultato, crea un oggetto SchedaDiRicerca passandogli la
	 * mappaFiltro creata dalla select, infine aggiunge ad una lista di immobili
	 * gli immobili filtrati dalla scheda di ricerca richiamando il metodo
	 * visualizzaImmobili(new SchedaDiRicerca(mappaFiltro)). Va a sostituire il
	 * visualizzaMatchPersonale della classe Cliente (class diagram) e
	 * visualizzaMatchCliente della classe Agente (class diagram).
	 * 
	 * @see
	 * it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento
	 * .immobile.DAO.ImmobileDAOI#visualizzaMatch(it.uniroma2.IS.
	 * TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente)
	 */
	@Override
	public List<Immobile> visualizzaMatch(Cliente cliente)
			throws ClassNotFoundException, SQLException {
		String query = "select schedadiricerca.* from schedadiricerca,"
				+ " schede_fruitore where schedadiricerca.id_scheda ="
				+ " schede_fruitore.id_scheda and schede_fruitore.email = '"
				+ cliente.getEmail() + "'";
		List<Immobile> immobili = new ArrayList<Immobile>();

		ResultSet resultSet = select(query);
		Map<CampoSchedaDiRicercaEnum, Object> mappaFiltro = new HashMap<CampoSchedaDiRicercaEnum, Object>();
		int colNo;
		while (resultSet.next()) {
			ResultSetMetaData metaData = resultSet.getMetaData();

			colNo = metaData.getColumnCount();
			for (int i = 1; i < colNo; i++) {
				if (!metaData.getColumnName(i).toUpperCase()
						.equals("ID_SCHEDA")
						&& resultSet.getObject(i) != null
						&& !resultSet.getObject(i).toString().equals("0")) {
					mappaFiltro.put(CampoSchedaDiRicercaEnum.valueOf(metaData
							.getColumnName(i).toUpperCase()), resultSet
							.getObject(i));
				}
			}

			immobili.addAll(visualizzaImmobili(new SchedaDiRicerca(mappaFiltro)));
		}

		return immobili;
	}
}
