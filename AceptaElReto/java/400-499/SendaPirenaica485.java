import java.util.Scanner;

public class SendaPirenaica485 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int suma = 0;

        int etapa = lector.nextInt(); // ETAPAS QUE HAY QUE HACER

        while (etapa != 0) {
            int[] tramo = new int[etapa];

            for (int i = 0; i < tramo.length; i++) { // GUARDO TODAS LAS DISTANCIAS
                tramo[i] = lector.nextInt();
                suma += tramo[i];
            }

            System.out.print(suma);

            for (int i = 0; i < etapa - 1; i++) {
                suma -= tramo[i];
                System.out.print(" " + suma);
            }
            suma = 0; // REINICIO VARIABLES PARA EL SIGUENTE CASO
            System.out.println();
            etapa = lector.nextInt();
        }
    }
}