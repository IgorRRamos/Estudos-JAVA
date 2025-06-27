    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int contador = entrada.nextInt();

            entrada.nextLine();
            for (int i = 0; i < contador; i++) {
                String curso = entrada.nextLine();
            }

            System.out.println("Ciencia da Computacao");


            entrada.close();
        }
    }