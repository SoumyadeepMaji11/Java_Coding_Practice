import java.util.*;

public class q42 {

    public static void main(String[] Args) {

        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "Ball");
        mp.put(2, "Apple");
        mp.put(3, "Dog");
        mp.put(4, "Cat");
        
        System.out.println(mp);

        List<Map.Entry<Integer,String>> entries = new ArrayList<>(mp.entrySet());

        entries.sort(Map.Entry.comparingByValue(Comparator.naturalOrder()));

        System.out.println(entries);

    }

}
