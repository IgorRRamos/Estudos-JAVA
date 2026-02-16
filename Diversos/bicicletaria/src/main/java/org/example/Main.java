package org.example;

import org.example.model.Usuario;
import org.example.servico.Loja;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.adicionarUsuario("Igor", 28, 10000.00);
        loja.adicionarUsuario("David", 28, 1.500);
        loja.adicionarUsuario("Vinicius", 28, 1.500);
        loja.adicionarUsuario("Rafaela", 28, 1.500);
        loja.listarUsuario();

        loja.adicionarBike("Speed", "Urbana", 'G', 8, 4.155);
        loja.adicionarBike("Speed", "Urbana", 'M', 8, 3.855);
        loja.adicionarBike("Speed", "Urbana", 'P', 8, 3.555);
        loja.estoque();

        loja.venderBike(1, 2);

        loja.excluirBike(2);

        loja.excluirUsuario(3);


        loja.listarUsuario();
        loja.estoque();


    }
}