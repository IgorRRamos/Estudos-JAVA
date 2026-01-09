import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, T, contador = 0;

        N = teclado.nextInt();

        do {

            T = teclado.nextInt();

            int A = 2015 - T;

            if(A <= 0) {
                A -= 1;
            }

            int abs = Math.abs(A);

            if (A <= 1) {
                System.out.println(abs + " A.C.");
            } else{
                System.out.println(abs + " D.C.");
            }

            contador++;
        } while (contador != N);


    }
}