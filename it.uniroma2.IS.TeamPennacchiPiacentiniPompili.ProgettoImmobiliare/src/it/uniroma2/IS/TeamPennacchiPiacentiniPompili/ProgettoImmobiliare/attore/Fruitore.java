package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore;

/**
 * Superclasse che rappresenta il profilo generico di una persona all'interno
 * dell'applicazione.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class Fruitore {
	/** Nome del fruitore **/
	private String nome;
	/** Cognome del fruitore **/
	private String cognome;
	/** Numero di telefono del fruitore **/
	private String telefono;
	/** Email del fruitore **/
	private String email;
	/** Password del fruitore **/
	private String password;
	/** Condizione di eliminazione account **/
	private boolean eliminato;
	/** Data di eliminazione **/
	private Date dataEliminazione;

	public Fruitore(String nome, String cognome, String telefono, String email, String password, boolean eliminato,
			Date dataEliminazione) {
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.email = email;
		this.password = password;
		this.eliminato = eliminato;
		this.dataEliminazione = dataEliminazione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "Fruitore [nome=" + nome + ", cognome=" + cognome + ", telefono=" + telefono + ", email=" + email
				+ ", password=" + password + ", eliminato=" + eliminato + ", data eliminazione=" + dataEliminazione;
	}

}
