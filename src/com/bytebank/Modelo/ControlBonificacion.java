package com.bytebank.Modelo;
public class ControlBonificacion {

	private double suma;

	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificaion() + this.suma;
		System.out.println("Calculo actual:" + this.suma);
		return this.suma;
	}

}
