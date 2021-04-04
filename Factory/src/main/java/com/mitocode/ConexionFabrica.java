package com.mitocode;

import com.mitocode.inter.IConexion;
import com.mitocode.inter.impl.ConexionMySQL;
import com.mitocode.inter.impl.ConexionOracle;
import com.mitocode.inter.impl.ConexionPostgreSQL;
import com.mitocode.inter.impl.ConexionSQLServer;
import com.mitocode.inter.impl.ConexionVacia;

// Esta clase es la fábrica
public class ConexionFabrica {
	// Método público que devuelve la interfaz Conexion de lo que pida el usuario
	public IConexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}
}
