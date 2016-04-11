package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore;

import java.sql.Date;

/**
 * Classe che rappresenta il cliente connesso all'applicazione.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class Cliente extends Fruitore {
	/** Rappresenta l'agente assegnato al cliente */
	private String agenteAssegnato;
	/**
	 * Booleano che rappresenta se un Cliente è in stato di eliminazione
	 * dall'applicazione
	 */
	private boolean eliminato;
	/** Rappresenta la data di eliminazione */
	private Date dataEliminazione;

	public Cliente(String nome, String cognome, String telefono, String email,
			String password) {
		super(nome, cognome, telefono, email, password);
	}

	public Cliente(String nome, String cognome, String telefono, String email,
			String password, boolean eliminato, Date dataEliminazione) {
		super(nome, cognome, telefono, email, password);
		this.eliminato = eliminato;
		this.dataEliminazione = dataEliminazione;
	}

	public Cliente(String nome, String cognome, String telefono, String email,
			String password, String agenteAssegnato, boolean eliminato, Date dataEliminazione) {
		super(nome, cognome, telefono, email, password);
		this.agenteAssegnato = agenteAssegnato;
		this.eliminato = eliminato;
		this.dataEliminazione = dataEliminazione;
	}
	
	public String getAgenteAssegnato() {
		return agenteAssegnato;
	}
	
	public void setAgenteAssegnato(String agenteAssegnato) {
		this.agenteAssegnato = agenteAssegnato;
	}
	
	public boolean isEliminato() {
		return eliminato;
	}

	public void setEliminato(boolean eliminato) {
		this.eliminato = eliminato;
	}

	public Date getDataEliminazione() {
		return dataEliminazione;
	}

	public void setDataEliminazione(Date dataEliminazione) {
		this.dataEliminazione = dataEliminazione;
	}

	@Override
	public String toString() {
		return super.toString() + ", eliminato=" + eliminato + ", dataEliminazione="
				+ dataEliminazione + "]";
	}

}
