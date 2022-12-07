package com.bytebank.heredado;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("Diego");
		funcionario.setSalario(2000);

		Funcionario gerente = new Gerente();
		gerente.setNombre("Jimena");
		gerente.setSalario(10000);

		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(funcionario);

		controlBonificacion.registrarSalario(gerente);

	}
}
