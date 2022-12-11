package com.bytebank.heredado;

public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente = new Gerente();
		gerente.setClave("AluraCursosOnline");
		Administrador administrador = new Administrador();
		administrador.setClave("AluraCursosOnline");

		sistema.autentica(gerente);
		sistema.autentica(administrador);
	}
}
