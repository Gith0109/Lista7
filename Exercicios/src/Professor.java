public class Professor {

    private String nome;
    private int matricula;
    private int cargaHoraria;

    public void setNome(String n){
        nome = n;
    }
    public String getNome() {
        return nome;
    }
    public void setMatricula(int m){
        matricula = m;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setCargaHoraria (int c){
        cargaHoraria = c;
    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    public float getCargaHorariaMensal(){
        return(cargaHoraria * 4.5F);
    }
    }