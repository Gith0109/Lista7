public class TestandoAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Leonardo");
        System.out.printf("Aluno %d com nome:%s\n", Aluno.getNumInstancias(),aluno1.getNome());

        Aluno aluno2 = new Aluno("José");
        System.out.printf("Aluno %d com nome:%s\n", Aluno.getNumInstancias(),aluno2.getNome());

        for(int i = 0; i < 10; i++){
            new Aluno();
        }

        System.out.printf("Numero de Instancias %d", Aluno.getNumInstancias());
    }
}
