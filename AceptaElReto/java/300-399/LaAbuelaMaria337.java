package abuelamaria;

import java.util.Scanner;
public class LaAbuelaMaria337 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int casos = leer.nextInt();
        String[] respuesta = new String[casos];
        
        for(int j=0; j < casos; j++){
            int[] arriba = new int[6];
            int[] abajo = new int[6];
            boolean verdad = true;
            int bajo = abajo.length-1;

            for(int i=0; i < arriba.length; i++){
                arriba[i] = leer.nextInt();
            }
            for(int i=0; i < abajo.length; i++){
                abajo[i] = leer.nextInt();
            }
            
            int suma = arriba[0] + abajo[0];
            
            for(int i=1; i < arriba.length && verdad; i++,bajo--){
                if(arriba[i] + abajo[i] != suma){
                    verdad = false;
                }
            }
            
            if(verdad){
                respuesta[j] = "SI";
            }else{
                respuesta[j] = "NO";
            }
        }
        
        for(int i=0; i < casos; i++){
            System.out.println(respuesta[i]);
        }
    }
}
