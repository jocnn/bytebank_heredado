package com.bytebank.heredado;

public class ControlBonificacion {
	private double suma;

	public double getSuma() {
		return this.suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public double registrarSalario(Funcionario funcionario) {
		this.suma += funcionario.getBonificacion();
		System.out.println(this.suma);
		return this.suma;
	}
}
