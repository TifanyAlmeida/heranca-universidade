public class Coordenador extends Docente{

    String turma;

    public Coordenador(String nome, String email, int idade, double salario, String formacao, String turma) {
        super(nome, email, idade, salario, formacao);
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Turma: " + turma;
    }
    @Override
    public void aumentarSalario(){
        this.salario = this.salario*1.15;
    }
    @Override
    public void diminuirSalario(){
        this.salario = this.salario-1.05;
    }
}
