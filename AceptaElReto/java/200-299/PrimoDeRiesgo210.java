import java.util.Scanner;

public class PrimoDeRiesgo210 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        int casos = c.nextInt();
        c.nextLine();

        for(int i=0; i<casos; i++) {

            boolean continua = true;
            int num = 0;
            String cadena = c.nextLine();
            char[] letras = cadena.toCharArray();

            //Sumar los valores de cada letra
            for(int j=0; j<letras.length; j++) {
                num += letras[j];
            }
            num--;

            while(continua) {

                if(esPrimo(num)) {
                    continua = false;
                } else {
                    num--;
                }  

            }

            System.out.println(num);
        }
    }

    //Averiguar si numero es primo
    public static boolean esPrimo(int num) {
        boolean resul = true;
        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                resul = false;
                break;
            }
        }
        return resul;
    }
}