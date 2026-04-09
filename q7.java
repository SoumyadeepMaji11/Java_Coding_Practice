import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class q7 {
    
    public static void main(String[] Args){
        List<Integer> lt = new ArrayList<>(Arrays.asList(1,2,4,5,6,2,8));

        Iterator<Integer> i = lt.iterator();
        
        while(i.hasNext()){
            int n = (int)i.next();
            System.out.println(n);
        }
    }
}
