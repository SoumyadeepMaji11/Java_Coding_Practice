import java.util.*;
public class q3 {
    public static void main(String[] Args){
          String str = "Hello hello how are you ? are you good ?";

          Arrays.stream(str.split(" "))
          .map(w -> {
            StringBuilder sb = new StringBuilder(w);
            return sb.reverse();
          }).forEach(w -> System.out.print(w + " "));

    }
}
