public class Diretor extends Docente{

    private String area;

    public Diretor(String nome, String email, int idade, double salario, String formacao, String area) {
        super(nome, email, idade, salario, formacao);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Área: " + area;
    }
}
