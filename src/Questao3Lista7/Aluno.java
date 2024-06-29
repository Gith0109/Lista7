package Questao3Lista7;

public class Aluno {

    private int numeroMatricula;
    private String nomeAluno;
    private double nota1;
    private double nota2;

    public Aluno(int numeroMatricula, String nomeAluno, double nota1, double nota2){
        this.numeroMatricula = numeroMatricula;
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;

    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getnomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1nota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double media() {
        return (this.nota1 + this.nota2) / 2.0;
    }

    public boolean aprovado() {
        return media() >= 7.0;
    }

    public double quantoPrecisa() {
        return (50 - media() * 6) / 4.0;
    }

    @Override
    public String toString() {
        if (this.aprovado()) {
            return "O aluno " + this.nomeAluno + " da matrícula " + this.numeroMatricula + " foi aprovado, com " +
                    "a média de " + this.media() + " no final do semestre. ";
        } else {
            return "O aluno " + this.nomeAluno + " da matrícula " + this.numeroMatricula + " não foi aprovado, com " +
                    " precisará de " + quantoPrecisa() + " para pasar. ";

        }
    }
}


