package br.edu.ifrn.peoo.relacionamentos.projeto;

import java.util.ArrayList;

public class Projeto {

    private int codigo;
    private String nome;
    private ArrayList<Desenvolvedor> desenvolvedores;

    public Projeto() {
    }

    public Projeto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.desenvolvedores = new ArrayList<Desenvolvedor>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionar(Desenvolvedor desenvolvedor) {
        this.desenvolvedores.add(desenvolvedor);
    }

    public ArrayList<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }

}
