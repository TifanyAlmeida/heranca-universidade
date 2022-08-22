public class Coordenador extends Docente{

    String turma;

    public Coordenador(String nome, String email, int idade, double salario, String formacao, String turma) {
        super(nome, email, idade, salario, formacao);
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Turma: " + turma;
    }
}
