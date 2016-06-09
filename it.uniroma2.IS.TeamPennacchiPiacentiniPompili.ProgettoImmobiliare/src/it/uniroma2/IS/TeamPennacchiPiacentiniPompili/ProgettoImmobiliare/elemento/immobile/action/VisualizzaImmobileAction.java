package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.action;

import java.sql.SQLException;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.DAO.ImmobileDAO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Classe action che implementa la funzionalità del visualizza immobile di un
 * generico fruitore.<br>
 * Istanzia un'immobile dato l'identificativo associato ad esso.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class VisualizzaImmobileAction extends ActionSupport {
	/** L'immobile istanziato dato l'identificativo */
	private Immobile immobile;
	/** Identificativo associato all'immobile */
	private int idImmobile;

	/** Istanzia l'immobile associato all'identificativo passato. */
	@Override
	public String execute() {
		ImmobileDAO dao = new ImmobileDAO();
		try {
			immobile = dao.visualizzaImmobile(idImmobile);
		} catch (ClassNotFoundException | SQLException e) {
			addActionError("Qualcosa è andato storto, riprovare");
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}

	public int getIdImmobile() {
		return idImmobile;
	}

	public void setIdImmobile(int idImmobile) {
		this.idImmobile = idImmobile;
	}

	public Immobile getImmobile() {
		return immobile;
	}

	public void setImmobile(Immobile immobile) {
		this.immobile = immobile;
	}
}
