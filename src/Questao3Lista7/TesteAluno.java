package Questao3Lista7;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double nota1,nota2;
        int matricula;
        String nome;


        System.out.println("Digite o número da mátricula do aluno:");
        matricula = ler.nextInt();

        System.out.println("Digite o nome do aluno");
        nome = ler.next();

        System.out.printf("Digite a primeira nota do aluno %s\n", nome);
        nota1= ler.nextDouble();

        System.out.printf("Digite a segunda nota do aluno %s\n", nome);
        nota2= ler.nextDouble();

        Aluno aluno = new Aluno(matricula,nome,nota1,nota2);

        System.out.println(aluno);
    }
}
