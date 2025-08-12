import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "/home/igor/Documents/Estudos-JAVA/Diversos/arquivo2/nomes.txt";

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = leitor.readLine();

            while (linha != null){
                System.out.println(linha);
                linha = leitor.readLine();
            }

        } catch (Exception erro) {
            System.out.println("Deu ruim");
            System.out.println(erro.getMessage());
        }

    }
}