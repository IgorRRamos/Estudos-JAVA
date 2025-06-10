import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos;

        while(entrada.hasNextInt()){
            casos = entrada.nextInt();
            int maior = -1;

            for(int i = 0; i < casos; i++){
                int velocidades = entrada.nextInt();
                if(velocidades > maior){
                    maior = velocidades;
                }
            }
            if(maior < 10){
                System.out.println("1");
            } else if (maior < 20) {
                System.out.println("2");
            } else if (maior > 20) {
                System.out.println("3");
            }
        }
        entrada.close();
    }
}