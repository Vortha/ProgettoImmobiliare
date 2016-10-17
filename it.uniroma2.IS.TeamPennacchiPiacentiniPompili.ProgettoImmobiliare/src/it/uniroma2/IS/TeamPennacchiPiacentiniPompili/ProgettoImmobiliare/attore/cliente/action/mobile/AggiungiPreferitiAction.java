package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.action.mobile;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.DAO.ClienteDAO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Classe action che implementa la funzionalità dell'aggiunta di un immobile tra
 * i preferiti del cliente.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class AggiungiPreferitiAction extends ActionSupport {
	/** L'email del cliente che vuole aggiungere l'immobile tra i preferiti */
	private String email;
	/**
	 * L'identificativo dell'immobile da aggiungere alla lista degli immobili
	 * preferiti dal cliente
	 */
	private int idImmobile;
	/** Risposta dell'inserimento dell'immobile tra i preferiti */
	private Map<String, Boolean> risposta;
	

	/**
	 * Aggiunge l'immobile identificato dall'attributo idImmobile tra i
	 * preferiti del cliente identificato dall'attributo email.
	 */
	@Override
	public String execute() {
		ClienteDAO clienteDAO = new ClienteDAO();
		risposta = new HashMap<>();
		risposta.put("inserimento", false);
		
		email = "prova@prova.it";
		idImmobile = 1;
		
		try {
			clienteDAO.aggiungiPreferiti(email, idImmobile);
			risposta.put("inserimento", true);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return SUCCESS;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdImmobile() {
		return idImmobile;
	}

	public void setIdImmobile(int idImmobile) {
		this.idImmobile = idImmobile;
	}
	
	public Map<String, Boolean> getRisposta() {
		return risposta;
	}
	
	public void setRisposta(Map<String, Boolean> risposta) {
		this.risposta = risposta;
	}
}
