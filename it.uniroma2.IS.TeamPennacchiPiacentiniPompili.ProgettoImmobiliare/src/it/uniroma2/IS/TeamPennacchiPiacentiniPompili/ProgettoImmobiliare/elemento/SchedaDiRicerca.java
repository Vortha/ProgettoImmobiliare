package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.enumClass.CampoSchedaDiRicercaEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe che rappresenta una scheda di ricerca all'interno dell'applicazione.
 * Tra gli attributi è stata definita una mappa che viene modificata tramite i
 * set degli altri attributi: quando viene effettuato un set, si aggiunge la
 * coppia <chiave, valore> all'interno della mappa, dove la chiave è l'enum
 * associato all'attributo.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class SchedaDiRicerca {
	/** Provincia di appartenenza dell'immobile cercato **/
	private String provincia;
	/** Città di appartenenza dell'immobile cercato **/
	private String citta;
	/** Zona di appartenenza dell'immobile cercato **/
	private String zona;
	/** Fascia di prezzo dell'immobile cercato **/
	private int fasciaPrezzo;
	/** Fascia di mq dell'immobile cercato **/
	private int fasciaMQ;
	/** Tipologia dell'immobile cercato **/
	private String tipologia;
	/** Sub tipologia dell'immobile cercato **/
	private String subTipologia;
	/** Mappa contenente gli attributi di una scheda di ricerca **/
	private Map<CampoSchedaDiRicercaEnum, String> mappaFiltro;
	
	public SchedaDiRicerca() {
		mappaFiltro = new HashMap<CampoSchedaDiRicercaEnum, String>();
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
		mappaFiltro.put(CampoSchedaDiRicercaEnum.PROVINCIA, provincia);
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
		mappaFiltro.put(CampoSchedaDiRicercaEnum.CITTA, citta);
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
		mappaFiltro.put(CampoSchedaDiRicercaEnum.ZONA, zona);
	}

	public int getFasciaPrezzo() {
		return fasciaPrezzo;
	}

	public void setFasciaPrezzo(int fasciaPrezzo) {
		this.fasciaPrezzo = fasciaPrezzo;
		mappaFiltro.put(CampoSchedaDiRicercaEnum.FASCIAPREZZO,
				Integer.toString(fasciaPrezzo));
	}

	public int getFasciaMQ() {
		return fasciaMQ;
	}

	public void setFasciaMQ(int fasciaMQ) {
		this.fasciaMQ = fasciaMQ;
		mappaFiltro.put(CampoSchedaDiRicercaEnum.FASCIAMQ,
				Integer.toString(fasciaMQ));
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
		mappaFiltro.put(CampoSchedaDiRicercaEnum.TIPOLOGIA, tipologia);
	}

	public String getSubTipologia() {
		return subTipologia;
	}

	public void setSubTipologia(String subTipologia) {
		this.subTipologia = subTipologia;
		mappaFiltro.put(CampoSchedaDiRicercaEnum.SUBTIPOLOGIA, subTipologia);
	}

	public Map<CampoSchedaDiRicercaEnum, String> getMappaFiltro() {
		return mappaFiltro;
	}

	public void setMappaFiltro(Map<CampoSchedaDiRicercaEnum, String> mappaFiltro) {
		this.mappaFiltro = mappaFiltro;
	}
}
