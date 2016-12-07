package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Agente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Utente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.fruitore.DAO.FruitoreDAO;

/**
 * Classe DAO che implementa i metodi per la gestione dei clienti. Implementa
 * l'interfaccia ClienteDAOI.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class ClienteDAO extends FruitoreDAO implements ClienteDAOI {

	/*
	 * (non-Javadoc) Il cliente viene inserito nella tabella fruitore settando
	 * il campo cliente a 1. I campi corrispondenti agli altri profili vengono
	 * settati a 0.
	 * 
	 * @see
	 * it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore
	 * .cliente.DAO.ClienteDAOI#registraCliente(it.uniroma2.IS.
	 * TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Agente,
	 * it.uniroma2
	 * .IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Utente)
	 */
	@Override
	public boolean registraCliente(Agente agente, Utente utente)
			throws ClassNotFoundException, SQLException {
		String query = "insert into fruitore values('" + utente.getEmail()
				+ "', '" + utente.getNome() + "', '" + utente.getTelefono()
				+ "', '" + utente.getCognome() + "', '" + utente.getPassword()
				+ "', 1, 0, 0, 0, '" + agente.getEmail() + "', 0, NULL)";

		return update(query);
	}

	public List<Cliente> visualizzaClienti() throws ClassNotFoundException,
			SQLException {
		String query = "select * from fruitore where cliente = 1";
		List<Cliente> clienti = new ArrayList<Cliente>();
		ResultSet resultSet = select(query);
		while (resultSet.next()) {
			clienti.add(new Cliente(resultSet.getString("nome"), resultSet
					.getString("cognome"), resultSet.getString("telefono"),
					resultSet.getString("email"), resultSet
							.getString("password"), resultSet
							.getString("agente_assegnato"), resultSet
							.getBoolean("eliminato"), resultSet
							.getDate("data_eliminazione")));
		}

		return clienti;
	}

	@Override
	public List<Cliente> visualizzaClienti(Agente agente)
			throws ClassNotFoundException, SQLException {
		String query = "select * from fruitore where agente_assegnato = '"
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

	/*
	 * (non-Javadoc) Setta a 1 il campo eliminato del cliente e la data di
	 * eliminazione a quella corrente.
	 * 
	 * @see
	 * it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore
	 * .cliente
	 * .DAO.ClienteDAOI#eliminaAccount(it.uniroma2.IS.TeamPennacchiPiacentiniPompili
	 * .ProgettoImmobiliare.attore.Cliente)
	 */
	@Override
	public boolean eliminaAccount(Cliente cliente)
			throws ClassNotFoundException, SQLException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String query = "update fruitore set eliminato = 1 and data_eliminazione = '"
				+ dateFormat.format(date)
				+ "'  where email = '"
				+ cliente.getEmail() + "'";
		return update(query);
	}

	@Override
	public boolean aggiungiPreferiti(String email, int idImmobile)
			throws ClassNotFoundException, SQLException {
		String query = "insert into preferiti values('" + email + "', "
				+ idImmobile + ")";
		return update(query);
	}

	@Override
	public boolean rimuoviPreferiti(String email, int idImmobile)
			throws ClassNotFoundException, SQLException {
		String query = "delete from preferiti where email = '" + email
				+ "' and id_immobile = " + idImmobile;
		return update(query);
	}

	public Cliente ottieniCliente(String email) throws ClassNotFoundException,
			SQLException {
		String query = "select * from fruitore where email = '" + email
				+ "' and cliente = true";
		ResultSet resultSet = select(query);
		resultSet.next();

		return new Cliente(resultSet.getString("nome"),
				resultSet.getString("cognome"),
				resultSet.getString("telefono"), email, "");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ClienteDAO clienteDAO = new ClienteDAO();
		
		System.out.println(clienteDAO.ottieniCliente("prova@prova.it"));
	}
}
