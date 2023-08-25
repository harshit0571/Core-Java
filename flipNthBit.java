// Online Java Compiler 
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int k=inp.nextInt();
        
        String s=Integer.toBinaryString(n);
        
                    System.out.println(s);
                    
        char[] arr=s.toCharArray();            

        for(int i=arr.length-1;i>=0;i--){
            if(arr.length-i ==k){
                if(arr[i]=='1'){
                    arr[i]='0';
                }
                else{
                    arr[i]='1';
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
        
    }
    
    // n=5
    // 1 2 3 4 5
    // 1 2 3 5
    // 11
    
    
    
    
}
