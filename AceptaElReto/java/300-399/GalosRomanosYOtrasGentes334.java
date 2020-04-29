/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galos;

import java.util.Scanner;

/**
 *
 * @author NekoritoX
 */
public class GalosRomanosYOtrasGentes334 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int casos;
        String subNombre;
        Scanner leer=new Scanner(System.in);
        String nombre;
        String gentilicio="";
        int i=0;
        String[] terminaciones={"IX","US","IC","AS","AF","IS","EZ","A"};
        String[] gentilicios={"GALO","ROMANO","GODO","GRIEGO","NORMANDO","BRETON","HISPANO","INDIO"};
        casos=leer.nextInt();
        leer.nextLine();
        while(i<casos){
           int numeroGentilicios=0;
           
           nombre=leer.nextLine().toUpperCase();
           
            for (int j = 0; j < terminaciones.length; j++) {
                //Calculamos el tamaño de terminaciones[j];
               if(nombre.length()>=terminaciones[j].length()){
                int tamT=terminaciones[j].length();
                int charInicio=nombre.length()-tamT;
                subNombre=nombre.substring(charInicio);
                if(subNombre.equals("UM")){
                    subNombre="US";
                }
                else if(subNombre.equals("OS")||subNombre.equals("AX")){
                    subNombre="IS";
                }
                if(subNombre.equals(terminaciones[j])){
                    gentilicio=gentilicios[j];
                    numeroGentilicios++;
                }
                
                }
            }
            if(nombre.length()>=3){
            subNombre=nombre.substring(0, 3);
            if(subNombre.equals("MAC"))
            {
            numeroGentilicios++;
            gentilicio="PICTO";
            }
            }
            
            if(numeroGentilicios==0){
                System.out.println("PLUS ULTRA");
            }
            else if(numeroGentilicios>1){
                System.out.println("MULATO");
            }
            else{
                System.out.println(gentilicio);
            }
                i++;
            }
            }
        }
    
    

