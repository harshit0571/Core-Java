import java.util.Scanner;

//write a java program to print factorial of a number till ten
//create a mini calc in always
// a2 + 2ab+b2
public class _12april {
    public static int fact(int n){
        int sum=1;
        while (n>0){
            sum=sum*n;
            n--;
        }
        return sum;
    }
    public static int equation(int n, int m){
        int sum=0;
        sum=sum+n*n+m*m+2*n*m;
        return sum;
    }
    public static void calc(){
        Scanner inp=new Scanner(System.in);
        System.out.println("+: for addition \n -: for subtraction \n *: for multiplication \n S: simple interest");

        char ch= inp.next().charAt(0);
        int n,n2;
        switch (ch){
            case '+':
                n=inp.nextInt();
                n2=inp.nextInt();
                System.out.println(n+n2);
                break;
            case '-':
                n=inp.nextInt();
                n2=inp.nextInt();
                System.out.println(n-n2);
                break;
            case '*':
                n=inp.nextInt();
                n2=inp.nextInt();
                System.out.println(n*n2);
                break;
            case '/':
                n=inp.nextInt();
                n2=inp.nextInt();
                System.out.println(n/n2);
                break;
            case 'S':
                int p=inp.nextInt();
                int r=inp.nextInt();
                int t=inp.nextInt();
                float si=(float) (p*r*t)/100;
                System.out.println("SI is : "+ si);


        }
    }


    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
//        int n=input.nextInt();
//        int f=fact(n);
//        System.out.println("factorial of " + n +" is "+f);
//        int n1=input.nextInt();
//        int n2=input.nextInt();
//        int eq=equation(n1,n2);
//        System.out.println("the quadratic soln is : "+ eq);
        calc();



    }
};