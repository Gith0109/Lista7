package Questao5Lista7;

public class NotaFiscal {
    private ItemNotaFiscal item1;
    private ItemNotaFiscal item2;
    private ItemNotaFiscal item3;

    public NotaFiscal(ItemNotaFiscal item1, ItemNotaFiscal item2, ItemNotaFiscal item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public double calculaTotal() {
        return item1.calcularValorTotal() + item2.calcularValorTotal() + item3.calcularValorTotal();
    }

    public String toString() {
        return "===============================================\n" +
                "                NOTA FISCAL\n"+
                "===============================================\n" +
                "ITEM 1:\n" + item1 + "\n" +
                "ITEM 2:\n" + item2 + "\n" +
                "ITEM 3:\n" + item3 + "\n" +
                "TOTAL = R$ " + calculaTotal() + "\n" +
            "===============================================";

    }
    public void mostrarNota() {
        System.out.println(this);
    }
}