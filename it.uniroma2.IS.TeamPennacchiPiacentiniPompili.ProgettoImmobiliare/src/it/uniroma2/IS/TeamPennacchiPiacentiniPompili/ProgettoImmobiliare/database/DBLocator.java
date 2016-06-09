package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe Singleton che fornisce connessioni JDBC al database.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class DBLocator {
	/** Url del database */
	private static final String url = "jdbc:mysql://localhost/estatedb";
	/** Username dell'utente per la connessione al database */
	private static final String username = "estatedb";
	/** Password dell'utente per la connessione al database */
	private static final String password = "estatedb";
	/** Indirizzo del driver utilizzato per la connessione JDBC */
	private static final String driver = "com.mysql.jdbc.Driver";
	/** Driver Singleton */
	private static DBLocator me = null;

	/**
	 * Istanzia il driver Singleton.
	 * 
	 * @throws ClassNotFoundException
	 */
	public DBLocator() throws ClassNotFoundException {
		init();
	}

	/**
	 * Ottiene un riferimento all'oggetto della classe.
	 * 
	 * @throws ClassNotFoundException
	 */
	private void init() throws ClassNotFoundException {
		Class.forName(driver);
	}

	/**
	 * Restituisce il driver Singleton. Se non istanziato, lo istanzia e poi lo
	 * restituisce.
	 * 
	 * @return DBLocator - Singleton
	 * @throws ClassNotFoundException
	 */
	public synchronized static DBLocator getDBLocator()
			throws ClassNotFoundException {
		if (me == null) {
			me = new DBLocator();
		}

		return me;
	}

	/**
	 * Restituisce la connessione al database.
	 * 
	 * @return Connection - la connessione al database
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
}
