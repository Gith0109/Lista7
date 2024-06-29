import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero1;
        String resposta;

        System.out.print("Digite um número de valor positivo para fazer o seu calculo referencial:\n");
        do {
            do {
                numero1 = leitor.nextInt();

                if (numero1 <= 0) {
                    System.out.println("Esse número é invalido para o calculo, por favor digite outro valor e que seja " +
                            "positivo.");
                }
            }while(numero1 <= 0);

            long fatorial = calcularoFatorial(numero1);

            System.out.printf("Fatorial de %d: %d\n", numero1, fatorial);

            System.out.print("Se deseja continuar a fazer mais cálculos digite sim, caso deseja encerrar digite não\n");
            resposta = leitor.next().toLowerCase();
        } while (resposta.equals("sim"));


        System.out.println("Cálculo finalizado");
    }

    public static long calcularoFatorial(int numero1) {
        long fatorial = 1;
        for (int x = 1; x <= numero1; x++) {
            fatorial *= x ;
        }
        return fatorial;
    }
}

