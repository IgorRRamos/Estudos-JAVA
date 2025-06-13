public class Main {
    public static void main(String[] args) {
        String[] palavras = {
                "Café", "Refrigerante", "Papai Noel", "Jogador",
                "Teclado", "Retrato", "Bola", "Andar", "Arroz"
        };

        String[] copiaPalavra = new String[7];

        System.arraycopy(palavras, 2, copiaPalavra, 0, 7);
        for(String pal : copiaPalavra){
            System.out.println(pal + " ");
        }

    }
}