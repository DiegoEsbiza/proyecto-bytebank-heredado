package com.bytebank.test;

import java.awt.SystemColor;

import com.bytebank.Modelo.CuentaAhorro;

public class TestString {

	public static void main(String[] args) {

		String nombre = "Alura";
		
		char letra = nombre.charAt(3);
		int indice = nombre.indexOf("e");

		Object cuenta = new CuentaAhorro(344, 544);
		
		printLine(nombre);
		printLine(letra);
		printLine(indice);
		printLine(new CuentaAhorro(200, 300));
		
	}

	private static void printLine(Object valor) {
		System.out.println(valor.toString());
		
	}

}
