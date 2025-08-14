import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String caminhoArquivo = "/home/igor/Documents/Estudos-JAVA/Diversos/arquivo5/nomes.txt";

        System.out.print("Digite um nome: ");
        String nome = entrada.nextLine();

        int contador = 0;

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = leitor.readLine();

            while (linha != null) {
                if (nome.equals(linha)) {
                    contador+=1;
                }
                linha = leitor.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Nomes iguais encontrados: " + contador);

        entrada.close();
    }
}