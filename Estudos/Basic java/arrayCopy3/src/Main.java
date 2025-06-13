public class Main {
    public static void main(String[] args) {
        String[] palavras = {
                "Café", "Refrigerante", "Papai Noel", "Jogador",
                "Teclado", "Retrato", "Bola", "Andar", "Arroz"
        };
        String[] copiaPalavra = java.util.Arrays.copyOfRange(palavras, 1, 7);

        System.out.println(java.util.Arrays.toString(copiaPalavra));
    }
}