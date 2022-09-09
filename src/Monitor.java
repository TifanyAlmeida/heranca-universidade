public class Monitor extends Discente{

    private double bolsa;
    private boolean avaliacao;


    public Monitor(String nome, String email, int idade, int ano, double bolsa) {
        super(nome, email, idade, ano);
        this.bolsa = bolsa;
    }

    public boolean getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(boolean avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    @Override
    public String toString() {
        return "Bolsa: " + bolsa +
                "\nAvaliação: " + avaliacao;
    }
}
