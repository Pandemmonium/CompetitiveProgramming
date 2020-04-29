import java.util.Scanner;

public class PiramideDeCanicas335 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int casos = lector.nextInt();

        for(int i=0; i<casos; i++) {

            long total=0;
            long base = 0;
            long altura = lector.nextInt();

            for(int j=1; j<=altura; j++) {
                base += j;
                total += base;
            }
            
            System.out.println(total);
        }
    }
}