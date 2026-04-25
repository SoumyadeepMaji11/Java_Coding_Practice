import java.util.*;

public class q48 {

    public static void main(String[] Args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int evenSum = 0, oddSum = 0;

        for (int element : arr) {
            if (element % 2 == 0) {
                evenSum = evenSum + element;
            } else {
                oddSum = oddSum + element;
            }
        }

        System.out.println("Sum of Even Numbers : " + evenSum);
        System.out.println("Sum of Odd Numbers : " + oddSum);

        int eSum = arr.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        int oSum = arr.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();

        System.out.println("Sum of Even Numbers : " + eSum);
        System.out.println("Sum of Odd Numbers : " + oSum);
    }

}
