import java.util.ArrayList;

public class Disciplina {
    String nome;
    ArrayList<Aluno> listaAlunos = new ArrayList<>();
    ArrayList<Docente> listaDocentes = new ArrayList<>();
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
        listaDocentes.add(professor);
    }
    void adicionarCoordenador(Coordenador coordenador){
        listaDocentes.add(coordenador);
    }
    void adicionarDiretor(Diretor diretor){
        listaDocentes.add(diretor);
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
        for(Docente professor: listaDocentes){
            cont++;
            if(listaAlunos.size()!=0) {
                if (por_aprovados > 80) {
                    professor.aumentarSalario();
                } else if (por_aprovados < 50) {
                      professor.diminuirSalario();
                }
            }
            System.out.println("\n\n"+cont+" - "+professor.getNome()+"\nIdade: "+professor.getIdade());
            System.out.printf("\nSalário R$ %.2f",professor.getSalario());
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
            System.out.println("\n\n"+cont+" - "+monitor.getNome()+"\nIdade: "+monitor.getIdade()+"\nAvaliação: "+monitor.getAvaliacao());
            System.out.printf("\nSalário R$ %.2f",monitor.getBolsa());
            System.out.println("\n");
        }
    }

    void imprimirDiretor(){
        int cont = 0;
        for(Docente diretor: listaDocentes){
            cont++;
            if(listaAlunos.size()!=0) {
                if (por_aprovados > 80) {
                    diretor.aumentarSalario();
                } else if (por_aprovados < 50) {
                    diretor.diminuirSalario();
                }
            }
            System.out.println("\n\n"+cont+" - "+diretor.getNome()+"\nIdade: "+diretor.getIdade());
            System.out.printf("\nSalário R$ %.2f",diretor.getSalario());
            System.out.println("\n");
        }
    }
    void imprimirCoordenador(){
        int cont = 0;
        for(Docente coordenador: listaDocentes){
            cont++;
            if(listaAlunos.size()!=0) {
                if (por_aprovados > 80) {
                    coordenador.aumentarSalario();
                } else if (por_aprovados < 50) {
                    coordenador.diminuirSalario();
                }
            }
            System.out.println("\n\n"+cont+" - "+coordenador.getNome()+"\nIdade: "+coordenador.getIdade());
            System.out.printf("\nSalário R$ %.2f",coordenador.getSalario());
            System.out.println("\n");
        }
    }
    @Override
    public String toString() {
        return nome;
    }
}
