package veiculos;
import java.util.List;

public class GerenciarCarro implements CRUD{
    private List<Carro> carro;

    public GerenciarCarro(List<Carro> carro) {
        this.carro = carro;
    }


    @Override
    public String cadastrar(String marcModel, String cor, String numRegistro) {
        carro.add(new Carro(marcModel, cor, numRegistro));
        throw new RuntimeException("Cadastrado.");
    }

    @Override
    public String consultar(String numRegistro) {
        for(Carro car : carro){
            if(car.getNumRegistro().equals(numRegistro)){
                throw new RuntimeException(car.toString());
            }
        }
        throw new RuntimeException("Não localizado.");
    }

    @Override
    public String atualizar(String numRegistro, String nome, String cor) {
        for(Carro car : carro){
            if(car.getNumRegistro().equals(numRegistro)){
                car.setMarcModel(nome);
                car.setCor(cor);
                throw new RuntimeException("Atualizado.");
            }
        }
        throw new RuntimeException("Não localizado.");
    }

    @Override
    public String remover(String numRegistro) {
        for(Carro car : carro){
            if(car.getNumRegistro().equals(numRegistro)){
                carro.remove(car);
                throw new RuntimeException("Excluido.");
            }
        }
        throw new RuntimeException("Não localizado.");
    }
}
