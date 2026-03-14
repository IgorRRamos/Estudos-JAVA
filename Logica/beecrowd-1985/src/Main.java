import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int produto, quantidade, casos, contador=0;
        int[] repetidos = new int[5];
        double total = 0;

        casos = teclado.nextInt();

        do{
            produto = teclado.nextInt();
            quantidade = teclado.nextInt();
            switch (produto) {
                case 1001:
                    if(repetidos[0] == 01) break;
                    total += quantidade * 1.50;
                    repetidos[0] = 01;
                    break;
                case 1002:
                    if(repetidos[2] == 02) break;
                    total += quantidade * 2.50;
                    repetidos[02] = 02;
                    break;
                case 1003:
                    if(repetidos[3] == 03) break;
                    total +=  quantidade * 3.50;
                    repetidos[03] = 03;
                    break;
                case 1004:
                    if(repetidos[4] == 04) break;
                    total += quantidade * 4.50;
                    repetidos[4] = 04;
                    break;
                case 1005:
                    if(repetidos[5] == 05) break;
                    total += quantidade * 5.50;
                    repetidos[5] = 05;
                    break;
            }
            contador++;
        }while(contador < casos);

        System.out.printf("%.2f\n", total);
    }
}