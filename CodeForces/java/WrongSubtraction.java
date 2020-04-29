import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        int times = s.nextInt();

        for(int i=0; i<times; i++) {
            if(num % 10 != 0){
                num -= 1;
            }else {
                num /= 10;
            }
        }
        System.out.println(num);
    }
}