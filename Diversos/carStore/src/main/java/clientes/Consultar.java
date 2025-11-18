package clientes;

import org.w3c.dom.ls.LSOutput;

public class Consultar {

    public void searchPeople(Cadastrar cadastro, String cpf) {
        for (Pessoa p : cadastro.getPessoa()) {
            if (p.getCpf().equalsIgnoreCase(cpf)) {
                System.out.println(p.toString());
            } else {
                throw new RuntimeException("Usuário não encontrado!");
            }
        }

    }


}
