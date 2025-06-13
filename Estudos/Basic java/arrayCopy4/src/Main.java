import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] palavras = {
                "Café", "bola", "Papai Noel", "Jogador",
                "Teclado", "bola", "Bola", "Andar", "Arroz"
        };

        String[] copiaPalavra = new String[7];
        System.arraycopy(palavras, 0, copiaPalavra, 0, 7);

        for (String pal : copiaPalavra) {
            System.out.println(pal + " ");
        }

        String[] trocaPalavra = new String[8];

        System.out.print("Digite uma palavra: ");
        String palavra = entrada.nextLine();

        for (int i = 0; i < copiaPalavra.length; i++) {
            if (palavra.equals(copiaPalavra[i])) {
                trocaPalavra[i] = palavra;
            }
        }

        for (String lista : trocaPalavra) {
            if(lista != null) {
                System.out.println(lista + " ");
            }
        }

        entrada.close();
    }
}