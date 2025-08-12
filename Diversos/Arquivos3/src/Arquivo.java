import java.io.BufferedReader;
import java.io.FileReader;

public class Arquivo {
    public String ler(String caminhoArquivo){
        String conteudo= "";

        try(BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha = leitor.readLine();
            while(linha != null){
                conteudo += linha;
                linha = leitor.readLine();

                if(linha != null){
                    conteudo+= "\n";
                }
            }
        } catch (Exception erro){
            System.out.println("Deu muito ruim");
            System.out.println(erro.getMessage());
        }
    return conteudo;
    }
}
