import java.util.*;

public class constructor {

    constructor() {
        System.out.println("1st");

    }

    constructor(int a) {
        this();
        System.out.println("2nd");
    }

    static {
        System.out.println("static block");
    }

    {
        System.out.println("non static");
    }

    constructor(int a, int b) {
        this(8);
        System.out.println("3rd");

    }

    public static void main(String args[]) {
        new constructor();

    }
}
