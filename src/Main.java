import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int op1, op2, instituto, disciplina, idadeM=0, anoM=0, faltas = 0;
        String nomeM = "", emailM="", formacaoM="",especialidadeM="", turma="", area="";
        double nota1 = 0, nota2 = 0, nota3 = 0;

        Scanner tec = new Scanner(System.in);

        Universidade universidade = new Universidade("IFSP");

      do {
          System.out.println("+=+=+=+=+= MENU =+=+=+=+=+");
          System.out.println("....... "+universidade+" .......");
          System.out.println("\n1 - Institutos");
          System.out.println("2 - Disciplinas");
          System.out.println("3 - Monitores");
          System.out.println("4 - Alunos");
          System.out.println("5 - Professores");
          System.out.println("6 - Coordenador");
          System.out.println("7 - Diretor");
          System.out.println("8 - Sair");


          System.out.print("\n- Opção: ");
          op1 = tec.nextInt();
          tec.nextLine();

          if (op1==8){
              break;
          }

          System.out.println("==========================");

          System.out.println("\n1 - Vizualizar");
          System.out.println("2 - Adicionar\n");
          System.out.print("\n- Opção: ");
          op2 = tec.nextInt();
          tec.nextLine();
          System.out.println("==========================");

          if(op2 == 2) {
              if (op1 == 3 || op1 == 4 || op1 == 5 || op1 == 6 || op1 == 7) {
                  System.out.print("\nNome: ");
                  nomeM = tec.nextLine();
                  System.out.print("\nEmail: ");
                  emailM = tec.nextLine();

                  System.out.print("\nIdade: ");
                  idadeM = tec.nextInt();
                  tec.nextLine();
              }
              if (op1 == 3 || op1 == 4) {
                  System.out.print("\nAno: ");
                  anoM = tec.nextInt();
                  tec.nextLine();
              }
              if (op1 == 4) {
                  System.out.print("\nFaltas: ");
                  faltas = tec.nextInt();
                  tec.nextLine();

                  System.out.print("\nNota 1 :");
                  nota1 = tec.nextDouble();
                  tec.nextLine();

                  System.out.print("\nNota 2 :");
                  nota2 = tec.nextDouble();
                  tec.nextLine();

                  System.out.print("\nNota 3 :");
                  nota3 = tec.nextDouble();
                  tec.nextLine();
              }
              if (op1 == 5 || op1 == 6 || op1 == 7) {

                  System.out.print("\nFormação: ");
                  formacaoM = tec.nextLine();

                  System.out.print("\nEspecialidade: ");
                  especialidadeM = tec.nextLine();
              }
              if(op1 == 6){
                  System.out.print("\nTurma: ");
                  turma = tec.nextLine();
              }
              if(op1 == 7){
                  System.out.print("\nÁrea: ");
                  area = tec.nextLine();
              }
          }

          switch (op1) {
              case 1: {
                  System.out.println("\n¨¨¨¨ Institutos ¨¨¨¨¨¨");
                  if (op2 == 2) {
                      System.out.print("\nNome do Curso: ");
                      String nome = tec.nextLine();

                      universidade.adicionarInstituto(new Instituto(nome));
                      System.out.println("\n# DADOS ADICIONADOS COM SUCESSO! #\n");

                  } else if (op2 == 1) {
                      universidade.imprmirIntitutos();
                  }
                  if (universidade.listaInstitutos.size() == 0) {
                      System.out.println("* NENHUM CADASTRADO *");
                  }
                  System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
                  break;
              }
              case 2: {
                  System.out.println("\n¨¨¨¨¨¨ Cursos ¨¨¨¨¨¨¨¨");
                  universidade.imprmirIntitutos();
                  System.out.print("\nEm qual Instituto deseja adicionar/ver a disciplina?");
                  instituto = tec.nextInt();
                  tec.nextLine();
                  if (op2 == 2) {
                      System.out.print("\nDisciplina: ");
                      String disciplinaNome = tec.nextLine();
                      universidade.listaInstitutos.get(instituto - 1).adicionarDisciplina(new Disciplina(disciplinaNome));
                  } else if (op2 == 1) {
                      System.out.println("\n¨ Disciplinas de " + universidade.listaInstitutos.get(instituto - 1) + "¨");
                      universidade.listaInstitutos.get(instituto - 1).imprimirDisciplina();
                  }
                  System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
                  break;
              }
              case 3: {
                  //monitor
                  System.out.println("\n¨¨¨¨¨¨ Monitores ¨¨¨¨¨¨");
                  universidade.imprmirIntitutos();
                  System.out.print("\nEm qual Instituto deseja adicionar/ver: ");
                  instituto = tec.nextInt();
                  tec.nextLine();
                  universidade.listaInstitutos.get(instituto - 1).imprimirDisciplina();
                  System.out.println();
                  System.out.print("\nEm qual disciplina deseja adicionar/ver: ");
                  disciplina = tec.nextInt();
                  tec.nextLine();
                  if (op2 == 2) {
                      Monitor monitor = new Monitor(nomeM, emailM, idadeM, anoM, 2000);
                      universidade.listaInstitutos.get(instituto - 1).listaDisciplina.get(disciplina - 1).adicionarMonitores(monitor);
                  } else if (op2 == 1) {
                      System.out.println("\n");
                      System.out.println("\n¨¨¨¨¨¨ Monitores ¨¨¨¨¨¨");
                      universidade.listaInstitutos.get(instituto - 1).listaDisciplina.get(disciplina - 1).imprimirMoinitor();
                  }
                  System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
                  break;
              }
              case 4: {
                  //aluno
                  System.out.println("\n¨¨¨¨¨¨ Alunos ¨¨¨¨¨¨");
                  universidade.imprmirIntitutos();
                  System.out.print("\nEm qual Instituto deseja adicionar: ");
                  instituto = tec.nextInt();
                  tec.nextLine();
                  universidade.listaInstitutos.get(instituto - 1).imprimirDisciplina();
                  System.out.print("\nEm qual disciplina deseja adicionar: ");
                  disciplina = tec.nextInt();
                  tec.nextLine();
                  if (op2 == 2) {
                      Aluno aluno = new Aluno(nomeM, emailM, idadeM, anoM, faltas, new double[]{nota1, nota2, nota3});
                      universidade.listaInstitutos.get(instituto - 1).listaDisciplina.get(disciplina - 1).adicionarAluno(aluno);
                  } else if (op2 == 1) {
                      System.out.println("\n¨¨¨¨¨¨ Alunos ¨¨¨¨¨¨");
                      universidade.listaInstitutos.get(instituto - 1).listaDisciplina.get(disciplina - 1).imprimirAluno();
                  }
                  System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
                  break;
              }
              case 5: {
                  System.out.println("\n¨¨¨¨¨¨ Professores ¨¨¨¨¨¨");
                  universidade.imprmirIntitutos();
                  System.out.print("\nEm qual Instituto deseja adicionar: ");
                  instituto = tec.nextInt();
                  tec.nextLine();
                  universidade.listaInstitutos.get(instituto - 1).imprimirDisciplina();
                  System.out.print("\nEm qual disciplina deseja adicionar: ");
                  disciplina = tec.nextInt();
                  tec.nextLine();
                  if (op2 == 2) {
                      Professor professor = new Professor(nomeM, emailM, idadeM, 7000, formacaoM, especialidadeM);
                      universidade.listaInstitutos.get(instituto - 1).listaDisciplina.get(disciplina - 1).adicionarProfessor(professor);
                  } else if (op2 == 1) {
                      System.out.println("\n¨¨¨¨¨¨ Docentes ¨¨¨¨¨¨");
                      universidade.listaInstitutos.get(instituto - 1).listaDisciplina.get(disciplina - 1).imprimirProfessor();
                  }
                  System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
                  break;
              }
              case 6: {
                  System.out.println("\n¨¨¨¨¨¨ Coordenadores ¨¨¨¨¨¨");

                  universidade.imprmirIntitutos();
                  System.out.print("\nEm qual Instituto deseja adicionar: ");
                  instituto = tec.nextInt();
                  tec.nextLine();

                  universidade.listaInstitutos.get(instituto - 1).imprimirDisciplina();
                  System.out.print("\nEm qual disciplina deseja adicionar: ");
                  disciplina = tec.nextInt();
                  tec.nextLine();

                  if (op2 == 2) {
                      Coordenador coordenador = new Coordenador(nomeM, emailM, idadeM, 11000, formacaoM, turma);
                      universidade.listaInstitutos.get(instituto - 1).listaDisciplina.get(disciplina - 1).adicionarCoordenador(coordenador);
                  } else if (op2 == 1) {
                      System.out.println("\n¨¨¨¨¨¨ Docentes ¨¨¨¨¨¨");
                      universidade.listaInstitutos.get(instituto - 1).listaDisciplina.get(disciplina - 1).imprimirCoordenador();
                  }
                  System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
                  break;
              }
              case 7: {
                  System.out.println("\n¨¨¨¨¨¨ Diretores ¨¨¨¨¨¨");

                  universidade.imprmirIntitutos();
                  System.out.print("\nEm qual Instituto deseja adicionar: ");
                  instituto = tec.nextInt();
                  tec.nextLine();

                  universidade.listaInstitutos.get(instituto - 1).imprimirDisciplina();
                  System.out.print("\nEm qual disciplina deseja adicionar: ");
                  disciplina = tec.nextInt();
                  tec.nextLine();

                  if (op2 == 2) {
                      Diretor diretor = new Diretor(nomeM, emailM, idadeM, 16000, formacaoM, area);
                      universidade.listaInstitutos.get(instituto - 1).listaDisciplina.get(disciplina - 1).adicionarDiretor(diretor);
                  } else if (op2 == 1) {
                      System.out.println("\n¨¨¨¨¨¨ Docentes ¨¨¨¨¨¨");
                      universidade.listaInstitutos.get(instituto - 1).listaDisciplina.get(disciplina - 1).imprimirDiretor();
                  }
                  System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
                  break;
              }
          }
      }while (op1 != 8) ;
    }
}