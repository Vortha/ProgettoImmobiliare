package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.action;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.Cliente;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.DAO.ClienteDAO;

import java.sql.SQLException;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action che implementa la funzionalità della visualizzazione dei clienti che
 * sono presenti all'interno dell'applicazione.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class VisualizzaClientiAmministratoreAction extends ActionSupport {
	/** Lista dei clienti assegnati all'agente collegato all'applicazione */
	private List<Cliente> clienti;

	/** Istanzia la lista dei clienti registrati all'applicazione. */
	@Override
	public String execute() {
		ClienteDAO dao = new ClienteDAO();
		try {
			clienti = dao.visualizzaClienti();
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

}