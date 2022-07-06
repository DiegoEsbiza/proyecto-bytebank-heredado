package com.bytebank.test;

import com.bytebank.Modelo.Administrador;
import com.bytebank.Modelo.SistemaInterno;
import com.bytebank.Modelo.Gerente;



public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.Autenticacion(gerente1);
		sistema.Autenticacion(admin);
		
		
	}
}
