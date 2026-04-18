public class q8 {

    public static void main(String[] Args){
        String str = " Hello World";
        
        StringBuilder sb = new StringBuilder(str).reverse();

        if(str.equals(sb.toString())){
            System.out.println("Palindrome");
        }
            else{
                System.out.println("Not a palindrome");
            }
        }

    }

