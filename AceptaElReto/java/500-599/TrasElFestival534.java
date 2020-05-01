import java.util.Arrays;
import java.util.Scanner;

public class TrasElFestival534 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        int casos = c.nextInt();
        while(casos != 0) {
            int diff = 0;
            int[] lista = new int[casos];
            for(int i=0; i<casos; i++) {
                lista[i] = c.nextInt();
            }
            Arrays.sort(lista);

            for(int i=0; i<lista.length-1; i+=2) {
                if((lista[i+1] - lista[i]) > diff) {
                    diff = lista[i+1] - lista[i];
                }
            }
            System.out.println(diff);
            casos = c.nextInt();
        }
    }
}