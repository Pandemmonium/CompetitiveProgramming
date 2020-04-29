import java.util.Scanner;
public class DoubleDecker321 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);

        int repite=lector.nextInt();

        for(int i=0; i<repite; i++){
            boolean continua=true;
            int superior=0;
            int inferior=0;
            int num=0;

            int entradaSuperior=lector.nextInt();
            int entradaInferior=lector.nextInt();


            while(continua){
                if(entradaSuperior==superior && entradaInferior==inferior) {
                    num++;
                    continua=false;
                } else if(inferior==0){
                    inferior=(superior+inferior)+1;
                    superior=0;
                    num++;
                } else {
                    inferior--;
                    superior++;
                    num++;
                }
            }
            System.out.println(num);
        }
        
    }
}