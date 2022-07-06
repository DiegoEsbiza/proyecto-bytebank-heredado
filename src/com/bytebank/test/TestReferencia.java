package com.bytebank.test;

import com.bytebank.Modelo.Funcionario;
import com.bytebank.Modelo.Contador;
import com.bytebank.Modelo.Gerente;



public class TestReferencia {
	public static void main(String[] args) {
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
	}

}
