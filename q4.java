import java.util.Arrays;

public class q4 {
    public static void main(String[] Arga) {
        String str = "Hello how are you ?";

        Arrays.stream(str.split(" "))
                .filter(w -> w.startsWith("h") || w.startsWith("H"))
                .forEach(System.out::println);
    }
}
