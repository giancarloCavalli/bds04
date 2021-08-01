package com.devsuperior.bds04.dto;

import javax.validation.constraints.Email;

public class UserDTO {
	
	private Long id;
	
	@Email(message = "Email inválido")
	private String email;
	private String password;
	
	public UserDTO() {
	}

	public UserDTO(Long id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
