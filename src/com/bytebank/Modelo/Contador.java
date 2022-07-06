package com.bytebank.Modelo;

/**
 * Clase que representa un contador de Bytebank 
 * @author diego
 *
 */

public class Contador extends Funcionario {

		public double getBonificaion() {
			System.out.println("Ejecutado desde contador");
			return 200;
		}
}
