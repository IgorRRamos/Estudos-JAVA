package org.example.servico;

import org.example.interfaces.ControlladorLoja;
import org.example.model.Bicicleta;
import org.example.model.Usuario;

import java.util.*;

public class Loja implements ControlladorLoja {

    private Map<Integer, Usuario> clientes = new HashMap<>();
    private Map<Integer, Bicicleta> bicicletas = new HashMap<>();

    @Override
    public void venderBike(int idUsuario, int idBike) {
        Usuario usuario = clientes.get(idUsuario);
        if(usuario == null){
            throw new RuntimeException("Usuario nao encontrado!");
        }

        Bicicleta bike = bicicletas.get(idBike);
        if(bike == null){
            throw new RuntimeException("Bicicleta não encontrada!");
        }

        if(!bike.isDisponible()){
            throw new RuntimeException("Bicicleta indisponível.");
        }

        if(usuario.getSaldo() < bike.getPreco()){
            throw new RuntimeException("Saldo insuficiente!");
        }

        usuario.getBicicleta().add(bike);

        bike.setDisponible(false);
    }


    @Override
    public void adicionarBike(String modelo, String tipo, Character tamanho, int numMarchas, double preco) {
        Bicicleta bike = new Bicicleta(modelo, tipo, tamanho, numMarchas, preco);
        bicicletas.put(bike.getId(), bike);
    }

    @Override
    public void excluirBike(int id) {
        boolean removido = bicicletas.remove(id) != null;

        if (!removido)
            throw new RuntimeException("Bike nãao encontrada!");
    }

    @Override
    public void estoque() {
        for (Bicicleta lista : bicicletas.values()) {
            System.out.println(lista);
        }
    }

    @Override
    public void adicionarUsuario(String nome, int idade, double saldo) {
        Usuario novo = new Usuario(nome, idade, saldo);
        clientes.put(novo.getId(), novo);
    }

    @Override
    public void excluirUsuario(int id) {
        boolean removido = clientes.remove(id) != null;

        if (!removido)
            throw new RuntimeException("Usuario nãao encontrado!");
    }

    @Override
    public void listarUsuario() {
        for (Usuario usuario : clientes.values()) {
            System.out.println(usuario);
        }
    }
}
