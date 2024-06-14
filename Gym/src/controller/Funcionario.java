package controller;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    private String DataContrato;
   
    public String getDataContrato() {
        return DataContrato;
    }
    public void setDataContrato(String dataContrato) {
        DataContrato = dataContrato;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
