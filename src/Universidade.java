import java.util.ArrayList;

public class Universidade {
    ArrayList<Instituto> listaInstitutos = new ArrayList<>();
    String nome;

    public Universidade(String nome) {
        this.nome = nome;
    }
    public void adicionarInstituto(Instituto instituto){
        listaInstitutos.add(instituto);
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
