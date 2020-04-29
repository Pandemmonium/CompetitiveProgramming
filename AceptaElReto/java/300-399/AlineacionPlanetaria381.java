import java.util.Scanner;

public class AlineacionPlanetaria381 {
    static Scanner lector = new Scanner(System.in);
    static int[] [] factores = new int[5] [70];

    public static void main(String[] args) {
        

        int planetas = lector.nextInt();
        while(planetas>=2 && planetas<=5) {
            mcm(planetas);
            resetArray();
            planetas = lector.nextInt();
        }
    }

    public static void mcm(int planetas) {
        int resul=1;
        int mayor=1;
        
        //Factoriza el numero en un array bidimensinal
        for(int i=0; i<planetas; i++) {
            
            int dia=lector.nextInt();
            for(int j=2; j<70; j++) {
                if(dia%j==0 && dia>1) {
                    factores[i][j]++;
                    dia=dia/j;
                    j=1;
                }
            }
        }

        //Quedarse con el mayor de cada factor
        for(int i=1; i<70; i++) {
            
            for(int j=0; j<planetas; j++) {
                if(factores[j][i]>=mayor && factores[j][i]>0) {
                    mayor=factores[j][i];
                }
            }
            if(mayor>0) {
                resul=resul*(int)Math.pow(i, mayor);
            }   
            mayor=0;
        }
        System.out.println(resul);
        
    }

    //Reseteamos el array para el siguiente caso
    public static void resetArray() {
        for(int i=0; i<5; i++){
            for(int j=0; j<70; j++) {
                factores[i][j]=0;
            }
        }
    }
}