abstract class animal {
    public abstract int func1();

    public void func() {
        System.out.println("dfdf");
    }
}

class farm extends animal {
    public int func1() {
        return 3;
    }
}

class Animals extends animal {
    public int func1() {
        return 1;
    }

    public void func2() {
        System.out.println("func2");
    }
}

public class abstract_class {
    public static void main(String args[]) {
        Animals obj1 = new Animals();
        System.out.println(obj1.func1());
        farm obj2 = new farm();
        System.out.println(obj2.func1());

    }
}
