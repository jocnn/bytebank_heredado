package com.bytebank.heredado;

public class Administrador extends Funcionario implements Autenticable {
	private AutenticacionUtil util;

	public Administrador() {
		// composición de objetos, un objeto dentro de otro objeto
		this.util = new AutenticacionUtil();
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	@Override
	public double getBonificacion() {
			return this.getSalario();
	}

	@Override
	public boolean iniciarSession(String clave) {
		return this.util.iniciarSesion(clave);
	}
}
