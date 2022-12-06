package com.bytebank.heredado;

public class Funcionario {

    private String nombre;
    private String documentoIdentidad;
    private double salario;
    private int tipo;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return this.documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documento) {
        this.documentoIdentidad = documento;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getBonificacion() {
        // muestra el 10% sobre el salario
        // tipo = 1, gerente
        // tipo = 0, funcionario

        if (this.tipo == 0) {
            return this.salario * 0.1;
        } else if (this.tipo == 1) {
            return this.salario;
        } else {
            return 0;
        }
    }

}
