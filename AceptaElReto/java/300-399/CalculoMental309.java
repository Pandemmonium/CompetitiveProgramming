import java.util.Scanner;
import java.util.ArrayList;

public class CalculoMental309 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Integer> resultados = new ArrayList<Integer>();
        int num, num2;
        char signo = ' ';

        int casos = lector.nextInt();
        for(int i=0; i<casos; i++) {

            num = lector.nextInt();
            signo = lector.next().charAt(0);
            while(signo != '.') {

                if(signo == '+') {
                    num2 = lector.nextInt();
                    num += num2;
                    System.out.print(num);

                } else if(signo == '-') {
                    num2 = lector.nextInt();
                    num -= num2;
                    System.out.print(num);
                }
                signo = lector.next().charAt(0);
                if(signo != '.') {
                    System.out.print("," + " ");
                }
            }
            System.out.println();
            signo = ' ';
            
        }
    }
}