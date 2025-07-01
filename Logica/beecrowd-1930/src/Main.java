import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int t1, t2, t3, t4;

        t1 = entrada.nextInt() -1;
        t2 = entrada.nextInt() -1;
        t3 = entrada.nextInt() -1;
        t4 = entrada.nextInt();

        int total = t1 + t2 + t3 + t4;

        System.out.println(total);

        entrada.close();
    }
}