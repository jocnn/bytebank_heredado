package com.bytebank.heredado;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Diego");
		funcionario.setSalario(2000);

		Funcionario gerente = new Gerente();
		gerente.setNombre("Jimena");
		gerente.setSalario(10000);

		Funcionario contador = new Contador();
		contador.setNombre("Pedro");
		contador.setSalario(5000);

		ControlBonificacion controlBonificacion = new ControlBonificacion();

		controlBonificacion.registrarSalario(funcionario);
		controlBonificacion.registrarSalario(gerente);
		controlBonificacion.registrarSalario(contador);

	}
}
