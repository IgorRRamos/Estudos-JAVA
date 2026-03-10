package users;

public class Cliente {
    private static int contador=1;
    private String nome;
    private String cpf;
    private long id;

    public Cliente(){}

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = contador++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
