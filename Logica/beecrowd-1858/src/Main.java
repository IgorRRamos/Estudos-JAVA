import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNextLine()) {
            int N, T, cont = 0, verificacao=0;

            N = entrada.nextInt();
            int[] pessoa = new int[N];
            for (int i = 1; i <= N; i++) {
                pessoa[i - 1] = entrada.nextInt();
            }
            verificacao = pessoa[0];

            for(int i=0;i<N;i++){
                if(pessoa[i - 1] < verificacao){
                    verificacao = pessoa[i - 1];
                    cont=i;
                }

            }
            System.out.println(cont);
        }




        entrada.close();

    }
}