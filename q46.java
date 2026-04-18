
@FunctionalInterface
interface Calculation {
    public int calculator(int a, int b);
}

abstract class Print {

    public void print() {
        System.out.println("the result is :- ");
    }

    public void abstractClassMethodCalled() {
        System.out.println("Abstract Class");
    }

}

public class q46 extends Print {

    @Override
    public void abstractClassMethodCalled() {
        super.abstractClassMethodCalled(); // super can be used to call the method of abstract class 
        System.out.println("Main Class");

    }

    public static void main(String[] Args) {

        q46 obj = new q46();
        Calculation add = (a, b) -> a + b;

        obj.print();
        System.out.println(add.calculator(2, 3));

        obj.abstractClassMethodCalled();
    }

}
