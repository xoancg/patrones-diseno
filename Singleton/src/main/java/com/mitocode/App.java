package com.mitocode;

import com.mitocode.model.Conexion;

public class App {

	public static void main(String[] args) {
		//Instanciación por constructor prohíbido por ser "private"
		//Conexion c = new Conexion();
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();

		// Control para ver que lo que se está retornando es un objeto de la clase Conexion (true en caso afirmativo)
		boolean ctrlInstanceOf = c instanceof Conexion;
		System.out.println(ctrlInstanceOf);
	}
	
	//Otro ejemplo en: https://www.youtube.com/watch?v=qiFeiYLzIH8
	//Spring Framework gestiona sus beans como Singleton por defecto
}
//https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm