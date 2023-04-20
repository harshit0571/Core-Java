
abstract class cat {
    static void func1() {
        System.out.println("1");
    }
}

class dog extends cat {
    static void func2() {
        System.out.println("2");
    }
}

class animal extends cat {
    static void func3() {
        System.out.println("3");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        animal.func1();
    }
}
