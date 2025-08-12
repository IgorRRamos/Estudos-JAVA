public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "/home/igor/Documents/Estudos-JAVA/Diversos/Arquivos3/nomes.txt";
        Arquivo arquivo = new Arquivo();

        String resultado = arquivo.ler(caminhoArquivo);

        System.out.println(resultado);


    }
}