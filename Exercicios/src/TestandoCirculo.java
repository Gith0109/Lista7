public class TestandoCirculo {
    public static void main(String[] args) {

        Circulo circ1 = new Circulo(0,0,0);
        System.out.printf("%d\n%d\n%d\n", circ1.getCentrox(), circ1.getCentroy(),circ1.getRaio());
        Circulo circ2 = new Circulo(5,10,3);
        System.out.printf("%d\n%d\n%d\n", circ2.getCentrox(), circ2.getCentroy(),circ2.getRaio());

    }
}
