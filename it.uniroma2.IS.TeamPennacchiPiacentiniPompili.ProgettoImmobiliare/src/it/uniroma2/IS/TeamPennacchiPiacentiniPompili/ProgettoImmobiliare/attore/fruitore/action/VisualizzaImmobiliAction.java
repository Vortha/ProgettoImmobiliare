package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.fruitore.action;

import java.sql.SQLException;
import java.util.List;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.DAO.ImmobileDAO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Classe action che implementa la funzionalità del visualizza immobili di un
 * generico fruitore.<br>
 * Istanzia la lista degli immobili presenti all'interno dell'applicazione.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class VisualizzaImmobiliAction extends ActionSupport {
	/** lista degli immobili presenti all'interno dell'applicazione **/
	List<Immobile> immobili;

	/** Istanzia gli immobili presenti all'interno dell'applicazione. **/
	@Override
	public String execute() {
		ImmobileDAO dao = new ImmobileDAO();
		try {
			immobili = dao.visualizzaImmobili();
		} catch (ClassNotFoundException | SQLException e) {
			addActionError("Qualcosa è andato storto, provare ad aggiornare la pagina per visualizzare la lista degli immobili");
			e.printStackTrace();
			return ERROR;
		}

		return SUCCESS;
	}

	public List<Immobile> getImmobili() {
		return immobili;
	}
}
