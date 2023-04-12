import java.util.Scanner;  // Import the Scanner class

public class Voter {
    public static void main(String arg[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter age");
        int age=myObj.nextInt();
        if(age>=18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
