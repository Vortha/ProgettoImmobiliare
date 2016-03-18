package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.amministratore.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Agente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.agente.DAO.AgenteDAO;

/**
 * Classe DAO che implementa le funzionalità dell'Agente. Implementa
 * l'interfaccia AgenteDAOI.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class AmministratoreDAO extends AgenteDAO implements AmministratoreDAOI {

	@Override
	public boolean creaAgente(Agente agente) throws ClassNotFoundException,
			SQLException {
		String query = "insert into fruitore values('" + agente.getEmail()
				+ "', '" + agente.getNome() + "', '" + agente.getTelefono()
				+ "', '" + agente.getCognome() + "', '" + agente.getPassword()
				+ "', 0, 1, 0, 0, 0, 0, NULL)";
		System.out.println(query);
		return update(query);
	}

	@Override
	public List<Agente> visualizzaAgenti() throws ClassNotFoundException,
			SQLException {
		String query = "select email, nome, cognome, telefono,"
				+ " password from fruitore where agente = 1";
		List<Agente> agenti = new ArrayList<Agente>();

		ResultSet resultSet = select(query);

		while (resultSet.next()) {
			agenti.add(new Agente(resultSet.getString("nome"), resultSet
					.getString("cognome"), resultSet.getString("telefono"),
					resultSet.getString("email"), resultSet
							.getString("password")));
		}

		return agenti;
	}

	@Override
	public boolean modificaAgente(String email, Agente agente)
			throws ClassNotFoundException, SQLException {
		String query = "update fruitore set email = '" + agente.getEmail()
				+ "', nome = '" + agente.getNome() + "', telefono = '"
				+ agente.getTelefono() + "', cognome = '" + agente.getCognome()
				+ "', password = '" + agente.getPassword()
				+ "' where email = '" + email + "'";
		if (!update(query)) {
			return false;
		}
		query = "update fruitore set agente_assegnato = '" + agente.getEmail()
				+ "' where agente_assegnato = '" + email + "'";
		update(query);

		return true;
	}

	@Override
	public boolean eliminaAgente(String email) throws ClassNotFoundException,
			SQLException {
		String query = "delete from fruitore where email = '" + email + "'";
		boolean result = update(query);
		query = "update from fruitore set agente_assegnato = NULL where agente_assegnato = '"
				+ email + "'";
		result = update(query);
		return result;
	}

	@Override
	public boolean assegnaCliente(Agente agente, Cliente cliente)
			throws ClassNotFoundException, SQLException {
		String query = "update fruitore set agente_assegnato = '"
				+ agente.getEmail() + "' where email = '" + cliente.getEmail()
				+ "'";
		return update(query);
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		AmministratoreDAO dao = new AmministratoreDAO();
		System.out.println("Crea agente: "
				+ dao.creaAgente(new Agente("Alma", "Pennacchi", "333",
						"oveo@vo.it", "cincillà")));

		System.out.println("Visualizza agenti: " + dao.visualizzaAgenti());

		Agente agente = new Agente("Alma", "Pennacchi", "333", "fewf",
				"cincillà");
		System.out.println("Modifica agente: "
				+ dao.modificaAgente("pennacchhu@gmail.com", agente));

		Cliente cliente = new Cliente("", "", "", "pp@pp.it", "");
		System.out.println("Assegna cliente: "
				+ dao.assegnaCliente(agente, cliente));
	}
}
