import java.util.Scanner;

public class Day6 {
    static int c = 0;

    private Day6() {
        System.out.println("c = " + c);
    }

    static Day6 c() {
        // if(c++ <=0){
        // return new Day6();
        // }
        // else{
        // return null;
        // }
        return c++ <= 0 ? new Day6() : null;
    }

    static Day6 c(Day6 w) {
        return w.c++ == 1 ? new Day6() : null;
    }

    public static void main(String[] args) {
        Day6 w1 = c();
        System.out.println(w1);
        Day6 w2 = c(w1);
        System.out.println("w2--->" + c);
        System.out.println("w2" + w2);
        Day6 w3 = c(w2);
        System.out.println("w2--->" + c);
        System.out.println("w2" + w3);
        Day6 w4 = c(w3);
        System.out.println("w2--->" + c);
        System.out.println("w2" + w3);
    }

}
