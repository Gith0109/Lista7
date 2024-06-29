package Questao1Lista7;

import java.util.Scanner;

public class TestandoQuadrado {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double n1;

        System.out.println("Digite um número para o lado do quadrado e calcular sua área, perimetro e diagonal.");
        do {
            n1 = leitor.nextDouble();

            if (n1 <= 0) {
                System.out.println("O número precisa ser positivo para um quadrado real, digite outro número");
            }
        }while (n1 <= 0);

        Quadrado quadrado1 = new Quadrado();

        quadrado1.setLadoDoQuadrado(n1);

        System.out.printf("A área do quadrado seria: %.1f\nO perímetro do quadrado seria: %.1f\nA diagonal do quadrado" +
                " seria: %.4f",quadrado1.getAreaQuadrado(),quadrado1.getPerimetroQuadrado(),
                quadrado1.getDiagonalQuadrado());
    }
}
