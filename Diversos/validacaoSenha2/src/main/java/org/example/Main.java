package org.example;
import java.util.Scanner;
import java.util.regex.*;
public class Main {

    public static String validarSenha(String senha){

        if(senha.length() < 8){
            return "A senha deve ter pelo menos 8 caracteres.";
        }

        if(!senha.matches(".*[A-Z].*")){
            return "A senha deve ter letra maiúscula.";
        }

        if(!senha.matches(".*[0-9].*")){
            return "A senha precisa ter numeros.";
        }

        if (!senha.matches(".*[a-z].*")){
            return "A senha precisa ter letras minúsculas.";
        }

        if (!senha.matches(".*[!@#$%¨&*(),.?\":{}|<>].*")){
            return "A senha precisa ter caracteres.";
        }

        return "Senha válida!";
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = keyboard.nextLine();


        System.out.println(validarSenha(senha));

    }
}