package org.example.Main;

import clientes.Atualizar;
import clientes.Cadastrar;
import clientes.Consultar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cadastrar cadastro = new Cadastrar();

        cadastro.cadastrarCliente("igor", 28, "12332112345", 10.000);

        Consultar consulta = new Consultar();
        consulta.searchPeople(cadastro, "12332112345");

    }
}
