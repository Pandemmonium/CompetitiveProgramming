import java.lang.reflect.Array;
import java.util.Scanner;

public class AjedrezAsistidoPorComputador481 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String columna = "hgfedcba";
        int[] fila = {1,2,3,4,5,6,7,8};

        int col=lector.nextInt();
        int fil=lector.nextInt();

        while(col>0 && fil>0){
            char resul=columna.charAt(col-1);
            System.out.println(resul + "" + fila[fil-1]);
            col=lector.nextInt();
            fil=lector.nextInt();
        }
    }
}