package com.bytebank.heredado;

public class Gerente extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;

	public Gerente() {
		this.util = new AutenticacionUtil();
	}

	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	public boolean iniciarSession(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public double getBonificacion() {
		System.out.println("Llamando método del Gerente");
		return super.getSalario() + this.getSalario() * 0.05;
	}

}
