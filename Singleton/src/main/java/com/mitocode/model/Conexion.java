package com.mitocode.model;

public class Conexion {
	
	//Declaración
	private static Conexion instancia;
	//private static Conexion instancia = new Conexion();
	
	//Private para evitar instancia mediante operador "new"
	private Conexion() {
		
	}
	
	//Para obtener la instancia unicamente por este metodo
	//Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
	public static Conexion getInstancia() { // Método de clase
		// Si no existe la instancia, la crea
		if(instancia == null) {
			instancia = new Conexion();
		}
		// Devuelve la instancia existente o, en su defecto, la que acabamos de crear
		return instancia;
	}
	
	//Método de prueba
	public void conectar() {
		System.out.println("Me conecté a la BD");
	}
	
	//Método de prueba
	public void desconectar() {
		System.out.println("Me desconecté de la BD");
	}

}
