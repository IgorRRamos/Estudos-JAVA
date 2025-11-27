package clientes;
import java.util.ArrayList;
import java.util.List;

public class GerenciarPessoa implements CRUD {
    private List<Pessoa> pessoas;

    public GerenciarPessoa() {
        this.pessoas = new ArrayList<>();
    }

    @Override
    public void cadastrar(String nome, String idade, String id) {
        pessoas.add(new Pessoa (nome, idade, id));

    }

    @Override
    public String consultar(String id) {
        for(Pessoa p: pessoas){
            if(id.equals(p.getId())){
            throw new RuntimeException(p.toString());
            }
        }
        throw new RuntimeException("Não localizado.");
    }

    @Override
    public String atualizar(String id, String nome, String idade) {
        for (Pessoa p: pessoas){
            if(p.getId().equals(id)){
                p.setName(nome);
                p.setAge(idade);
                throw new RuntimeException("Exito.");
            }
        }
        throw new RuntimeException("Não localizado");
    }

    @Override
    public String remover(String id) {
        for(Pessoa p: pessoas){
            if(p.getId().equals(id)){
                pessoas.remove(p);
                throw new RuntimeException("Removido");
            }
        }
        throw new RuntimeException("Removido");
    }
}
