public class Aluno {
    private static int numInstancias;
    private String nome;

    public Aluno (String nome){
        this.nome = nome;
        Aluno.addNumInstancias();
    }
    public Aluno(){
        Aluno.addNumInstancias();
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public static int getNumInstancias(){
        return numInstancias;
    }
    public static void addNumInstancias(){
        Aluno.numInstancias++;
    }
}
