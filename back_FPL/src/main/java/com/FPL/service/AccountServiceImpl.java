package com.FPL.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.FPL.dao.UtilisateurRepository;
import com.FPL.entities.utilisateur;



@Service
@Transactional
public class AccountServiceImpl {
	@Autowired
	 UtilisateurRepository utilisateurRepositroy ;
	
	
	
	public utilisateur  saveUser(String username, String password, String confirmedPassword, String e_mail, String lastname) {
		utilisateur  user=utilisateurRepositroy.findByUsername(username) ;
			if(user!=null) throw new RuntimeException("Already exist");
			if(!password.equals(confirmedPassword)) throw new RuntimeException("Please confirm your password");
		utilisateur appuser=new utilisateur();
		appuser.setUsername(username);
		appuser.setPassword(password);
		appuser.setActived(true);
		appuser.setE_mail(e_mail);
		appuser.setLastname(lastname);
		utilisateurRepositroy.save(appuser);
		
		return appuser;
	}
	
	
	
	public utilisateur loadUserByUsername(String username) {
		return utilisateurRepositroy.findByUsername(username);
		 
	}
	

}
