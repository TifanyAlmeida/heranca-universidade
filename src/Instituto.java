import java.util.ArrayList;

public class Instituto {
    String nome;
    ArrayList<Disciplina> listaDisciplina = new ArrayList<>();

    public Instituto(String nome){
        this.nome = nome;
    }
    public void adicionarDisciplina(Disciplina disciplina){
        listaDisciplina.add(disciplina);
    }
    void imprimirDisciplina(){
        int cont = 0;
        for(Disciplina disciplina: listaDisciplina){
            cont++;
            System.out.println(cont+" - "+disciplina);
        }
    }
    @Override
    public String toString() {
        return nome;
    }



}
