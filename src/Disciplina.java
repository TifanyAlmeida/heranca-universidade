import java.util.ArrayList;

public class Disciplina {
    String nome;
    ArrayList<Aluno> listaAlunos = new ArrayList<>();
    ArrayList<Professor> listaProfessores = new ArrayList<>();
    ArrayList<Monitor> listaMonitores = new ArrayList<>();
    double qtd_aprovados = 0;
    double por_aprovados = 0;

    public Disciplina(String nome){
        this.nome = nome;
    }
    void adicionarAluno(Aluno aluno){
        por_aprovados = 0;

        listaAlunos.add(aluno);

        if(aluno.getStatus()){
            qtd_aprovados+=1;
            por_aprovados = (qtd_aprovados*100)/listaAlunos.size();
        }

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
            System.out.println("\n\n"+cont+" - "+aluno.getNome()+"\nIdade: "+aluno.getIdade()+"\n"+aluno);
            System.out.printf("Média: %.2f",aluno.getMedia());
        }

    }
    void imprimirProfessor(){
        int cont = 0;

        for(Professor professor: listaProfessores){
            cont++;
            if(listaAlunos.size()!=0) {
                if (por_aprovados > 80) {
                    professor.aumentarSalario();
                } else if (por_aprovados < 50) {
                      professor.diminuirSalario();
                }
            }
            System.out.println("\n\n"+cont+" - "+professor.getNome()+"\nIdade: "+professor.getIdade()+"\nSalário R$ "+(professor.getSalario()));
         }
    }
    void imprimirMoinitor(){
        int cont = 0;

        for(Monitor monitor: listaMonitores){
            cont++;
            if(listaAlunos.size()!=0) {
                if (por_aprovados > 80) {
                    monitor.aumentarBolsa();
                    monitor.setAvaliacao(true);
                } else if (por_aprovados < 50) {
                    monitor.diminuirBolsa();
                    monitor.setAvaliacao(false);
                }
            }
            System.out.println("\n\n"+cont+" - "+monitor.getNome()+"\nIdade: "+monitor.getIdade()+"\nBolsa R$ "+(monitor.getBolsa())+"\nAvaliação: "+monitor.getAvaliacao());
            System.out.println("\n");
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
