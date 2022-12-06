package com.bytebank.heredado;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setNombre("Diego");
		diego.setDocumento("349857349");
		diego.setSalario(2000);

		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
