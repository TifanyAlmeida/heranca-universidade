public class Aluno extends Discente{

    private int faltas;
    private double media;
    private double[] provas;
    private boolean status = false;
    public Aluno(String nome, String email, int idade, int ano, int faltas, double[] provas) {
        super(nome, email, idade, ano);
        this.faltas = faltas;
        this.provas = provas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getMedia() {
        setMedia(this.media);
        return media;
    }

    public void setMedia(double media) {
        double acumular=0;
        for (double prova:this.provas) {
            acumular=acumular+prova;

        }
        this.media= acumular/ this.provas.length;
    }

    public boolean getStatus() {
        setStatus(this.status);
        return status;
    }

    public void setStatus(boolean status) {
        if(getMedia()>=5 && 100- (Double.parseDouble(String.valueOf((getFaltas()*100)/30)))>75){
            status = true;
        }
        this.status = status;
    }

    @Override
    public String toString() {
        return
                "Faltas: " + faltas +
                "\nStatus: " + getStatus()+
                "\nNotas: "+provas[0]+", "+provas[1]+", "+provas[2];
    }
}