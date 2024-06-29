package Questao2Lista7;

public class CD {

    private int numMusicasCD;
    private int faixaAtual;
    private int estado;

    public CD(int numMusicasCD){
        this.numMusicasCD = numMusicasCD;
        this.faixaAtual = 1;
        this.estado = 0;
    }

    public int getNumMusicasCD(){
        return numMusicasCD;
    }

    public void setNumMusicasCD(int numMusicasCD){
        this.numMusicasCD = numMusicasCD;
    }
    public int getFaixaAtual(){
        return faixaAtual;
    }

    public void setFaixaAtual(int faixaAtual) {
        this.faixaAtual = faixaAtual;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void tocaCD(){
        this.estado = 1;
    }
    public void interrompeCD(){
        this.estado = 2;
    }
    public void paraCD() {
        this.estado = 3;
        int faixaAnterior = this.faixaAtual;
        this.setFaixaAtual(1);

        System.out.printf("""
                        =========================================================
                        Parando a faixa %d e voltando para a faixa %d de %d musicas
                        """, faixaAnterior, this.faixaAtual, this.numMusicasCD);
    }

    public void proximaFaixa (){
        if (this.getFaixaAtual() == this.numMusicasCD){
            this.setFaixaAtual(1);
        } else {
            this.faixaAtual += 1;
        }
    }
    public void faixaAnterior(){
        if(this.getFaixaAtual() == 1){
            this.setFaixaAtual(this.getNumMusicasCD());
        }else{
            this.faixaAtual -= 1;
        }
    }

    @Override
    public String toString() {
        String estadoAtual;

        if(this.estado == 1) {
            estadoAtual = "tocando";
        } else if(this.estado == 2){
            estadoAtual = "pausado";
        }else{
            estadoAtual = "parado";
        }

        return "=========================================================\n"
                + "Está " + estadoAtual
                + " na faixa " + this.getFaixaAtual()
                + " do CD.CD de " + this.getNumMusicasCD() + " musicas\n"
                +"=========================================================";

    }
}