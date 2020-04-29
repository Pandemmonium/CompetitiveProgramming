import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ElAnuncioMasCaroDelAnio437 {
    public static void main(String[] args) {
        

        Scanner c = new Scanner(System.in);
        
        int casos = c.nextInt();
        c.nextLine();

        for(int i=0; i<casos; i++) {
            try {
                
                String campanadas = "23:00:00";
                String anuncioString = c.nextLine();
                SimpleDateFormat formateo = new SimpleDateFormat("HH:mm:ss");
                Date max = formateo.parse(campanadas);
                Date anuncio = formateo.parse(anuncioString);
                System.out.println(formateo.format(max.getTime() - anuncio.getTime()));
            } catch(Exception e) {}
        }
    }
}