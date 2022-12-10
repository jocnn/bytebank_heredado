package com.bytebank.heredado;

public class CuentaAhorro extends Cuenta {

	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public CuentaAhorro(int agencia, int numero) {
		super(agencia, numero);
	}
}
