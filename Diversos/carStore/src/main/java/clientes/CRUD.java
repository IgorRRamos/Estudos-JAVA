package clientes;

public interface CRUD {
    public abstract void cadastrar(String nome, String idade, String id);
    public abstract String consultar(String id);
    public abstract String atualizar(String id, String nome, String idade);
    public abstract String remover(String id);
}
