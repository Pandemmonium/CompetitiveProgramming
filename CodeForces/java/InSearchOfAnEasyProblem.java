import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] agrs) {
        Scanner c = new Scanner(System.in);
        
        int n = c.nextInt();
        boolean isHard = false;

        for(int i=0; i<n; i++) {
            int k = c.nextInt();
            if(k == 1) {
                isHard = true;
            }
        }

        if(isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}