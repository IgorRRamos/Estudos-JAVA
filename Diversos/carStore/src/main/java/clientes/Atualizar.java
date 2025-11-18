package clientes;
import java.util.UUID;

public class Atualizar {

    public boolean updateName(Cadastrar cadastrar, String cpf, String name){
        for (Pessoa p : cadastrar.getPessoa()){
            if(p.getCpf().equalsIgnoreCase(cpf)){
                p.setName(name);
                return true;
            }
        }
        return false;
    }

    public boolean updateId(Cadastrar cadastrar, String cpf){
        for (Pessoa p : cadastrar.getPessoa()){
            if(p.getCpf().equalsIgnoreCase(cpf)){
                String num = UUID.randomUUID().toString().substring(0, 4);
                return true;
            }
        }
        return false;
    }

    public boolean updateIdade(Cadastrar cadastrar, String cpf, int age){
        for (Pessoa p : cadastrar.getPessoa()){
            if(p.getCpf().equalsIgnoreCase(cpf)){
                p.setAge(age);
                return true;
            }
        }
        return false;
    }

}
