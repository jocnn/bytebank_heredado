package com.bytebank.heredado;

public class SistemaInterno {
	private String clave = "AluraCursosOnline";

	public boolean autentica(Autenticable autenticable) {
		boolean puedeIniciarSesion = autenticable.iniciarSession(this.clave);

		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
	}
}
