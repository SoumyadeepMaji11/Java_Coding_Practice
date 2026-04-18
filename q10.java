import java.util.*;

public class q10 {

    public static void main(String[] Args) {
        String str = " Hello World";

        String vowels = str.replaceAll("[^aeiouAEIOU]", "");

        System.out.println(vowels.length());

        long numberOfVowels = Arrays.stream(str.toLowerCase().split(""))
                .filter(a -> a.startsWith("a") || a.startsWith("e") || a.startsWith("i") || a.startsWith("o")
                        || a.startsWith("u"))
                .count();

        System.out.println(numberOfVowels);
    }
}
