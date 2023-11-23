package br.edu.ifrn.peoo.relacionamentos.empresa;

public class Funcionario {

    private String nome;
    private String matricula;
    private double salario;
    private Dependente dependente;

    public Funcionario(String nome, String matricula, double salario, Dependente dep) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dependente = dep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double codigo) {
        this.salario = codigo;
    }

    public Dependente getDependente() {
        return dependente;
    }

    @Override
    public String toString() {
        return String.format("Funcionário - Nome: %s, Matrícula: %s, Salário: R$%.1f", nome, matricula, salario);
    }

}
