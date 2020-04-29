import java.util.Scanner;
public class ConstanteDeKaprekar100 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int instancias=0;
        boolean continua=true;  

        int repiteVeces = lector.nextInt();
        for(int i=0; i<repiteVeces; i++){
            instancias=0;
            continua=true;
            int resul=0; 
            int num = lector.nextInt();
            if(noEsRepDigits(num)) {

                while(continua) {
                    instancias++;

                    int[] arrayNum=convertirEnArray(num);
                    resul=(convertirYOrdenarMayor(arrayNum)-convertirYOrdenarMenor(arrayNum));

                    if(resul==6174) {
                        continua=false;
                    }

                    num=resul;
                }
                System.out.println(instancias); 
            }
        }
    } 

    public static boolean noEsRepDigits(int num) {
        boolean resulComprueba=true;

        switch(num) {
            case 0000:
            case 1111:
            case 2222:
            case 3333:
            case 4444:
            case 5555:
            case 6666:
            case 7777:
            case 8888:
            case 9999:
                System.out.println(8);
                resulComprueba=false;
                break;
            case 6174:
                System.out.println(0);
                resulComprueba=false;
                break;
        }
        return resulComprueba;
    }


    public static int[] convertirEnArray(int num) {

        int[] resul = new int[4];

        for(int i=0; i<4; i++) {
            resul[i]=num%10;
            num=(Math.abs(num/10));
        }
        return resul;
    }


    public static int convertirYOrdenarMayor(int[] pool) {
        int max;
        int cambio;

        for(int i=0; i<pool.length-1; i++) {
            max=pool[i];

            for(int j=i; j<pool.length; j++) {

                if(max<pool[j]) {
                    cambio=pool[j];
                    pool[j]=max;
                    max=cambio;
                }
            }
            pool[i]=max;
        }
        int resul= convertirEnInt(pool);
        return resul;
    }


    public static int convertirYOrdenarMenor(int[] pool) {
        int resul=0;
        int cambio;

            cambio=pool[3];
            pool[3]=pool[0];
            pool[0]=cambio;
            cambio=pool[2];
            pool[2]=pool[1];
            pool[1]=cambio;
        resul= convertirEnInt(pool);
        return resul;

    }

    public static int convertirEnInt(int[] pool) {
        int resul=0;
        int desplazo=1;

            for(int i=pool.length-1; i>=0; i--) {
                resul=resul + pool[i]*desplazo;
                desplazo=desplazo*10;
            }

        return resul;
    }
}