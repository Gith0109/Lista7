package Questao4Lista7;

public class Proprietario {

    private String nome;
    private String endereco;
    private char sexo;
    private String cpf;
    private String cnh;

    public Proprietario(String nome, String endereco, char sexo, String cpf, String cnh) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cpf = cpf;
        this.cnh = cnh;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char sexo(){
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh(){
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", sexo: " + sexo +
                ", Endereço: " + endereco +
                ", CPF: " + cpf +
                ", CNH: " + cnh;
    }
}
