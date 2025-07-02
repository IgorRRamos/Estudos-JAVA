import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int v = entrada.nextInt();
        int dividendo, resto = 0;
        ArrayList<String> hex = new ArrayList<>();

        dividendo = v;
        if (v > 15) {
            while (dividendo > 15) {
                resto = dividendo % 16;
                if (resto == 10) {
                    hex.add("A");
                } else if (resto == 11) {
                    hex.add("B");
                } else if (resto == 12) {
                    hex.add("C");
                } else if (resto == 13) {
                    hex.add("D");
                } else if (resto == 14) {
                    hex.add("E");
                } else if (resto == 15) {
                    hex.add("F");
                }
                dividendo = dividendo / 16;
            }
        }

        if (dividendo == 10) {
            System.out.print("A");
        } else if (dividendo == 11) {
            System.out.print("B");
        } else if (dividendo == 12) {
            System.out.print("C");
        } else if (dividendo == 13) {
            System.out.print("D");
        } else if (dividendo == 14) {
            System.out.print("E");
        } else if (dividendo == 15) {
            System.out.print("F");
        } else if (dividendo < 10 && dividendo > 0) {
            System.out.print(dividendo);
        }

        if (hex.isEmpty() && resto > 0) {
                if (resto == 10) {
                    System.out.print("A");
                } else if (resto == 11) {
                    System.out.print("B");
                } else if (resto == 12) {
                    System.out.print("C");
                } else if (resto == 13) {
                    System.out.print("D");
                } else if (resto == 14) {
                    System.out.print("E");
                } else if (resto == 15) {
                    System.out.print("F");
                } else if (resto < 10 && resto > 0) {
                    System.out.print(resto);
                }
        } else {
            for (String lista : hex) {
                System.out.print(lista);
            }
        }
        System.out.println();
        entrada.close();
    }
}

/*

10	A
11	B
12	C
13	D
14	E
15	F

 */