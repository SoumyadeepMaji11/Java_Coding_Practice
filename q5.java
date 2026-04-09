import java.util.*;
import java.util.stream.Collectors;

public class q5 {

    public static void main(String[] Arga) {
        int[] arr = { 2, 3, 4, 5, 2, 3, 7, 8, 9 };

        Set<Integer> s = new HashSet<Integer>();
        
        Set<Integer> result = Arrays.stream(arr).boxed()
                .filter(n -> !s.add(n)).collect(Collectors.toSet());

        System.out.println(result);

    }
}
