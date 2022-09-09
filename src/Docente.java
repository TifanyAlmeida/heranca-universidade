public class Docente extends Membro{

    protected double salario;
    private String formacao;

    public Docente(String nome, String email, int idade, double salario, String formacao) {
        super(nome, email, idade);
        this.salario = salario;
        this.formacao = formacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Salário: " + salario +
                "\nFormação: " + formacao;
    }
    public void aumentarSalario(){
        this.salario = this.salario*1;
    }

    public void diminuirSalario(){
        this.salario = this.salario*1;
    }
}
