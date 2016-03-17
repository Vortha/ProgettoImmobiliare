package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.utente.DAO;

import java.sql.SQLException;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Utente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database.DBAccessManager;

public class UtenteDAO extends DBAccessManager implements UtenteDAOI {

	@Override
	public boolean registrati(Utente utente) throws ClassNotFoundException,
			SQLException {
		String query = "insert into fruitore values('" + utente.getEmail()
				+ "', '" + utente.getNome() + "', '" + utente.getTelefono()
				+ "', '" + utente.getCognome() + "', '" + utente.getPassword()
				+ "', 1, 0, 0, 0, 0)";

		return update(query);
	}

	@Override
	public boolean riattivaAccount(Utente utente) {
		return false;
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		UtenteDAO dao = new UtenteDAO();
		Utente utente = new Utente("Valerio", "Pompili", "331331331",
				"pomp@pomp.it", "pomp");

		System.out.println("Registrati: " + dao.registrati(utente));
	}
}
