package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.action.mobile;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.DAO.ClienteDAO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Classe action che implementa la funzionalità della rimozione di un immobile
 * dai preferiti del cliente.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class RimuoviPreferitiAction extends ActionSupport {
	/** L'email del cliente che vuole rimuovere l'immobile dai preferiti */
	private String email;
	/**
	 * L'identificativo dell'immobile da rimuovere dalla lista degli immobili
	 * preferiti dal cliente
	 */
	private int idImmobile;
	/** Risposta della rimozione dell'immobile dai preferiti */
	private Map<String, Boolean> risposta;

	/**
	 * Rimuove l'immobile identificato dall'attributo idImmobile dai preferiti
	 * del cliente identificato dall'attributo email.
	 */
	@Override
	public String execute() {
		ClienteDAO clienteDAO = new ClienteDAO();
		risposta = new HashMap<>();
		risposta.put("rimozione", false);

		try {
			clienteDAO.rimuoviPreferiti(email, idImmobile);
			risposta.put("rimozione", true);
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
