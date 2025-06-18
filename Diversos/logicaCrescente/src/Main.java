import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String[][] estrela = new String[12][12];

        for(int i=0;i<estrela.length; i++){
            for(int j=0;j<estrela[i].length; j++){
                estrela[i][j] = "*";
            }
        }
        int cont = 12;
        for(int i=0;i< estrela.length; i++){
            for(int j=0;j< estrela[i].length; j++){
                if(j > cont && j < i){
                    System.out.print(estrela[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
            cont--;
            System.out.printf("\n");
        }
    }
}