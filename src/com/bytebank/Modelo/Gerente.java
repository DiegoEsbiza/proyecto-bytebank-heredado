package com.bytebank.Modelo;
public class Gerente extends Funcionario implements Autenticable {

	@Override
	public double getBonificaion() {
		System.out.println("Ejecutando test de gerente");
		return super.getSalario() + this.getSalario() * 0.05;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
