package Questao5Lista7;

public class ItemNotaFiscal {
    private String descricao;
    private double precoUnitario;
    private int quantidadeComprada;
    private double aliquotaICMS;

    public ItemNotaFiscal(String descricao, double precoUnitario, int quantidadeComprada, double aliquotaICMS) {
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidadeComprada = quantidadeComprada;
        this.aliquotaICMS = aliquotaICMS;
    }

    public double calcularValorTotal() {
        return precoUnitario * quantidadeComprada;
    }

    public double calcularICMS() {
        return calcularValorTotal() * aliquotaICMS;
    }

    @Override
    public String toString() {
        return  "  Descrição..: " + descricao + "\n" +
                "  Preço Unit.: R$ " + precoUnitario + "\n" +
                "  Quantidade.: " + quantidadeComprada + "\n" +
                "  Valor Total: R$ " + calcularValorTotal() + "\n" +
                "  ICMS.......: R$ " + calcularICMS();
    }
}


