package com.mitocode.inter.impl;

import com.mitocode.inter.IConexion;

public class ConexionOracle implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	// Parámetros de conexión a la BD
	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	// Sobreescribimos los métodos implementados en función de las necesidades de esta clase
	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conectó a Oracle");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de Oracle");
	}

	@Override
	public String toString() {
		return "ConexionOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
