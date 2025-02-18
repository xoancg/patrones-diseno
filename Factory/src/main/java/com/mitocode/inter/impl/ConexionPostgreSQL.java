package com.mitocode.inter.impl;

import com.mitocode.inter.IConexion;

public class ConexionPostgreSQL implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionPostgreSQL() {
		this.host = "localhost";
		this.puerto = "5433";
		this.usuario = "postgres";
		this.contrasena = "123";
	}

	// Sobreescribimos los métodos implementados en función de las necesidades de esta clase
	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conectó a PostgreSQL");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de PostgreSQL");
	}

	@Override
	public String toString() {
		return "ConexionPostgreSQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
