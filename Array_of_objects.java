class Student {
    int marks;
    String name;

    void setMarks(int a, String n) {
        marks = a;
        name = n;
    }

    void getMarks() {
        System.out.println(name + " " + marks);
    }
}

public class Array_of_objects {
    public static void main(String args[]) {
        Student[] arr = new Student[4];
        for (int i = 0; i < arr.length; i++) {
            Student temp = new Student();
            temp.setMarks(i + 2, "harshit" + i);
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].getMarks();
        }

    }
}
