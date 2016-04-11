package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.DAO.ImmobileDAO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Classe action che implementa la funzionalità della creazione di un immobile.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class CreaImmobileAction extends ActionSupport implements
		ServletRequestAware {
	/** Provincia di appartenenza dell'immobile */
	private String provincia;
	/** Città di appartenenza dell'immobile */
	private String citta;
	/** Zona di appartenenza dell'immobile */
	private String zona;
	/** Numero di camere presenti all'interno dell'immobile */
	private int camere;
	/** Numero di bagni presenti all'interno dell'immobile */
	private int bagni;
	/** Tipologia dell'immobile */
	private String tipologia;
	/** Sub tipologia dell'immobile */
	private String subTipologia;
	/** Prezzo di vendita dell'immobile */
	private double prezzo;
	/** Numero di mq dell'immobile */
	private int mq;
	/** Descrizione dell'immobile */
	private String descrizione;
	/** Foto associata all'immobile */
	private File foto;
	/** Formato della foto */
	private String fotoContentType;
	/** Nome della foto */
	private String fotoFileName;
	/** Necessaria per salvare la foto all'interno dell'applicazione */
	private HttpServletRequest servletRequest;

	/** Crea l'immobile all'interno dell'applicazione dati i parametri passati. */
	@Override
	public String execute() {
		ImmobileDAO dao = new ImmobileDAO();
		int ultimoId;
		String defaultPath = "/img/immobili/";
		try {
			Immobile immobile = new Immobile(provincia, citta, zona, camere,
					bagni, tipologia, subTipologia, prezzo, mq, descrizione, "");
			dao.creaImmobile(immobile);
			ultimoId = dao.ultimoId();

			fotoFileName = "1"
					+ fotoFileName.substring(fotoFileName.indexOf("."));
			String fotoPath = defaultPath + ultimoId + "/";
			String filePath = servletRequest.getSession().getServletContext()
					.getRealPath(fotoPath);

			File fileToCreate = new File(filePath, fotoFileName);
			FileUtils.copyFile(foto, fileToCreate);
			fotoPath = defaultPath + ultimoId + "/" + fotoFileName;
			immobile.setFoto(fotoPath);
			dao.modificaImmobile(ultimoId, immobile);
		} catch (Exception e) {
			e.printStackTrace();
			addActionError("Qualcosa è andato storto");
			return ERROR;
		}
		addActionMessage("Immobile creato con successo");
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

	public int getMQ() {
		return mq;
	}

	public void setMQ(int mq) {
		this.mq = mq;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public File getFoto() {
		return foto;
	}

	public void setFoto(File foto) {
		this.foto = foto;
	}

	public String getFotoContentType() {
		return fotoContentType;
	}

	public void setFotoContentType(String fotoContentType) {
		this.fotoContentType = fotoContentType;
	}

	public String getFotoFileName() {
		return fotoFileName;
	}

	public void setFotoFileName(String fotoFileName) {
		this.fotoFileName = fotoFileName;
	}

	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

}
