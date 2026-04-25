public class q12 {
 public static void main(String[] Args){
    int[] arr = {-7,-1,1,2,5,6,8,3,2};

    int min = arr[0], max = arr[0];

    for(int i : arr){
        if(i > max){
            max = i;
        }

        if(i < min){
            min = i;
        }
    }

    System.out.println("Max : " + max + " " + "Min : " + min);
 }   
}
