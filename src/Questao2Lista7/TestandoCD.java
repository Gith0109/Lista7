package Questao2Lista7;

import java.util.Scanner;

public class TestandoCD {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número de músicas para o CD.CD");
        int numeroDeMusicas = ler.nextInt();

        CD cd = new CD(numeroDeMusicas);
        int tabela;

        System.out.print("""

                =====Menu de Opções do CD.CD=====
                1 - Play
                2 - Pause
                3 - Stop
                4 - Próxima Faixa
                5 - Faixa Anterior
                0 - Encerrar CD.CD
                \s""");

        do {
            tabela = ler.nextInt();

            switch (tabela) {
                case 1 -> cd.tocaCD();
                case 2 -> cd.interrompeCD();
                case 3 -> cd.paraCD();
                case 4 -> cd.proximaFaixa();
                case 5 -> cd.faixaAnterior();
                case 0 -> System.out.println();
                default -> System.out.println("Valor inválido");
            }
            if (tabela == 0) {
                System.out.println("CD.CD Encerrado");
            } else {
                System.out.println(cd);
            }

        }while (tabela != 0) ;
    }
}

