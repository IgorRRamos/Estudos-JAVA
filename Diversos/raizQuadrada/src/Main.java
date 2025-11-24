import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        double raiz;

        System.out.print("Enter a number: ");
        num1 = keyboard.nextInt();

        raiz = Math.sqrt(num1);

        System.out.println(raiz);


    }
}