import java.util.ArrayList;

public class Universidade {
    ArrayList<Instituto> listaInstitutos = new ArrayList<>();
    String nome;
    Universidade universidade;

    public Universidade(String nome) {
        this.nome = nome;
    }
    public void adicionarInstituto(Instituto instituto){
        listaInstitutos.add(instituto);
    }

    public Universidade(){

    }

    void imprmirIntitutos(){
        int cont = 0;
        for (Instituto instituto: listaInstitutos)
        {
            cont++;
            System.out.println(cont+" - "+instituto.nome);

        }
    }
    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
