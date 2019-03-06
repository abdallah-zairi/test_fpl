package com.FPL.entities;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class message {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ID_message;
	
	@Column(name="text_message")
	private String text_message;
	
	@ManyToOne
	@JoinColumn(name="Id_utilisateur")
	private utilisateur utilisateur;

	public message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public message(Long iD_message, String text_message, utilisateur utilisateur) {
		super();
		ID_message = iD_message;
		this.text_message = text_message;
		this.utilisateur = utilisateur;
		
	}
	

	
	public Long getID_message() {
		return ID_message;
	}

	public void setID_message(Long iD_message) {
		ID_message = iD_message;
	}

	public String getText_message() {
		return text_message;
	}

	public void setText_message(String text_message) {
		this.text_message = text_message;
	}

	public utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	

}
