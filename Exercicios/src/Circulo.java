public class Circulo {
    public static final double PI = 3.14;
    private int centrox;
    private int centroy;
    private int raio;

    public Circulo (int centrox, int centroy, int raio){
        this.centrox = centrox;
        this.centroy = centroy;
        this.raio = raio;

    }
    public Circulo(){}
    public double area() {
        return (PI * raio * raio);
    }

    public double circunferencia() {
        return (2 * PI * raio);
    }

    public int diametro() {
        return (2 * raio);
    }

    public int getCentrox(){
        return centrox;
    }
    public int getCentroy(){
        return centroy;
    }
    public int getRaio(){
        return raio;
    }
}
