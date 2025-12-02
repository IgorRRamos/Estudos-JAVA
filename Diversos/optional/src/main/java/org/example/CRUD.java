package org.example;

import java.util.List;
import java.util.Optional;

public class CRUD {

    private List<Pessoa> pessoas;

    public CRUD(List<Pessoa> pessoa) {
        this.pessoas = pessoa;
    }

    public void adicionar(String nome, int idade, int id) {
        pessoas.add(new Pessoa(111));
    }


    private Optional<Pessoa> buscaPessoa(int id) {
        Optional<Pessoa> pessoa = Optional.of(new Pessoa(id));
        return pessoas.contains(pessoa.get()) ? Optional.ofNullable(pessoas.get(pessoas.indexOf(pessoa.get()))) : Optional.empty();
    }

}
