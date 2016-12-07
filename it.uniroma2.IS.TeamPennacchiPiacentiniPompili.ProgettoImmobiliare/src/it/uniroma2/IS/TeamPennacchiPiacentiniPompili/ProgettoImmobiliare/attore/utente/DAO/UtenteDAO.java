package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.utente.DAO;

import java.sql.SQLException;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Utente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database.DBAccessManager;

/**
 * Classe DAO che implementa i metodi per la gestione degli utenti. Implementa
 * l'interfaccia UtenteDAOI.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class UtenteDAO extends DBAccessManager implements UtenteDAOI {

	@Override
	public boolean registrati(Utente utente) throws ClassNotFoundException,
			SQLException {
		String query = "insert into fruitore(email,"
				+ " nome, telefono, cognome, password,"
				+ " cliente, agente, amministratore, "
				+ "cliente_mobile, agente_assegnato) values('"
				+ utente.getEmail() + "', '" + utente.getNome() + "', '"
				+ utente.getTelefono() + "', '" + utente.getCognome() + "', '"
				+ utente.getPassword() + "', 1, 0, 0, 0, 0)";
		return update(query);
	}

	/*
	 * (non-Javadoc) Non implementata.
	 * 
	 * @see
	 * it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore
	 * .utente
	 * .DAO.UtenteDAOI#riattivaAccount(it.uniroma2.IS.TeamPennacchiPiacentiniPompili
	 * .ProgettoImmobiliare.attore.Utente)
	 */
	@Override
	public boolean riattivaAccount(Utente utente) {
		return false;
	}
}
