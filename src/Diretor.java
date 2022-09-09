public class Diretor extends Docente{

    private String area;

    public Diretor(String nome, String email, int idade, double salario, String formacao, String area) {
        super(nome, email, idade, salario, formacao);
        this.area = area;
    }
    @Override
    public String toString() {
        return "Área: " + area;
    }
    @Override
    public void aumentarSalario(){
        this.salario = this.salario*1.20;
    }
    @Override
    public void diminuirSalario(){
        this.salario = this.salario-1.05;
    }
}
