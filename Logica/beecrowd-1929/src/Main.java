import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] num = new int[4];
        for(int i = 0; i < 4; i++){
            num[i] = entrada.nextInt();
        }

        Arrays.sort(num);

        boolean triangulo = (num[0] + num[1] == num[2]) ||
         ( num[0] == num[1] && num[0] == num[2]);

        if(triangulo){
            System.out.println("S");
        } else{
            System.out.println("N");
        }

        entrada.close();
    }
}