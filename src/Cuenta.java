//entidad Cuenta:
public abstract class Cuenta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total;
	
	public Cuenta() {
		
	}

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

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.retirar(valor);
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