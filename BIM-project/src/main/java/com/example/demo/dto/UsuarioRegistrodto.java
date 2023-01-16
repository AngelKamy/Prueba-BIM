package com.example.demo.dto;

public class UsuarioRegistrodto {
	private Long id;
	private String email;
	private String usuario;
	private String password;

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UsuarioRegistrodto(Long id, String email, String usuario, String password) {
		super();
		this.id = id;
		this.email = email;
		this.usuario = usuario;
		this.password = password;
	}

	public UsuarioRegistrodto(String email, String usuario, String password) {
		super();
		this.email = email;
		this.usuario = usuario;
		this.password = password;
	}

	public UsuarioRegistrodto(String email) {
		super();
		this.email = email;
	}

	public UsuarioRegistrodto() {
		super();
	}
}
