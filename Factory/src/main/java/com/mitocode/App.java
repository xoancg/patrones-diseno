package com.mitocode;

import com.mitocode.inter.IConexion;

public class App {

	public static void main(String[] args) {
		// Instanciamos la fábrica
		ConexionFabrica fabrica = new ConexionFabrica();

		// Utilizamos la misma fábrica pasando el motor de la BD por parámetro en todos los casos
		IConexion cx1 = fabrica.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();

		IConexion cx2 = fabrica.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();

		// No está definido ningún motor H2 en la fábrica > Devolverá mensaje de conexión vacía
		IConexion cx3 = fabrica.getConexion("H2");
		cx3.conectar();
		cx3.desconectar();

		IConexion cx4 = fabrica.getConexion("POSTGRE");
		cx4.conectar();
		cx4.desconectar();

		IConexion cx5 = fabrica.getConexion("SQL");
		cx5.conectar();
		cx5.desconectar();
	}
}

//https://www.tutorialspoint.com/design_pattern/factory_pattern.htm