package com.mitocode.inter.impl;

import com.mitocode.inter.IConexion;

public class ConexionVacia implements IConexion{

	// Sobreescribimos los métodos implementados en función de las necesidades de esta clase
	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
	}

}
