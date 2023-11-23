package br.edu.ifrn.peoo.relacionamentos.empresa;

import java.util.Scanner;

/* Qual é o tipo de relacionamento apresentado entre as classes presentes no diagrama e a multiplicidade?
 *
 * Relacionamento: Composição.
 *
 * Multiplicidade: Entre as classes Funcionario e Dependente: Um e somente um.
 *                 Entre as classes Dependente e Funcionário: Um e somente um. */
public class Teste {

    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        Dependente objDependente = new Dependente();
        System.out.print("Nome do Dependente: ");
        objDependente.setNome(objScanner.nextLine());
        System.out.print("Idade do Dependente: ");
        objDependente.setIdade(objScanner.nextInt());
        objScanner.nextLine();

        System.out.print("\nNome do Funcionário: ");
        String nome = objScanner.nextLine();
        System.out.print("Matrícula do Funcionário: ");
        String matricula = objScanner.nextLine();
        System.out.print("Salário do Funcionário: ");
        double salario = objScanner.nextDouble();
        Funcionario objFuncionario = new Funcionario(nome, matricula, salario, objDependente);

        objDependente.setFuncionario(objFuncionario);

        System.out.println("\nNome do Funcionário: " + objFuncionario.getNome());
        System.out.println("Matrícula do Funcionário: " + objFuncionario.getMatricula());
        System.out.println("Salário do Funcionário: R$" + objFuncionario.getSalario());
        System.out.println("Dependente(s) do Funcionário: " + objFuncionario.getDependente());
    }

}
