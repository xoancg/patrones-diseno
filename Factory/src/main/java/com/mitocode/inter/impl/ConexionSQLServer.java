package com.mitocode.inter.impl;

import com.mitocode.inter.IConexion;

public class ConexionSQLServer implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionSQLServer() {
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}

	// Sobreescribimos los métodos implementados en función de las necesidades de esta clase
	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conectó a SQLServer");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de SQLServer");
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPuerto() {
		return puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
