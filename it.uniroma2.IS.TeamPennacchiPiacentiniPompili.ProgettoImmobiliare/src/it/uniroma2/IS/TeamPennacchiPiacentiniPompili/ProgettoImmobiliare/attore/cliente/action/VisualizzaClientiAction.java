package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Agente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.DAO.ClienteDAO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action che implementa la funzionalità della visualizzazione dei clienti che
 * sono presenti all'interno dell'applicazione dato l'agente loggato.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class VisualizzaClientiAction extends ActionSupport implements
		SessionAware {
	/** Lista dei clienti assegnati all'agente collegato all'applicazione */
	private List<Cliente> clienti;
	/** Mappa della sessione che tiene traccia del login */
	private SessionMap<String, Object> sessionMap;

	/** Dato l'agente loggato, istanzia la lista dei clienti a lui assegnati. */
	@Override
	public String execute() {
		ClienteDAO dao = new ClienteDAO();
		Agente agente = (Agente) sessionMap.get("agenteLoggato");
		try {
			clienti = dao.visualizzaClienti(agente);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			addActionError("Qualcosa è andato storto, riprova");
			return ERROR;
		}

		return SUCCESS;
	}

	public List<Cliente> getClienti() {
		return clienti;
	}

	public void setClienti(List<Cliente> clienti) {
		this.clienti = clienti;
	}

	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap = (SessionMap) map;
	}
}
