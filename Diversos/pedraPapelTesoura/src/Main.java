import java.util.Random;
import java.util.Scanner;

public class Main {

        public static void jogadas(String pal1, String pal2)
        {
            if(pal1.equals(pal2))
            {
                System.out.println("Empatou!!");
            }

            boolean player = (pal1.equals("Pedra") && (pal2.equals("tesoura"))
                          || (pal1.equals("Papel") && (pal2.equals("Pedra"))
                          || (pal1.equals("Tesoura") && (pal2.equals("Papel")))));
            if(player)
            {
                System.out.println("Vitoria do jogador!");
            }else{
                System.out.println("Vitoria do CPU!");
            }

        }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.println("------------------Pedra-Papel-Tesoura--------------------");
        System.out.println("1-Jogar");
        System.out.println("0-Sair");
        System.out.print("Digite sua escolha: ");
        int escolha = entrada.nextInt();
        entrada.nextLine();
        while(escolha != 0){

            System.out.print("Digite sua escolha: ");
            String playerChute = entrada.nextLine();

            String palCpu;
            int cpu = random.nextInt(3);
            if(cpu == 0){
                palCpu = "Pedra";
            }else if(cpu == 1){
                palCpu = "Papel";
            }else{
                palCpu = "Tesoura";
            }

            jogadas(playerChute, palCpu);

            System.out.println("------------------Pedra-Papel-Tesoura--------------------");
            System.out.println("1-Jogar");
            System.out.println("0-Sair");
            System.out.print("Digite sua escolha: ");
            escolha = entrada.nextInt();
            entrada.nextLine();
        }





        entrada.close();
    }
}