
public class SistemaInterno {

	private String clave = "12345";

	public boolean Autenticacion(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("¡Bienvenido al sistema!");
			return true;
		} else {
			System.out.println("Usuario o contraseña invalida, intente nuevamente");
			return false;

		}

	}

}
