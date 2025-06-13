import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, q, r;

        a = entrada.nextInt();
        b = entrada.nextInt();

        r = a % b;
        q = a / b;

        System.out.printf("%d %d", q, r);


        entrada.close();
    }
}