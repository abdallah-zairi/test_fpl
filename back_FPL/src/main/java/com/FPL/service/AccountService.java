package com.FPL.service;

import com.FPL.entities.utilisateur;


public interface AccountService {
	
	public utilisateur saveUser(String username, String password, String confirmedPassword, String e_mail,String lastname);
	public utilisateur loadUserByUsername(String username);
	
}
