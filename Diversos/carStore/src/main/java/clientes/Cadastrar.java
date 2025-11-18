package clientes;
import java.util.ArrayList;
import java.util.List;

public class Cadastrar {
    private List<Pessoa> pessoa;

    public Cadastrar(){
        this.pessoa = new ArrayList<>();
    }

    public void cadastrarCliente(String nome, int idade, String cpf, double saldo){
        pessoa.add(new Pessoa(nome, idade, cpf, saldo));
    }

    public List<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(List<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Cadastrar{" +
                "pessoa=" + pessoa.toString() +
                '}';
    }
}
