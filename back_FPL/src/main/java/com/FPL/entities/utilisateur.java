package com.FPL.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class utilisateur {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ID_utilisateur;
	@Column(unique=true)
	private String username;
	@JsonProperty(access=Access.WRITE_ONLY)
	private String password;
	private boolean actived;
	@Column(name="Lastname")
	private String Lastname;
	@Column(name="E_mail")
	private String E_mail;
	@OneToMany(mappedBy = "utilisateur",fetch=FetchType.LAZY)
	private List<message> messages;
	
	
	public utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public utilisateur(Long iD_utilisateur, String username, String password, boolean actived, String lastname,
			String e_mail, List<message> messages) {
		super();
		ID_utilisateur = iD_utilisateur;
		this.username = username;
		this.password = password;
		this.actived = actived;
		Lastname = lastname;
		E_mail = e_mail;
		this.messages = messages;
		
	}


	


	public Long getID_utilisateur() {
		return ID_utilisateur;
	}


	public void setID_utilisateur(Long iD_utilisateur) {
		ID_utilisateur = iD_utilisateur;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActived() {
		return actived;
	}


	public void setActived(boolean actived) {
		this.actived = actived;
	}


	public String getLastname() {
		return Lastname;
	}


	public void setLastname(String lastname) {
		Lastname = lastname;
	}


	public String getE_mail() {
		return E_mail;
	}


	public void setE_mail(String e_mail) {
		E_mail = e_mail;
	}


	public List<message> getMessages() {
		return messages;
	}


	public void setMessages(List<message> messages) {
		this.messages = messages;
	}
	
	
	
	
	

}
