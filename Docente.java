public class Docente extends Membro{

    private double salario;
    private String formacao;

    public Docente(String nome, String email, int idade, double salario, String formacao) {
        super(nome, email, idade);
        this.salario = salario;
        this.formacao = formacao;
    }

    public double getSalario() {
        setSalario(this.salario);
        return salario;
    }

    public void setSalario(double salario) {
        int aprovados = 0;
        int qtdAluno = 0;
        Universidade universidade = new Universidade();

        for (int i = 0; i<=universidade.listaInstitutos.size(); i++){
            for(int j = 0; j<=universidade.listaInstitutos.get(i).listaDisciplina.size(); j++) {
                for(int k = 0; k<universidade.listaInstitutos.get(i).listaDisciplina.get(j).listaAlunos.size(); k++) {
                    if (universidade.listaInstitutos.get(i).listaDisciplina.get(j).listaAlunos.get(k).getMedia()>=5 &&
                            universidade.listaInstitutos.get(i).listaDisciplina.get(j).listaAlunos.get(k).getStatus()) {
                                aprovados++;
                    }
                    qtdAluno++;
                }
            }
        }
        if (aprovados > qtdAluno){
            this.salario = salario+500;
        }
        else {
            this.salario = salario;
        }
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Salário: " + salario +
                "\nFormação: " + formacao;
    }
}
