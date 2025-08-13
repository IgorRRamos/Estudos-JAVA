import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static class Arquivo{
        public String ler(String caminhoArquivo) throws Exception{
            String conteudo = "";

            try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
                String linha = leitor.readLine();

                while (linha != null){
                    conteudo += linha;
                    linha = leitor.readLine();

                    if (linha != null){
                        conteudo += "\n";
                    }
                }

            }catch (Exception erro){
                throw erro;
            }


        return conteudo;
        }
    }

    public static void main(String[] args) {
        String caminhoArquivo = "/home/igor/Documents/Estudos-JAVA/Diversos/Arquivos4/nomes.txt";

        Arquivo arquivo = new Arquivo();

        try{
            String resultado = arquivo.ler(caminhoArquivo);
            System.out.println(resultado);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro 10");
        }

    }
}