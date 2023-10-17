import java.util.*;

public class LL {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int S = inp.nextInt();
        int m = inp.nextInt();
        int n = inp.nextInt();

        int[] arr = new int[S];
        for (int i = 0; i < S; i++) {
            arr[i] = inp.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        // 1 2 3 4 5 6 7 8
        // 1 2 5 6
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if(flag==true){
                if(count<m){
                    list.add()
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
