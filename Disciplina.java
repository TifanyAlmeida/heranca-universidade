import java.util.ArrayList;

public class Disciplina {
    String nome;
    ArrayList<Aluno> listaAlunos = new ArrayList<>();
    ArrayList<Professor> listaProfessores = new ArrayList<>();
    ArrayList<Monitor> listaMonitores = new ArrayList<>();

    public Disciplina(String nome){
        this.nome = nome;
    }
    void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }
    void adicionarProfessor(Professor professor){
        listaProfessores.add(professor);
    }
    void adicionarMonitores(Monitor monitor){
        listaMonitores.add(monitor);
    }
    void imprimirAluno(){
        int cont = 0;
        for(Aluno aluno: listaAlunos) {
            cont++;
            System.out.println("\n\n"+cont+" - "+aluno.getNome()+"\nIdade: "+aluno.getIdade()+"\nMédia: "+ aluno.getMedia()+"\n"+aluno);
        }
    }
    void imprimirProfessor(){
        int cont = 0;
        for(Professor professor: listaProfessores){
            cont++;
            System.out.println("\n\n"+cont+" - "+professor.getNome()+"\nIdade: "+professor.getIdade()+"\nSalário R$ "+professor.getSalario());
        }
    }
    void imprimirMoinitor(){
        int cont = 0;
        for(Monitor monitor: listaMonitores){
            cont++;
            System.out.println("\n\n"+cont+" - "+monitor.getNome()+"\nIdade: "+monitor.getIdade()+"\nBolsa R$ "+monitor.getBolsa());
            System.out.println("\n");
        }
    }
    @Override
    public String toString() {
        return nome;
    }
}
