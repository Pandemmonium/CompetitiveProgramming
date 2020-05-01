import java.util.Scanner;

public class TensionDescompensada506 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        int casos = c.nextInt();

        for(int i=0; i<casos; i++) {

            int num1 = c.nextInt();
            String barra = c.next();
            int num2 = c.nextInt();
            
            if(num1 < num2) {
                System.out.println("MAL");
            } else {
                System.out.println("BIEN");
            }

        }
        c.close();
    }
}