import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nomes =  new ArrayList<>();

        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Antonio");
        nomes.add("Juanito");
        nomes.add("Maria");

        for(String lista : nomes){
            System.out.println(lista);
        }

    }
}