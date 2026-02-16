package org.example.interfaces;

public interface ControlladorLoja {

    public abstract void venderBike(int idUsuario, int idBike);

    public abstract void adicionarBike(String modelo, String tipo, Character tamanho, int numMarchas, double preco);
    public abstract void excluirBike(int id);
    public abstract void estoque();

    public abstract void adicionarUsuario(String nome, int idade, double saldo);
    public abstract void excluirUsuario(int id);
    public abstract void listarUsuario();
}
