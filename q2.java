import java.util.*;
import java.util.stream.Collectors;

public class q2 {

    public static void main(String[] Args) {
        String str = "Hello World";

        Map<String, Long> result = Arrays.stream(str.replace(" ", "").split(""))
                .collect(Collectors.groupingBy(
                        a -> a, Collectors.counting()));

        System.out.println(result);

    }
}
