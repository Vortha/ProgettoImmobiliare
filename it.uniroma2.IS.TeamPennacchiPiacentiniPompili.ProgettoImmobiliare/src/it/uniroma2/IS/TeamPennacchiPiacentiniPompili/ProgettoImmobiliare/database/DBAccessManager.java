package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;

import com.sun.rowset.CachedRowSetImpl;

/**
 * Superclasse comune a tutti i DAO che utilizzano JDBC per accedere al
 * database. Raggruppa metodi comuni alle DAO per l'esecuzione delle query.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class DBAccessManager {
	/**
	 * Esegue la query, passata come argomento, sul database e restituisce un
	 * ResultSet.
	 * 
	 * @param query
	 *            - la query da essere eseguita
	 * @return ResultSet - il ResultSet istanziato dall'esecuzione della query
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public ResultSet select(String query) throws ClassNotFoundException,
			SQLException {
		Connection connection = null;
		DBLocator dbLocator = DBLocator.getDBLocator();
		connection = dbLocator.getConnection();
		PreparedStatement statement = connection.prepareStatement(query);
		ResultSet resultSet = statement.executeQuery();
		CachedRowSet rowSet = new CachedRowSetImpl();
		rowSet.populate(resultSet);
		connection.close();
		return rowSet;
	}

	/**
	 * Esegue la query, passata come argomento, sul database e restituisce un
	 * valore booleano nel caso sia riuscito ad eseguire la query o no.
	 * 
	 * @param query
	 *            - la query da essere eseguita
	 * @return true se ha modificato correttamente i campi, false altrimenti
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean update(String query) throws ClassNotFoundException,
			SQLException {
		Connection connection = null;
		DBLocator dbLocator = DBLocator.getDBLocator();
		connection = dbLocator.getConnection();
		PreparedStatement statement = connection.prepareStatement(query);
		int rows = statement.executeUpdate();
		if (rows == 1) {
			return true;
		}
		return false;
	}
}
