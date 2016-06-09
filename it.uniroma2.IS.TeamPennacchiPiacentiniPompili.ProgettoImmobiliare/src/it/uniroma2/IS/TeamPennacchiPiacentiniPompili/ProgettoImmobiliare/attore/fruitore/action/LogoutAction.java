package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.fruitore.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Classe action che implementa la funzionalità di logout di un generico fruitore.
 * Quindi quest'action viene richiamata dal logout del cliente, agente e
 * amministratore.
 * 
 * @author Team Pennacchi Piacentini Pompili
 *
 */
public class LogoutAction extends ActionSupport implements SessionAware {
	/** Mappa della sessione che tiene traccia del login */
	private SessionMap<String, Object> sessionMap;

	/**
	 * Chiude la sessione corrente.
	 * 
	 * @return "success"
	 */
	public String execute() {
		if (sessionMap != null) {
			sessionMap.invalidate();
		}

		return SUCCESS;
	}
	
	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap = (SessionMap) map;
	}
}
