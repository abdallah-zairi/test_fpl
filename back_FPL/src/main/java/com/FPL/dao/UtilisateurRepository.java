package com.FPL.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FPL.entities.utilisateur;



public interface UtilisateurRepository  extends JpaRepository<utilisateur, Long> {
	
	utilisateur findByUsername(String username);
	
	

}
