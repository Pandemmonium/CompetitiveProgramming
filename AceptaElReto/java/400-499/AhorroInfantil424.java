import java.util.Scanner;

public class AhorroInfantil424 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int total = 0;
        int max = 0;

        int casos = c.nextInt();

        while(casos != 0) {
            for(int i=0; i<casos; i++) {
                int num = c.nextInt();
                if(num > 0) {
                    total += num;
                    if(total > max) {
                        max = total;
                    }
                } else {
                    total += num;
                }
            }
            System.out.println(total + " " + max);
            casos = c.nextInt();
            total = 0;
            max = 0;
        }
    }
}