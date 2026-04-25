import java.util.*;
import java.util.stream.Collectors;

public class q11 {
    public static void main(String[] Args) {
        String str = "Hello World";

        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s2 = Arrays.stream(str.replace(" ", "").split(""))
                .filter(a -> !s1.add(a)).collect(Collectors.toSet());

        System.out.println(s2); //using stream

        s1.clear();
        s2.clear();
        
        for(String s : str.split("")){
            if(!s1.add(s)){
                s2.add(s);
            }
        }

        System.out.println(s2); //without using stream

    }
}
