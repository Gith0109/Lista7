package Questao5Lista7;

import java.util.Scanner;

public class TestandoNotaFiscal {
    public static void main(String[] args) {
        String descricao1,descricao2,descricao3;
        double precoUnitario1,precoUnitario2,precoUnitario3;
        double aliquotaICMS1,aliquotaICMS2,aliquotaICMS3;
        int quantidadeComprada1,quantidadeComprada2,quantidadeComprada3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a descrição do Item 1:");
        descricao1 = scanner.next();

        System.out.println("Digite o preço unitário do Item 1:");
        precoUnitario1 = scanner.nextDouble();

        System.out.println("Digite a quantidade do Item 1:");
        quantidadeComprada1 = scanner.nextInt();

        System.out.println("Digite a alíquota do ICMS do Item 1:");
        aliquotaICMS1 = scanner.nextDouble();

        System.out.println("Digite a descrição do Item 2:");
        descricao2 = scanner.next();

        System.out.println("Digite o preço unitário do Item 2:");
        precoUnitario2 = scanner.nextDouble();

        System.out.println("Digite a quantidade do Item 2:");
        quantidadeComprada2 = scanner.nextInt();

        System.out.println("Digite a alíquota do ICMS do Item 2:");
        aliquotaICMS2 = scanner.nextDouble();

        System.out.println("Digite a descrição do Item 3:");
        descricao3 = scanner.next();

        System.out.println("Digite o preço unitário do Item 3:");
        precoUnitario3 = scanner.nextDouble();

        System.out.println("Digite a quantidade do Item 3:");
        quantidadeComprada3 = scanner.nextInt();

        System.out.println("Digite a alíquota do ICMS do Item 3:");
        aliquotaICMS3 = scanner.nextDouble();

        ItemNotaFiscal item1 = new ItemNotaFiscal(descricao1, precoUnitario1, quantidadeComprada1, aliquotaICMS1);
        ItemNotaFiscal item2 = new ItemNotaFiscal(descricao2, precoUnitario2, quantidadeComprada2, aliquotaICMS2);
        ItemNotaFiscal item3 = new ItemNotaFiscal(descricao3, precoUnitario3, quantidadeComprada3, aliquotaICMS3);

        NotaFiscal notaFiscal = new NotaFiscal(item1, item2, item3);

        notaFiscal.mostrarNota();

    }
}