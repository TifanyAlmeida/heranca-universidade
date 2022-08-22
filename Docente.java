public class Docente extends Membro{

    private double salario;
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

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Salário: " + salario +
                "\nFormação: " + formacao;
    }
}
