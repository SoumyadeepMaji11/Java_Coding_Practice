import java.util.*;
import java.util.stream.Collectors;

public class q1 {
    public static void main(String[] Args){
        String str = "Hello hello how are you ? are you good ?";

        Map<String,Long> result = Arrays.stream(str.toLowerCase().split(" "))
        .collect(Collectors.groupingBy(
            w -> w,Collectors.counting()
        ));


        System.out.println(result);
    }
}
