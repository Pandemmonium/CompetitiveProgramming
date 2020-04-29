import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        int layers = c.nextInt();

        if(layers == 1) {
            System.out.println("I hate it");
        } else {
            System.out.print("I hate ");
            for(int i=0; i<layers-1; i++) {
                System.out.print("that ");
                if(i % 2 != 0) {
                    System.out.print("I hate ");
                } else {
                    System.out.print("I love ");
                }
            }
        System.out.println("it");
        }
    }
}