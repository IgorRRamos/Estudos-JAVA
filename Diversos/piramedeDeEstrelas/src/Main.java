public class Main {
    public static void main(String[] args) {
        String[] estrelas = new String[13];
        int crescente = 8, decrescente = 6;

        for (int i = 0; i < 13; i++) {
            estrelas[i] = "*";
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 13; j++) {
                if (j > decrescente && j < crescente) {
                    System.out.print(estrelas[i]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.printf("\n");
            crescente++;
            decrescente--;
        }

    }
}