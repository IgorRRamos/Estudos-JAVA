package org.example.model;

import java.util.Objects;

public class Bicicleta {
    private static int contador = 1;
    private String modelo, tipo;
    private Character tamanhoQuadro;
    private int numMarchas, id;
    private double preco;
    private boolean disponible;

    public Bicicleta(String modelo, String tipo, Character tamanho, int numMarchas, double preco) {
        this.id = contador++;
        this.modelo = modelo;
        this.tipo = tipo;
        this.tamanhoQuadro = tamanho;
        this.numMarchas = numMarchas;
        this.preco = preco;
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamanhoQuadro=" + tamanhoQuadro +
                ", numMarchas=" + numMarchas +
                ", preco=" + preco +
                ", disponible=" + disponible +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public Character getTamanhoQuadro() {
        return tamanhoQuadro;
    }

    public void setTamanhoQuadro(Character tamanhoQuadro) {
        this.tamanhoQuadro = tamanhoQuadro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}