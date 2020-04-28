import java.util.HashMap;
import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap<>();
        list.put("Tetrahedron", 4);
        list.put("Cube", 6);
        list.put("Octahedron", 8);
        list.put("Dodecahedron", 12);
        list.put("Icosahedron", 20);

        int resul = 0;

        int n = s.nextInt();
        s.nextLine();

        for(int i=0; i<n; i++) {
            String input = s.nextLine();
            resul += list.get(input);
        }

        System.out.println(resul);
    }
}