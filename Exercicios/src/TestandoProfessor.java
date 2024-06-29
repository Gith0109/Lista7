public class TestandoProfessor {
    public static void main(String[] args) {

        Professor prof1,prof2;

        prof1 = new Professor();
        prof1.setNome("Giovana");
        prof1.setMatricula(1234);
        prof1.setCargaHoraria(17);

        prof2 = new Professor();
        prof2.setNome("Rodrigo");
        prof2.setMatricula(5678);
        prof2.setCargaHoraria(18);

        System.out.printf("Nome: %s\nMatrícula: %d\nCarga Horaria: %d horas\nCarga Horária Mensal: %.2f horas\n "
                ,prof1.getNome(),prof1.getMatricula(),prof1.getCargaHoraria(),prof1.getCargaHorariaMensal() );

        System.out.printf("\nNome: %s\nMatrícula: %d\nCarga Horaria: %d horas\nCarga Horária Mensal: %.2f horas\n "
                ,prof2.getNome(),prof2.getMatricula(),prof2.getCargaHoraria(),prof2.getCargaHorariaMensal() );
    }
}