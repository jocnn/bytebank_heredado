package com.bytebank.heredado;

public class Administrador extends Funcionario implements Autenticable {
	private String clave;

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	@Override
	public double getBonificacion() {
			return 0;
	}

	@Override
	public boolean iniciarSession(String clave) {
		if (this.clave == clave) {
			return true;
		} else {
			return false;
		}
	}
}
