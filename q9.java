public class q9 {

    public void isPrime(int n) {
        int count = 0;
        if (n == 0 || n == 1) {
            System.out.println("Not Prime number");
        }

        if (n >= 2) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
        }

        if (count > 1) {
            System.out.println("Not a prime number");
        } else {
            System.out.println("is Prime number");
        }
    }

    public void isArmstrong(int n) {
        int initialNumber = n;
        double sum = 0;
        while (n > 0) {
            int mod = n % 10;
            sum = sum + Math.pow(mod, 3);
            n = n / 10;
        }

        if (sum == initialNumber) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a Armstrong number");
        }
    }

    public void isPalindrome(int n) {
        int initialNumber = n;
        int sum = 0;
        while (n > 0) {
            int mod = n % 10;
            sum = sum * 10 + mod;
            n = n / 10;
        }

        if (sum == initialNumber) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("not a Palindrome");
        }
    }


    public static void main(String[] Args) {
        int num = 153;

        q9 obj = new q9();
        obj.isPrime(num);
        obj.isArmstrong(num);
        obj.isPalindrome(num);
    }

}
