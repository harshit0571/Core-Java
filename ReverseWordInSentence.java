import java.util.*;


class HelloWorld {
    static int bit(int n){
        int sum=0;
        int[] arr=new int[1000];
        int i=0;
        while(n>0){
            arr[i]=n%2;
            n=n/2;
            i++;
        }
        
        
        for(int j=i-1;j>=0;j--){
            sum=sum*10+arr[j];
        }
        
        return sum;
        
    }
    
    static int hcf(int n, int k){
        int i=n>k ?k : n;
        while(i>0){
            if(n%i == 0 && k%i==0){
                return i;
            }
            i--;
        }
        return i;
    }
    
    static void reverseWord(String s){
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            arr[i]=sb.reverse().toString();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String n=inp.nextLine();
        reverseWord(n);
        
        
    }
}
