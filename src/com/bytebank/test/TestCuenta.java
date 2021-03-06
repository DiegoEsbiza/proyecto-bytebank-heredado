package com.bytebank.test;

import com.bytebank.Modelo.CuentaAhorro;
import com.bytebank.Modelo.CuentaCorriente;

public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorro ca = new CuentaAhorro(2, 3);
		
		cc.depositar(2000);
		cc.transferir(1000, ca);
		
		System.out.println(cc.obtenerSaldo());
		System.out.println(ca.obtenerSaldo());
	
	}
}
