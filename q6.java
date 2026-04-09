import java.util.Arrays;
import java.util.Comparator;

public class q6 {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 1, 9, 8, 5, 4 };

        int result = Arrays.stream(arr).distinct().boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(0);

        System.out.println(result);
    }
}
