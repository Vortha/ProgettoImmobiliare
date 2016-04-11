package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.agente.action;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Agente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.agente.DAO.AgenteDAO;

import java.sql.SQLException;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action che implementa la funzionalità della visualizzazione degli agenti
 * registrati all'applicazione.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class VisualizzaAgentiAction extends ActionSupport {
	/** Lista degli agenti registrati all'applicazione */
	private List<Agente> agenti;

	/** Istanzia la lista degli agenti registrati all'applicazione. */
	public String execute() {
		AgenteDAO dao = new AgenteDAO();
		try {
			agenti = dao.visualizzaAgenti();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			addActionError("Qualcosa è andato storto, riprovare");
			return ERROR;
		}

		return SUCCESS;
	}

	public List<Agente> getAgenti() {
		return agenti;
	}

	public void setAgenti(List<Agente> agenti) {
		this.agenti = agenti;
	}
}
