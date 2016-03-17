package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore;

/**
 * Classe che rappresenta un generico Utente all'interno dell'applicazione.
 * 
 * @author Team Pennacchi Piacentini Pompili
 * 
 */
public class Utente {
	/** nome dell'utente che si vuole registrare **/
	String nome;
	/** cognome dell'utente che si vuole registrare **/
	String cognome;
	/** numero di telefono dell'utente che si vuole registrare **/
	String telefono;
	/** email dell'utente che si vuole registrare **/
	String email;
	/** password dell'utente che si vuole registrare **/
	String password;

	public Utente(String nome, String cognome, String telefono, String email,
			String password) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.email = email;
		this.password = password;
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
}
