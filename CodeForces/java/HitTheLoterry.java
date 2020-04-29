import java.util.Scanner;

public class HitTheLoterry {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        int money = c.nextInt();
        int bills = 0;

        while(money >= 100) {
            bills++;
            money -= 100;
        }

        while(money >= 20) {
            bills++;
            money -= 20;
        }

        while(money >= 10) {
            bills++;
            money -= 10;
        }

        while(money >= 5) {
            bills++;
            money -= 5;
        }

        while(money >= 1) {
            bills++;
            money -= 1;
        }

        System.out.println(bills);
    }
}