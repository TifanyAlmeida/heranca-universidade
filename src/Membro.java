public class Membro {
    private String nome, email;
    private int idade;

    public Membro(String nome, String email, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }


    @Override
    public String toString() {
        return
                "Nome: " + nome
                +"\nEmail: " + email
                +"\nIdade: "+ idade;
    }

}
