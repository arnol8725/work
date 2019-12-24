package com.appdeveloperblog.app.ws.MobileAppWebApplication.entity;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class User implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull(message ="id no null")
	public Integer idUser ;
	@NotNull(message ="name cannot be null")
	public String  nameUser ;
	@NotNull(message ="email cannot be null")
	public String  emailUser ;
	
	
	
	public User() {
		
	}

	public User(Integer idUser, String nameUser, String emailUser) {
		super();
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.emailUser = emailUser;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nameUser=" + nameUser + ", emailUser=" + emailUser + "]";
	}

	
	
	
	
	
}
