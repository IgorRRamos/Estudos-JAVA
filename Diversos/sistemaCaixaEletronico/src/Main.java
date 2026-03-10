import banco.Conta;
import users.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Igor", "1938191440");
        Cliente cliente2 = new Cliente("gabriel", "1938191440");

        System.out.println(cliente2.getId());
        System.out.println(cliente.getId());

        Conta conta = new Conta("123", cliente);

        try {
            System.out.println(conta.getCliente().getNome());
            conta.deposito(5000);
            System.out.println(conta.extrato());


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}