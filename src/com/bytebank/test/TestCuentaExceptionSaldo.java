package com.bytebank.test;

import com.bytebank.Modelo.Cuenta;
import com.bytebank.Modelo.CuentaAhorro;
import com.bytebank.Modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorro(123, 456);
		cuenta.depositar(200);
		try {
			cuenta.retirar(210);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
