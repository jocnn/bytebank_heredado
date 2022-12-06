package com.bytebank.heredado;

public class TestFuncionario {
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("Diego");
		funcionario.setDocumentoIdentidad("349857349");
		funcionario.setSalario(2000);

		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnLine");

		System.out.println("Funcionario salario: " + funcionario.getSalario());
		System.out.println("Funcionario bonificación: " + funcionario.getBonificacion());
	
		System.out.println("Gerente salario: " + gerente.getSalario());
		System.out.println("Gerente bonificación: " + gerente.getBonificacion());
		System.out.println("Gerente inicio sesión: " + gerente.iniciarSession("AluraCursosOnLine"));
	
	}
}
