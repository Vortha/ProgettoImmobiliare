package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento;

/**
 * Classe che rappresenta un immobile all'interno dell'applicazione.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class Immobile {
	/** identificativo dell'immobile **/
	private int idImmobile;
	/** Provincia di appartenenza dell'immobile **/
	private String provincia;
	/** Città di appartenenza dell'immobile **/
	private String citta;
	/** Zona di appartenenza dell'immobile **/
	private String zona;
	/** Numero di camere presenti all'interno dell'immobile **/
	private int camere;
	/** Numero di bagni presenti all'interno dell'immobile **/
	private int bagni;
	/** Tipologia dell'immobile **/
	private String tipologia;
	/** Sub tipologia dell'immobile **/
	private String subTipologia;
	/** Prezzo di vendita dell'immobile **/
	private double prezzo;
	/** Numero di mq dell'immobile **/
	private int mq;
	/** Descrizione dell'immobile **/
	private String descrizione;
	/** Path della cartella contenente le immagini dell'immobile **/
	private String fotoPath;

	public Immobile(int idImmobile, String provincia, String citta,
			String zona, int camere, int bagni, String tipologia,
			String subTipologia, double prezzo, int mq, String descrizione,
			String fotoPath) {
		this.idImmobile = idImmobile;
		this.provincia = provincia;
		this.citta = citta;
		this.zona = zona;
		this.camere = camere;
		this.bagni = bagni;
		this.tipologia = tipologia;
		this.subTipologia = subTipologia;
		this.prezzo = prezzo;
		this.mq = mq;
		this.descrizione = descrizione;
		this.fotoPath = fotoPath;
	}

	public int getIdImmobile() {
		return idImmobile;
	}
	
	public void setIdImmobile(int idImmobile) {
		this.idImmobile = idImmobile;
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

	public int getCamere() {
		return camere;
	}

	public void setCamere(int camere) {
		this.camere = camere;
	}

	public int getBagni() {
		return bagni;
	}

	public void setBagni(int bagni) {
		this.bagni = bagni;
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

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getMq() {
		return mq;
	}

	public void setMq(int mq) {
		this.mq = mq;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getfotoPath() {
		return fotoPath;
	}

	public void setfotoPath(String fotoPath) {
		this.fotoPath = fotoPath;
	}

	@Override
	public String toString() {
		return "Immobile [idImmobile=" + idImmobile + ", provincia="
				+ provincia + ", citta=" + citta + ", zona=" + zona
				+ ", camere=" + camere + ", bagni=" + bagni + ", tipologia="
				+ tipologia + ", subTipologia=" + subTipologia + ", prezzo="
				+ prezzo + ", mq=" + mq + ", descrizione=" + descrizione
				+ ", fotoPath=" + fotoPath + "]";
	}

}
