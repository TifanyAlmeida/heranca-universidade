public class Monitor extends Discente{

    private double bolsa;
    private boolean avaliacao;


    public Monitor(String nome, String email, int idade, int ano, double bolsa, boolean avaliacao) {
        super(nome, email, idade, ano);
        this.bolsa = bolsa;
        this.avaliacao = avaliacao;
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
