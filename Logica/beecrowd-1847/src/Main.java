import java.util.Scanner;

/*
    Quais são os dados de entrada?:
        Sequencia de 3 numeros inteiros representando temperaturas!

    Oque devo fazer com esses dados?:
        Verificar as variações entre eles para retornar o emoji correto referente
        as mudanças de temperatura.

    Quais são as restrições do problema?:
        Não ter retorno de emojis incorretos

    Qual é o resultado esperado?:
        Emojis especificos pertinentes a cada variação na temperatura

    Qual é a sequencia de passos a ser feita para chegar no resultado esperado?:
        Ler os 3 numeros inteiros de entrada!
        verificar as variações entre eles!
        Escrever na tela o emoji feliz caso a variação seja boa
        Escrever na tela o emoji triste caso a viriação seja ruim
 */


public class Main {

        public static void happyEmoji(int x, int y, int z){

            boolean happy = x > y && y <= z || x < y && y < z && y - x < z - y || x > y && x - y > y - z || x == y && y < z;
            if(happy){
                System.out.println(":)");
            }else{
                System.out.println(":(");
            }

        }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        happyEmoji(a, b, c);

        entrada.close();
    }
}

