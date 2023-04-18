class Student extends Marks {
    static int id;
    private static String name;

    public Student() {

    }

    public Student(int i, String n) {
        id = i;
        name = n;
    }

    public static String getName() {
        return name;
    }

    public static void main() {
        System.out.println("Student id: " + id);
        System.out.println("Student name: " + name);
    }
};

class Marks {
    private static int mark = 55;

    public void getmarks() {
        System.out.println(mark);
    }
}

public class Classes {
    public static void main(String args[]) {
        Student obj1 = new Student(5, "harshit");
        obj1.main();
        obj1.getmarks();
    }
}
