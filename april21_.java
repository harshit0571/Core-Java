import java.util.ArrayList;

class happyNumber {

    public int digits(int n) {
        int sum_of_digits = 0;
        while (n > 0) {
            int i = n % 10;
            sum_of_digits = i * i;
            n = n / 10;
        }
        return sum_of_digits;
    }

    public boolean isIn(ArrayList<Integer> arr, int t) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == t) {
                return true;
            }
        }
        return false;
    }

    public void check_happy(int n) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int a;
        while(a=digits(n)){
            
        }
    }
}

class automorphic extends happyNumber {
    public int count(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println("count is " + count);
        return count;
    }

    // 890625
    public void check_automorphic(int n) {
        int temp = n;
        int sq = n * n;
        int sq1 = n;
        int c = count(n);
        int sum = 0;
        while (c > 0) {
            int i = sq % 10;
            sum = sum * 10 + i;
            sq = sq / 10;
            c--;
        }

        int sum2 = 0;
        while (sum > 0) {
            int i = sum % 10;
            sum2 = sum2 * 10 + i;
            sum = sum / 10;
        }
        System.out.println("sum is " + sum2);

        if (sum2 == sq1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

class neon extends automorphic {
    public void check_neon(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int i = n % 10;
            sum = sum + i;
            n = n / 10;
        }
        int a = sum * sum;
        if (a == temp) {
            System.out.println("it is neon number");
        } else {
            System.out.println("it is not a neon number");

        }
    }
}

class check extends neon {
    public void check() {

    }
}

public class april21_ extends neon {
    public static void main(String[] args) {
        check obj1 = new check();
        // obj1.check_neon(1);
        // obj1.check_automorphic(25);
        obj1.check_happy();
    }
}