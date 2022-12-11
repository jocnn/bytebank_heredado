package com.bytebank.heredado;

public interface Autenticable {

	public void setClave(String clave);

	public boolean iniciarSession(String clave);
}
