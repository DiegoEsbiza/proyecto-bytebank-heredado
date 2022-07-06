package com.bytebank.test;

import com.bytebank.Modelo.Funcionario;
import com.bytebank.Modelo.Contador;


public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("36426808");
		diego.setSalario(2000);
		diego.setTipo(0);

		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificaion());
	}

}
