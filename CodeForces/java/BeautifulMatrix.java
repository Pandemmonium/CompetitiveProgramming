import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int column=0;
        int row=0;
        int result=0;
        boolean keepGoing = true;

        for(int i=0; i<matrix.length; i++) {

            for(int j=0; j<matrix.length && keepGoing; j++) {
                int temp = c.nextInt();
                
                if(temp != 0) {
                    row = i;
                    column = j;
                    keepGoing = false;
                } else {
                    matrix[i][j] = temp;
                }
            }
        }

        while(row != 2) {
            if(row > 2) {
                row--;
                result++;
            } else {
                row++;
                result++;
            }
        }

        while(column != 2) {
            if(column > 2) {
                column--;
                result++;
            } else {
                column++;
                result++;
            }
        }

        System.out.println(result);
    }
}