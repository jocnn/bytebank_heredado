package com.bytebank.heredado;

public class TestReferencia {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		funcionario.setSalario(2000);

		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");

		System.out.println("Bonificacion funcionario: " + funcionario.getBonificacion());
	}
}
