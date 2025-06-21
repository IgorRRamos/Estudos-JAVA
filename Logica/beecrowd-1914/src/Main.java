import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int C;

        C = entrada.nextInt();

        for (int i = 0; i < C; i++) {
            String player1 = entrada.next();
            String opcao1 = entrada.next();
            String player2 = entrada.next();
            String opcao2 = entrada.next();

            int jogada1 = entrada.nextInt();
            int jogada2 = entrada.nextInt();

            if(!(opcao1.equals(opcao2))) {

                if (opcao1.equals("PAR") && (jogada1 + jogada2) % 2 == 0) {
                    System.out.println(player1);
                } else if (opcao1.equals("IMPAR") && (jogada1 + jogada2) % 2 != 0) {
                    System.out.println(player1);
                }else{
                    System.out.println(player2);
                }

            }


        }


        entrada.close();
    }
}