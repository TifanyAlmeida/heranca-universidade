public class Discente extends Membro{

    private int ano;

    public Discente(String nome, String email, int idade, int ano) {
        super(nome, email, idade);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return  "Ano: " + ano;
    }
}
