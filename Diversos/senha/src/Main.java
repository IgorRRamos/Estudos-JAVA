import java.util.Scanner;

public class Main {

    public static void temMaiuscula(String senha){
        if(senha.matches(".*[A-Z].*")) {
            System.out.println("Ok!");
        }else {
            throw new RuntimeException("Capital letter is required!");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;

        System.out.print("Choice the password: ");
        senha = entrada.nextLine();

        temMaiuscula(senha);


        entrada.close();
    }
}