
@FunctionalInterface
interface Calculation{
    public int calculator(int a, int b);
}

abstract class Print{

    public void print(){
        System.out.println("the result is :- ");
    }

}

public class q46 extends Print {

    public static void main(String[] Args){

        q46 obj = new q46();
        Calculation add = (a,b) -> a + b;

        obj.print();
        System.out.println(add.calculator(2,3));

    }
    
}