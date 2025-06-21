import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N;

        String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";

        N = entrada.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print(frase.charAt(i));
        }

        System.out.printf("\n");
        entrada.close();
    }
}