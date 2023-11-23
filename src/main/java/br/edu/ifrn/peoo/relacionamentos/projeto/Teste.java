package br.edu.ifrn.peoo.relacionamentos.projeto;

import java.util.ArrayList;

/* Qual é o tipo de relacionamento apresentado entre as classes presentes no diagrama e a multiplicidade?
 *
 * Relacionamento: Agregação
 *
 * Multiplicidade: 0..* - No mínimo zero e no máximo muitos. */
public class Teste {

    public static void main(String[] args) {

        Projeto federalBioLife = new Projeto(405, "Federal Bio Life");
        Desenvolvedor Peter = new Desenvolvedor("Peter", 4000);

        federalBioLife.adicionar(Peter);

        ArrayList<Desenvolvedor> desenvolvedor = federalBioLife.getDesenvolvedores();

        System.out.println(Peter);

        Projeto um = new Projeto(404, "Federal BioLife");

        System.out.println("Projeto [nome = " + um.getNome() + ", código = " + um.getCodigo() + "]");

    }

}
