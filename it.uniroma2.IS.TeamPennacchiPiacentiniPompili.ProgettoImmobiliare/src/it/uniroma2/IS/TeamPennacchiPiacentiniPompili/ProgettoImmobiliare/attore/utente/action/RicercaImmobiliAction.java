package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.utente.action;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.SchedaDiRicerca;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.DAO.ImmobileDAO;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.enumClass.CampoSchedaDiRicercaEnum;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action che implementa la funzionalità della ricerca degli immobili.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class RicercaImmobiliAction extends ActionSupport {
	/** Provincia inserita nel form dall'utente o dal fruitore */
	private String provincia;
	/** Città inserita nel form dall'utente o dal fruitore */
	private String citta;
	/** Zona inserita nel form dall'utente o dal fruitore */
	private String zona;
	/** Fascia prezzo inserita nel form dall'utente o dal fruitore */
	private int fasciaPrezzo;
	/** Fascia MQ inserita nel form dall'utente o dal fruitore */
	private int fasciaMQ;
	/** Tipologia inserita nel form dall'utente o dal fruitore */
	private String tipologia;
	/** Sub tipologia inserita nel form dall'utente o dal fruitore */
	private String subTipologia;
	/**
	 * Lista di immobili che matchano i campi riempiti dall'utente o dal
	 * fruitore
	 **/
	List<Immobile> immobili;

	/**
	 * Istanzia la lista degli immobili che matchano con i campi inseriti nel
	 * form.
	 */
	/*
	 * (non-Javadoc) Fa un check sui campi: se non sono vuoti allora li
	 * inserisce nella mappa.
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() {
		Map<CampoSchedaDiRicercaEnum, Object> mappaFiltro = new HashMap<CampoSchedaDiRicercaEnum, Object>();
		if (!provincia.equals("")) {
			mappaFiltro.put(CampoSchedaDiRicercaEnum.PROVINCIA, provincia);
		}
		if (!citta.equals("")) {
			mappaFiltro.put(CampoSchedaDiRicercaEnum.CITTA, citta);
		}
		if (!zona.equals("")) {
			mappaFiltro.put(CampoSchedaDiRicercaEnum.ZONA, zona);
		}
		if (fasciaPrezzo != 0) {
			mappaFiltro.put(CampoSchedaDiRicercaEnum.FASCIA_PREZZO,
					fasciaPrezzo);
		}
		if (fasciaMQ != 0) {
			mappaFiltro.put(CampoSchedaDiRicercaEnum.FASCIA_MQ, fasciaMQ);
		}
		if (!tipologia.toLowerCase().equals("tutte")) {
			mappaFiltro.put(CampoSchedaDiRicercaEnum.TIPOLOGIA, tipologia);
		}
		if (!subTipologia.toLowerCase().equals("tutte")) {
			mappaFiltro
					.put(CampoSchedaDiRicercaEnum.SUBTIPOLOGIA, subTipologia);
		}
		SchedaDiRicerca scheda = new SchedaDiRicerca(mappaFiltro);
		ImmobileDAO dao = new ImmobileDAO();
		try {
			immobili = dao.visualizzaImmobili(scheda);
			if (immobili.isEmpty()) {
				addActionMessage("Nessun elemento corrisponde ai criteri di ricerca");
			}
		} catch (ClassNotFoundException | SQLException e) {
			addActionError("Qualcosa è andato storto, riprova");
			e.printStackTrace();
			return ERROR;
		}

		return SUCCESS;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public int getFasciaPrezzo() {
		return fasciaPrezzo;
	}

	public void setFasciaPrezzo(int fasciaPrezzo) {
		this.fasciaPrezzo = fasciaPrezzo;
	}

	public int getFasciaMQ() {
		return fasciaMQ;
	}

	public void setFasciaMQ(int fasciaMQ) {
		this.fasciaMQ = fasciaMQ;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getSubTipologia() {
		return subTipologia;
	}

	public void setSubTipologia(String subTipologia) {
		this.subTipologia = subTipologia;
	}

	public List<Immobile> getImmobili() {
		return immobili;
	}

	public void setImmobili(List<Immobile> immobili) {
		this.immobili = immobili;
	}

}
