package com.bytebank.heredado;

public class Gerente extends Funcionario {
	
	private String clave;

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarSession(String clave) {
		if (this.clave == clave) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacion() {
		System.out.println("Llamando método del Gerente");
		return super.getBonificacion() + super.getSalario();
	}

}
