package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.agente.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Agente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Utente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database.DBAccessManager;

/**
 * Classe DAO che implementa le funzionalità dell'Agente. Implementa
 * l'interfaccia AgenteDAOI.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class AgenteDAO extends DBAccessManager implements AgenteDAOI {

	@Override
	public boolean registraCliente(Agente agente, Utente utente)
			throws ClassNotFoundException, SQLException {
		String query = "insert into fruitore values('" + utente.getEmail()
				+ "', '" + utente.getNome() + "', '" + utente.getTelefono()
				+ "', '" + utente.getCognome() + "', '" + utente.getPassword()
				+ "', 1, 0, 0, 0, '" + agente.getEmail() + "', 0, NULL)";

		return update(query);
	}

	@Override
	public List<Cliente> visualizzaClienti(Agente agente)
			throws ClassNotFoundException, SQLException {
		String query = "select * from fruitore where email = '"
				+ agente.getEmail() + "'";
		List<Cliente> clientiAssegnati = new ArrayList<Cliente>();
		ResultSet resultSet = select(query);
		while (resultSet.next()) {
			clientiAssegnati.add(new Cliente(resultSet.getString("nome"),
					resultSet.getString("cognome"), resultSet
							.getString("telefono"), resultSet
							.getString("email"), resultSet
							.getString("password"), resultSet
							.getBoolean("eliminato"), resultSet
							.getDate("data_eliminazione")));
		}

		return clientiAssegnati;
	}

	@Override
	public boolean modificaCliente(String vecchiaEmail, Cliente cliente)
			throws ClassNotFoundException, SQLException {
		String query = "update fruitore set email = '" + cliente.getEmail()
				+ "', nome = '" + cliente.getNome() + "', telefono = '"
				+ cliente.getTelefono() + "', cognome = '"
				+ cliente.getCognome() + "' where email = '" + vecchiaEmail
				+ "'";

		return update(query);
	}

	@Override
	public boolean eliminaCliente(Cliente cliente)
			throws ClassNotFoundException, SQLException {
		String query = "delete from fruitore where email = '"
				+ cliente.getEmail() + "'";

		return update(query);
	}

}
