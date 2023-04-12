import java.util.Scanner;  // Import the Scanner class

public class hello {
  static void main(int n){
    int x;
  }
  public static void main(String[] args) {
    // int a=10, b=20;
    // int sum=a+b;
    // System.out.println(sum);
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter nos.");

    int one = myObj.nextInt();
    int two=myObj.nextInt();
    int sum=one+two;
      // Read user input
    System.out.println("sum is " + sum);  // Output user input
    // for(int i=0;i<1000;i++){
    //     System.out.println("hello");
    // }
  }
}