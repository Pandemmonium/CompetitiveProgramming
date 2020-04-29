import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        int bearA = c.nextInt();
        int bearB = c.nextInt();
        int years = 0;

        while (bearA <= bearB) {
            years ++;
            bearA *= 3;
            bearB *= 2;
        }
        System.out.println(years);

    }
}