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

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int k=bit(n);
        System.out.println(k);
        
        
    }
}
