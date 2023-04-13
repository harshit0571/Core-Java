import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_ {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<Integer>();
        // arr.add(1);
        // arr.add(2);
        Integer n=5;
        for (int index = 0; index < n; index++) {
            int n1=inp.nextInt();
            arr.add(n1);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        
    }
}

