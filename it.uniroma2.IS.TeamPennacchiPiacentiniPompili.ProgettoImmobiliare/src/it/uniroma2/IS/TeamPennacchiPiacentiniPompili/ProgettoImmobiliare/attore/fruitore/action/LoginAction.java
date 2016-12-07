package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.fruitore.action;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Agente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Amministratore;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Fruitore;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.fruitore.DAO.FruitoreDAO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Classe action che implementa la funzionalità del login di un generico
 * fruitore. Quindi quest'action viene richiamata dal login del cliente, agente
 * e amministratore.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class LoginAction extends ActionSupport implements SessionAware {
	/** Email del fruitore */
	private String email;
	/** Password del fruitore */
	private String password;
	/** Mappa della sessione che tiene traccia del login */
	private SessionMap<String, Object> sessionMap;
	/** Risposta della connessione da mobile */
	private Map<String, Object> risposta;

	/**
	 * Effettua il login di un fruitore all'interno dell'applicazione e
	 * inserisce nella mappa una coppia &lt;chiave, valore&gt; dove la chiave è:<br>
	 * clienteLoggato se ha effettuato l'accesso un cliente;<br>
	 * agenteLoggato se ha effettuato l'accesso un agente;<br>
	 * amministratoreLoggato se ha effettuato l'accesso un amministratore.<br>
	 * Il valore, invece, è l'oggetto fruitore.
	 * 
	 * @return success se è stato effettuato il login, error altrimenti
	 */
	@Override
	public String execute() {
		FruitoreDAO dao = new FruitoreDAO();
		risposta = new HashMap<>();
		
		risposta.put("connessione", false);
		
		try {
			Fruitore fruitore = dao.login(email, password);
			if (fruitore == null) {
				addActionError("Credenziali errate");
				return ERROR;
			}
			if (fruitore.getClass() == Cliente.class) {
				sessionMap.put("clienteLoggato", fruitore);
				risposta.put("utente", fruitore);
				risposta.put("connessione", true);
				return SUCCESS;
			} else if (fruitore.getClass() == Agente.class) {
				sessionMap.put("agenteLoggato", fruitore);
				return SUCCESS;
			} else if (fruitore.getClass() == Amministratore.class) {
				sessionMap.put("amministratoreLoggato", fruitore);
				return "successAmministratore";
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			addActionError("Qualcosa è andato storto");
			return ERROR;
		}
		
		return ERROR;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap = (SessionMap) map;
	}
	
	public Map<String, Object> getRisposta() {
		return risposta;
	}
	
	public void setRisposta(Map<String, Object> risposta) {
		this.risposta = risposta;
	}
}
