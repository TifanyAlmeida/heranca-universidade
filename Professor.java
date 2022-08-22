public class Professor extends Docente{

    String especialidade;

    public Professor(String nome, String email, int idade, double salario, String formacao, String especialidade) {
        super(nome, email, idade, salario, formacao);
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Especialidade: " + especialidade;
    }
}
