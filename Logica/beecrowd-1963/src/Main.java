import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A, B, porcentagem = 0;

        A = teclado.nextDouble();
        B = teclado.nextDouble();

        if (A <= 0) {
            porcentagem = 0;
        } else {
            porcentagem = Math.abs((B - A) / A * 100);
        }

        System.out.printf("%.2f%%%n", porcentagem);

    }
}