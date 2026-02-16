package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private static int contador = 1;
    private String nome;
    private int idade;
    private double saldo;
    private int id;
    private List<Bicicleta> bicicleta;

    public Usuario(String nome, int idade, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
        this.id = contador++;
        this.bicicleta = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Usuario{" + "Id='" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", saldo=" + saldo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Bicicleta> getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(List<Bicicleta> bicicleta) {
        this.bicicleta = bicicleta;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Usuario.contador = contador;
    }
}
