import java.util.Random;

public class Membro {
    private String nome, email;
    private int idade;

    public Membro(String nome, String email, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    public Membro(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return
                "Nome: " + nome
                +"\nEmail: " + email
                +"\nIdade: "+ idade;
    }

}
