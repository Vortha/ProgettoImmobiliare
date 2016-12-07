package it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.attore.cliente.DAO.ClienteDAO;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.Immobile;
import it.uniroma2.IS.TeamPennacchiPiacentiniPompili.ProgettoImmobiliare.elemento.immobile.DAO.ImmobileDAO;

import com.opensymphony.xwork2.ActionSupport;

public class VisualizzaPreferitiAction extends ActionSupport {
	private String email;
	private Map<String, List<Immobile>> preferiti;
	
	@Override
	public String execute() {
		ImmobileDAO dao = new ImmobileDAO();
		ClienteDAO clienteDAO = new ClienteDAO();
		preferiti = new HashMap<String, List<Immobile>>();

		try {
			preferiti.put("propertyList", dao.visualizzaPreferiti(clienteDAO.ottieniCliente(email)));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return ERROR;
		}
		
		return SUCCESS;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Map<String, List<Immobile>> getPreferiti() {
		return preferiti;
	}
	
	public void setPreferiti(Map<String, List<Immobile>> preferiti) {
		this.preferiti = preferiti;
	}
}
