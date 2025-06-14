import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, q, r;

        while(entrada.hasNextInt()) {
            a = entrada.nextInt();
            b = entrada.nextInt();

            if (a > 0) {
                r = a % b;
                q = a / b;
            } else {
                int x = 0, y = 0;

                if (b < 0) {
                    x = b * -1;
                } else {
                    x = b;
                }
                for (r = 0; r < x; r++) {
                    y = a - r;
                    if (y % b == 0) break;
                }
                q = y / b;
            }
            System.out.printf(q + " " + r);
        }

        entrada.close();
    }
}