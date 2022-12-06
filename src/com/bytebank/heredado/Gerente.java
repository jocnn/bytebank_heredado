package com.bytebank.heredado;

public class Gerente extends Funcionario {
	
	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarSession(String clave) {
		return clave == "AluraCursosOnLine";
	}

	public double getBonificacion() {
		return super.getBonificacion() + super.getSalario();
	}

}
