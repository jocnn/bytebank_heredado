package com.bytebank.heredado;

public class Funcionario {

    private String nombre;
    private String documento;
    private double salario;


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacion() {
        // muestra el 10% sobre el salario
        return this.salario * 0.1;
    }

}
