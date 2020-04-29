import java.util.Scanner;

public class LosCalcetinesDeIanMalcolm482 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String linea="";
        char calcetin;
        int contN=0;
        int contG=0;

        linea = lector.nextLine();
        while(!linea.equals(".")) {
            contN=0;
            contG=0;
            
            for(int i=0; i<linea.length()-2; i=i+2) {
                calcetin = linea.charAt(i);
                if(calcetin=='N') {
                    contN++;
                } else {
                    contG++;
                }
            }

            if((contN % 2 == 0) && (contG % 2 == 0)) {
                System.out.println("EMPAREJADOS");
            } else if((contN%2 != 0) && (contG%2 == 0)) {
                System.out.println("NEGRO SOLITARIO");
            } else if((contN%2 == 0) && (contG%2 != 0)) {
                System.out.println("GRIS SOLITARIO");
            } else {
                System.out.println("PAREJA MIXTA");
            }
            
            linea = lector.nextLine();
        }
           
    }
}