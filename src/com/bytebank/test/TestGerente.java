package com.bytebank.test;

import com.bytebank.Modelo.Gerente;

public class TestGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();

		gerente.setSalario(6000);
		gerente.setClave("ClaveDelGerente");
		gerente.setTipo(1);
		gerente.setNombre("Roberto");

		System.out.println(gerente.iniciarSesion("ClaveDelGerente"));
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificaion());

	}

}
