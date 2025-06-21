    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int C;

            C = entrada.nextInt();
            entrada.nextLine();

            for (int i = 0; i < C; i++)
            {
                String nomes = entrada.next();
                int newtons = entrada.nextInt();


                if(nomes.equals("Thor"))
                {
                    System.out.println("Y");
                }else
                {
                    System.out.println("N");
                }

            }


            entrada.close();
        }
    }