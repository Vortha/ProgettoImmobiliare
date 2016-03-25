package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.utente.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Utente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.utente.DAO.UtenteDAO;

/**
 * Action che implementa la funzionalità della registrazione di un utente.
 * L'utente viene registrato e loggato all'applicazione.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class RegistratiAction extends ActionSupport implements SessionAware {
	/** nome inserito nel form dall'utente **/
	private String nome;
	/** cognome inserito nel form dall'utente **/
	private String cognome;
	/** telefono inserito nel form dall'utente **/
	private String telefono;
	/** email inserita nel form dall'utente **/
	private String email;
	/** password inserita nel form dall'utente **/
	private String password;
	/** mappa della sessione che tiene traccia del login */
	private SessionMap<String, Object> sessionMap;

	/**
	 * Registra un utente all'applicazione dati i parametri passati nel form.
	 * 
	 * @return success se ha effettuato la registrazione, error altrimenti.
	 */
	@Override
	public String execute() {
		Utente utente = new Utente(nome, cognome, telefono, email, password);
		UtenteDAO utenteDAO = new UtenteDAO();
		try {
			utenteDAO.registrati(utente);
			sessionMap.put("clienteLoggato", utente);
		} catch (ClassNotFoundException | SQLException e) {
			addActionError("Qualcosa è andato storto, l'email potrebbe essere già utilizzata");
			e.printStackTrace();
			return ERROR;
		}

		return SUCCESS;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap = (SessionMap) map;
	}
}
