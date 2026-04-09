public class q15 {

    public static q15 INSTANCE;

    private q15() {
    }

    public static synchronized q15 getInstance() { //lazy implementation thread safe
        if (INSTANCE == null) {
            INSTANCE = new q15();
        }

        return INSTANCE;
    }

}

class q15_2 {

    public static q15_2 INSTANCE = new q15_2();

    private q15_2() {
    }

    public static synchronized q15_2 getInstance() { //eager implementation thread safe

        return INSTANCE;
    }

}