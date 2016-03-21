package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.fruitore.DAO.FruitoreDAO;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;

/**
 * Classe DAO che implementa le funzionalità del Cliente. Implementa
 * l'interfaccia ClienteDAOI.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class ClienteDAO extends FruitoreDAO implements ClienteDAOI {

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
	public boolean eliminaAccount(Cliente cliente)
			throws ClassNotFoundException, SQLException {
		String query = "delete from fruitore where email = '"
				+ cliente.getEmail() + "'";

		return update(query);
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		ClienteDAO dao = new ClienteDAO();
		Cliente cliente = new Cliente("Lory", "Vigliano", "3358969453",
				"pomp@pomp.it", "ciacia");
		Immobile immobile = new Immobile(7, "", "", "", 0, 0, "", "", 0, 0, "",
				"");

		 System.out.println("Aggiungi preferiti: "
		 + dao.aggiungiPreferiti(cliente, immobile));

		System.out.println("Visualizza preferiti: ");
		System.out.println(dao.visualizzaPreferiti(cliente));

		 System.out.println("Modifica preferiti: "
		 + dao.modificaPreferiti(cliente, immobile));
		
		 System.out.println("Elimina account: " +
		 dao.eliminaAccount(cliente));
	}
}
