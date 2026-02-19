package org.example.users;

import org.example.model.Combate;

import java.util.Optional;

public final class Player extends Combate {
    private String nickName;
    private String classe;
    private String arma;

    public Player(String nick) {
        super(100, 1);
        this.nickName = nick;
    }

    public void escolherClasse(String decisao) {
        String validDecisao = decisao.toUpperCase();
        if (!validDecisao.equals("CAVALEIRO") && !validDecisao.equals("MAGO") && !validDecisao.equals("ARQUEIRO") &&
                !validDecisao.equals("ESPADACHIM")) {
            throw new RuntimeException("Classe invalida");
        }

        this.classe = decisao.toUpperCase();
        System.out.println("\nClasse: " + getClasse() + " selecionada!");
    }

    @Override
    public int atacar(){
        return 10 * getNv();
    }

    public Optional<Boolean> escolherArma(int opcao) {
        if (getClasse() != null) {
            switch (this.classe) {
                case "CAVALEIRO":
                    if (opcao == 1) setArma("ESPADA ESCUDO");
                    if (opcao == 2) setArma("MACHADO");
                    if (opcao == 3) setArma("LANÇA");
                    return Optional.of(true);
                case "MAGO":
                    if (opcao == 1) setArma("CAJADO");
                    if (opcao == 2) setArma("LIVRO");
                    if (opcao == 3) setArma("VARINHA");
                    return Optional.of(true);
                case "ARQUEIRO":
                    if (opcao == 1) setArma("ARCO");
                    if (opcao == 2) setArma("BESTA");
                    if (opcao == 3) setArma("ARPAO");
                    return Optional.of(true);
                case "ESPADACHIM":
                    if (opcao == 1) setArma("ESPADA LONGA");
                    if (opcao == 2) setArma("ESPADAS DUPLAS");
                    if (opcao == 3) setArma("FACAS");
                    return Optional.of(true);
            }
        } else {
            throw new IllegalArgumentException("Necessário escolher uma classe!");
        }
        return Optional.empty();
    }

    public void subirNv(){
        this.setNv(this.getNv() + 1);
        System.out.println("Subiu de nivel!");
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", classe='" + classe + '\'' +
                ", arma='" + arma + '\'' +
                ", nv=" + getNv() + '\'' +
                ", vida=" + getVida() + '\'' +
                '}';
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
