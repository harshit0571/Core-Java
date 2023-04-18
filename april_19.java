class First {

    private First() {
        System.out.println("First function");
    }

    static void func2() {
        First obj1 = new First();
        obj1.func2();
        System.out.println("First function");
    }
}

public class april_19 {
    public static void main(String args[]) {
        First.func2();

    }
}
