import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class InfinityGauntlet {
    public static void main(String[] args) {
        ArrayList<String> storage = new ArrayList<String>();
        HashMap<String, String> gems = new HashMap<>();
        gems.put("purple", "Power");
        gems.put("green" , "Time");
        gems.put("blue"  , "Space");
        gems.put("orange", "Soul");
        gems.put("red"   , "Reality");
        gems.put("yellow", "Mind");
        
        Scanner s = new Scanner(System.in);
        int takes = s.nextInt();
        s.nextLine();

        for(int i=0; i<takes; i++) {
            String color = s.nextLine();
            storage.add(color);
            String value = gems.remove(color);
        }

        System.out.println();
        System.out.println(6-storage.size());
        for(String i: gems.keySet()) {
            System.out.println(gems.get(i));
        }
        
    }
}