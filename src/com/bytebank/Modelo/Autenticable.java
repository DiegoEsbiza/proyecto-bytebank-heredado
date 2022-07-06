package com.bytebank.Modelo;
public interface Autenticable{

	public void setClave(String clave);

	public boolean iniciarSesion(String clave);

}
