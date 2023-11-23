package br.edu.ifrn.peoo.relacionamentos.empresa;

public class Dependente {

    private String nome;
    private int idade;
    private Funcionario funcionario;

    public Dependente() {
    }

    public Dependente(String nome, int idade, Funcionario func) {
        this.nome = nome;
        this.idade = idade;
        this.funcionario = func;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int salario) {
        this.idade = salario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return String.format("Dependente - Nome: %s, Idade: %d", nome, idade);
    }

}
