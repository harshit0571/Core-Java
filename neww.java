import java.util.Scanner;

public class neww {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        long count = 0;
        int i = 1;
        while (n > 0) {
            int a = n % 2;
            System.out.println(a);
            // count = count + a * i;
            i = i * 10;
            n = n / 2;
            System.out.println("n->" + n);
        }
        System.out.println(count);
    }

}

// adress sequencing- numerical controled memory and defination
// address sequencing video
// general , single , stack - explain , stack org- numerical diagram
// instruction format- three adress, two , zero , one, numerical x= a+b* eq from
// every address
// addressing mode - > shanu puttal youtube video, five types
// interupts- what is interupt all type- internal external
// risc cisc diff
// piplelining - defination, 4 intruction pipline diagram, hazard
// dma- explain , controler transformer
