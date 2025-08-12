import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "/home/igor/Documents/Estudos-JAVA/Diversos/arquivo/arquivo.txt";
        BufferedReader leitor = null;

        try {
            FileReader leitorArquivo = new FileReader(caminhoArquivo);
            leitor = new BufferedReader(leitorArquivo);

            leitor.readLine();
            String linha = leitor.readLine();
            System.out.println(linha);

        } catch (Exception erro) {
            System.out.println("Deu ruim!");
            System.out.println(erro.getMessage());
        }

    }
}