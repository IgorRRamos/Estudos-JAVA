import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N;

        N = entrada.nextInt();


        for (int i = 0; i < N; i++) {
            int s = entrada.nextInt();

            if (s % 2 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }


        entrada.close();
    }
}