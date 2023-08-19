// Online Java Compiler
// Use this editor to write, compile and run your Java code online



import java.util.*;
 class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        int temp=n;
        while(temp> 0){
            temp=temp/10;
            c++;
        }
        int ans=n;
        if(c%2==0){
            int[] arr=new int[c];
            c--;
            while(c>=0){
                arr[c]=n%10;
                n=n/10;
                c--;
            }
            int one=0;
            for(int i=0;i<arr.length/2;i++){
                one=one*10+arr[i];               
            }
            
            int two=0;
            for(int i=arr.length/2;i<arr.length;i++){
                two=two*10+arr[i];               
            }
            System.out.println(one+" "+two);            
            int sum=one+two;
            if(sum*sum == ans){
                System.out.println("yes");  
            }
            else{
                            System.out.println("no");
            }
                
        }
        else{
            System.out.println("no");

        }

        
    }
}
