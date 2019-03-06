package com.FPL.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FPL.dao.UtilisateurRepository;
import com.FPL.entities.utilisateur;
import com.FPL.service.AccountService;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false" )

public class UtilisateurController {
	
	@Autowired
	UtilisateurRepository utilisateurRepository; 
	
	@Autowired
	AccountService accountService;
	
	@PostMapping("/register")
	public utilisateur register(@RequestBody UserForm userForm) {
		
		return accountService.saveUser(userForm.getUsername(), userForm.getPassword(), userForm.getConfirmedPassword(),userForm.getE_mail(),userForm.getLastname());
		
	}
	

	//Methode findAll
		@GetMapping("/AllUser")
		public List<utilisateur> FindAllUser() {
	       return utilisateurRepository.findAll();
	       
	    }
		//Methode findByid
	   @GetMapping("/AppUser/{id}")
		public Optional<utilisateur> FindAllUserById(@PathVariable("id") long id) {
	       return utilisateurRepository.findById(id); 
	}
	
	
	
	static class UserForm{
		private String username;
		private String password;
		private String confirmedPassword;
		private String e_mail;
		private String lastname;
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
		public String getConfirmedPassword() {
			return confirmedPassword;
		}
		public void setConfirmedPassword(String confirmedPassword) {
			this.confirmedPassword = confirmedPassword;
		}
		
		public String getE_mail() {
			return e_mail;
		}
		public void setE_mail(String e_mail) {
			this.e_mail = e_mail;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public UserForm() {
			super();
			// TODO Auto-generated constructor stub
		}
		public UserForm(String username, String password, String confirmedPassword, String e_mail, String lastname) {
			super();
			this.username = username;
			this.password = password;
			this.confirmedPassword = confirmedPassword;
			this.e_mail = e_mail;
			this.lastname = lastname;
		}
		
		
	}

}
