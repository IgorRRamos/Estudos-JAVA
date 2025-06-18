import java.util.Scanner;

/*
    Quais são os dados de entrada?:
        String e simbolos

    Oque devo fazer com esses dados?:
        Fazer calculos referente a sequencia de caracteres digitados
        A string é para determinar quando a soma iniciara.

    Quais são as restrições do problema?:
        Os numeros da soma não podem exceder 1000

    Qual é o resultado esperado?:
        Um numero inteiro referente a soma pela sequencia dos caracteres

    Qual é a sequencia de passos a ser feita para chegar no resultado esperado?:
        Ler os 3 caracteres
        terminar quando foi digitado a String caw caw
        somar corretamente os valores referente a sequencia dos caracteres
        imprimir o resultado na tela
 */


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int loteria = 0;

        char eye1, eye2, eye3;

        while (entrada.hasNextLine()){

            String corvo = entrada.nextLine();

            eye1 = corvo.charAt(0);
            eye2 = corvo.charAt(1);
            eye3 = corvo.charAt(2);

            if (corvo.equals("caw caw")) {
                System.out.println(loteria);
                loteria = 0;
            } else {
                if (eye1 == '*') loteria += 2 * 2;
                if (eye2 == '*') loteria += 2;
                if (eye3 == '*') loteria += 1;
            }
        }

        entrada.close();
    }
}