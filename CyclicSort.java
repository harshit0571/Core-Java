import java.util.*;

class HelloWorld{
   static int findMaxIndex(int[] arr, int end){
        int a=arr[0];
        int ans=0;
        for(int i=0; i<end;i++){
            if(arr[i]>a){
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int last=n-i;
            int index=findMaxIndex(arr, last);
                        System.out.println(index+" ");

            int temp=arr[n-i-1];
            arr[n-i-1]=arr[index];
            arr[index]=temp;

        }
        
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }   
}
