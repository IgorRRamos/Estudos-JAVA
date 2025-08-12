import java.util.Scanner;

public class Main {

    public static void temMaiuscula(String senha){
        if(senha.matches(".*[A-Z].*")) {
            System.out.println("Ok!");
        }else {
            throw new RuntimeException("Capital letter is required!");
        }
    }

    public static void temCaracter(String senha){
        if(senha.matches(".*[^a-zA-Z0-9 ].*")){
            System.out.println("Ok!");
        }else{
            System.out.println("Need especial caracter!");
        }
    }

    public static void temNumero(String senha){
        if(senha.matches(".*[0-9].*")) {
            System.out.println("Ok!");
        }else {
            throw new RuntimeException("Need number!");
        }
    }

    public static void tamanhoMinimo(String senha){
        if(senha.length() > 7 && senha.length() < 12){
            System.out.println("Ok!");
        }else{
            throw new RuntimeException("Minimum of 8 digits!/Maximum 12 digits!");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;

        System.out.print("Choice the password: ");
        senha = entrada.nextLine();

        temMaiuscula(senha);
        temCaracter(senha);
        temNumero(senha);
        tamanhoMinimo(senha);

        entrada.close();
    }
}