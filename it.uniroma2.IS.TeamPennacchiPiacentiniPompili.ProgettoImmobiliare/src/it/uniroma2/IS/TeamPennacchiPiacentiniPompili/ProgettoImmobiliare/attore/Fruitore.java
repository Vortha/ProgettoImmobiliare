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

	public Fruitore(String nome, String cognome, String telefono, String email,
			String password) {
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
