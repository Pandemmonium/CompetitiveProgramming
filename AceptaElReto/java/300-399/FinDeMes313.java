import java.util.Scanner;

public class FinDeMes313 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int limite = lector.nextInt();

        for(int i=0; i<limite; i++) {
            int a=lector.nextInt();
            int b=lector.nextInt();
            int resul=a+b;

            if(resul>=0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}