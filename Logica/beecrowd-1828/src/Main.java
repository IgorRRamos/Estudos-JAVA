import java.util.Scanner;

public class Main {

    public static void partida(String pal1, String pal2, int i) {
        if (pal1.equals(pal2)) {
            System.out.println("Caso #" + i + ": Denovo!");
            return;
        }

            boolean pwin =
            (pal1.equals("pedra") && (pal2.equals("lagarto") || pal2.equals("tesoura"))) ||
            (pal1.equals("papel") && (pal2.equals("pedra") || pal2.equals("spock"))) ||
            (pal1.equals("tesoura") && (pal2.equals("papel") || pal2.equals("lagarto"))) ||
            (pal1.equals("lagarto") && (pal2.equals("spock") || pal2.equals("papel"))) ||
            (pal1.equals("spock") && (pal2.equals("tesoura") || pal2.equals("pedra")));
            if (pwin) {
                System.out.println("Caso #" + i + ": Bazinga!");
            } else {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int cont = entrada.nextInt();
        entrada.nextLine(); // limpesa de buffer

        for (int i = 1; i <= cont; i++) {
            String frase = entrada.nextLine();
            String[] jogadas = frase.split(" ");

            partida(jogadas[0], jogadas[1], i);

        }


        entrada.close();

    }


}