package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.action;

import java.sql.SQLException;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.DAO.ImmobileDAO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Classe action che implementa la funzionalità dell'eliminazione di un
 * immobile.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class EliminaImmobileAction extends ActionSupport {
	/** L'identificativo associato all'immobile da eliminare */
	private int idImmobile;

	/** Elimina dall'applicazione l'immobile associato all'identificativo. */
	@Override
	public String execute() {
		ImmobileDAO dao = new ImmobileDAO();
		try {
			dao.eliminaImmobile(idImmobile);
		} catch (ClassNotFoundException | SQLException e) {
			addActionError("Qualcosa è andato storto");
			e.printStackTrace();
			return ERROR;
		}
		addActionMessage("Immobile eliminato");
		return SUCCESS;
	}

	public int getIdImmobile() {
		return idImmobile;
	}

	public void setIdImmobile(int idImmobile) {
		this.idImmobile = idImmobile;
	}
}
