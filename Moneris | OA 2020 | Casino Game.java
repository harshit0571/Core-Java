// Online Java Compiler
// Use this editor to write, compile and run your Java code online



import java.util.*;
 class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        if(k==0){
            int ans=n-1;
            System.out.println(ans);
        }
        else{
            int count=0;
            while(n>1){
                if(n%2==0 && k>=1){
                    n=n/2;
                    count++;
                    k--;
                }
                else{
                    n=n-1;
                    count++;
                }
                System.out.println(n);
            }
            System.out.println(count);
        }
    }
}
