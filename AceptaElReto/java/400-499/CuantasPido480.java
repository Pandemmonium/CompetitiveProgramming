import java.util.Scanner;

public class CuantasPido480 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int repiteVeces = lector.nextInt();

        for(int i=0; i<repiteVeces; i++) {

            int restantes=0;
            int cont=0;
            int totalUvas = lector.nextInt();
            int malas = lector.nextInt();
            int buenas = lector.nextInt();

            int grupos = totalUvas/buenas;
            int resto=totalUvas%buenas;
            while(cont<malas && resto>0) {
                cont++;
                restantes ++;
                resto--;
            }
            malas = grupos*malas;
            System.out.println(malas+restantes);
        }

    }
}