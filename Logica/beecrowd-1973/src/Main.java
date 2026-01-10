import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N, restantes = 0, atacadas = 0;

        N = teclado.nextInt();
        int[] casos = new int[N];
        boolean[] jaSaqueou = new boolean[N];

        for (int i = 0; i < N; i++) {
            casos[i] = teclado.nextInt();
            jaSaqueou[i] = false;
        }

        int posicao = 0;
        while (posicao >= 0 && posicao < N) {

            if (casos[posicao] % 2 == 0) {
                if (casos[posicao] > 0 && !jaSaqueou[posicao]) {
                    atacadas += 1;
                    casos[posicao] -= 1;
                    jaSaqueou[posicao] = true;
                }
                posicao--;
                if (posicao < 0) {
                    break;
                }
            } else if (casos[posicao] % 2 != 0 && !jaSaqueou[posicao]) {
                atacadas += 1;
                casos[posicao] -= 1;
                jaSaqueou[posicao] = true;
                posicao++;
            }

        }

        for (int i = 0; i < N; i++) {
            restantes += casos[i];
        }


        System.out.println(atacadas + " " + restantes + "\n");

        teclado.close();
    }
}