package com.bytebank.heredado;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("Diego");
		funcionario.setTipo(0);
		funcionario.setDocumentoIdentidad("349857349");
		funcionario.setSalario(2000);

		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnLine");
		gerente.setTipo(1);

		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacion());
	
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSession("AluraCursosOnLine"));
	
	}
}
