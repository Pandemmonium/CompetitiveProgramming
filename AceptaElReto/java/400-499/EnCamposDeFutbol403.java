import java.util.Scanner;

public class EnCamposDeFutbol403 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int minCampo = 90*45;
        int maxCampo = 120*90;

        int casos = lector.nextInt();
        for(int i=0; i<casos; i++) {
            int metros = lector.nextInt();
            int estimacion = lector.nextInt();
            if(metros>=minCampo*estimacion && metros<=maxCampo*estimacion) {
                System.out.println("SI");
            } else{
                System.out.println("NO");
            }
        }
    }
}