import java.util.Scanner;

public class LasDimensionesDelPuzzle402 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();

        while(numero!=0) {

            int cont = (int)Math.sqrt(numero);

            while(numero % cont != 0) {
                cont--;
            }

            System.out.println(numero/cont);

            numero = lector.nextInt();

        }
    }
}