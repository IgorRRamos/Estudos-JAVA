package veiculos;

public interface CRUD {
    public abstract String cadastrar(String marcModel, String cor,String numRegistro);
    public abstract String consultar(String numRegistro);
    public abstract String atualizar(String numRegistro, String nome, String cor);
    public abstract String remover(String numRegistro);
}
