import java.util.Scanner;

public class CuadradosConCerillas340 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int repite=lector.nextInt();
        int filas=0;
        int columnas=0;
        int total=0;
        int primera=0;

        for(int i=0; i<repite; i++){
            filas=lector.nextInt();
            columnas=lector.nextInt();

            primera= (filas*4)-(filas-1);
            total= (primera-filas)*(columnas-1);
            System.out.println(total+primera);

        }       
    }
}