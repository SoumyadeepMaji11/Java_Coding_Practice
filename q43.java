import java.util.*;
import java.util.stream.Collectors;
public class q43 {
    
    public static void main(String[] Args){

        int arr[] = {1,2,3,1,2,5,6,7,4,4,8};

        Map<Integer,Long> freq = Arrays.stream(arr).boxed()
        .collect(Collectors.groupingBy(
            n -> n,Collectors.counting()
        ));

        System.out.println(freq);

        List<Integer> result = new ArrayList<Integer>();

        for(Map.Entry<Integer,Long> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                result.add(entry.getKey());
            }
        }

        System.out.println(result);

    }

}
