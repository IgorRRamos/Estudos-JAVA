package org.example.Main;
import clientes.GerenciarPessoa;
import clientes.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pes1 = new Pessoa("Igor", "28", "111");

        GerenciarPessoa gerenciarPessoa = new GerenciarPessoa();
        gerenciarPessoa.cadastrar("Igor", "28", "111");
        gerenciarPessoa.cadastrar("Felipe", "25", "222");
        gerenciarPessoa.cadastrar("Pabliss", "25", "333");


        gerenciarPessoa.consultar("111");
        


    }
}
