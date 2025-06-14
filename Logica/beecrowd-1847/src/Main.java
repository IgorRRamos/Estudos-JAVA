import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        if (b < a && c >= b) {
            System.out.println(":)");
        } else if (b > a && c > b && b - c < a - b) {
            System.out.println(":)");
        } else if (b < a && c < b && a - b > b - c) {
            System.out.println(":)");
        } else if (a == b && c > b) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }


        entrada.close();
    }
}