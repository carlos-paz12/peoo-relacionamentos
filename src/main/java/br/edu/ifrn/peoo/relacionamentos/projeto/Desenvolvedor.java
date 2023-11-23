package br.edu.ifrn.peoo.relacionamentos.projeto;

public class Desenvolvedor {

    private String nome;
    private double salario;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Desenvolvedor [nome = " + nome + ", salario = " + salario + "]";
    }

}
