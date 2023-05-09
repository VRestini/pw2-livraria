public class Editora {
    private String nome;
    private String email;

    public Editora() {
        this.nome = "Etec Horácio";
    }

    public Editora(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() < 4)
            System.out.println("Editora inválida");
        else
            this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
