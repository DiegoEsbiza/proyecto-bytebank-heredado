package com.bytebank.Modelo;

/**
 * Cuenta crea una nueva instancia de CuentaAhorro y CuentaCorriente  
 * 
 * @version 1.0
 * @author diego
 *
 */

public abstract class Cuenta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total;
	/**
	 * Instancia una nueva cuenta sin parametros
	 */

	public Cuenta() {
		
	}
	
	/**
	 * Instancia una cuenta utilizando como parametros agencia y número
	 * @param agencia
	 * @param numero
	 */

	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;

		if (agencia <= 0) {
			System.out.println("No se permite el valor 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Cuentas creadas hasta ahora: " + total + " cuentas");
	}

	// No retorna valor
	public abstract void depositar(double valor);
	
	/**
	 * Este metodo retira dinero de la cuenta y, si ocurriera un error, lanzara una excepción
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void retirar(double valor) throws SaldoInsuficienteException {
		if(this.saldo<valor) {
			throw new SaldoInsuficienteException("No posee fondos suficientes para realizar la operacion");
		}
		this.saldo -= valor;
	
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cuenta.depositar(valor);
			return true;
		}
		return false;

	}

	public double obtenerSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
}