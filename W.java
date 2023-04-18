public class W {
    static int c = 0;

    private W() {
        System.out.println("cc = " + c);
    }

    public static void main(String[] args) {
        W w1 = c();
        w1.c = 8;
        System.out.println(w1 + "d");
        W w2 = c(w1);
        System.out.println("w2--->" + c);
        System.out.println("w2" + w2);
        W w3 = c(w2);
        System.out.println("w2--->" + c);
        System.out.println("w2" + w3);
        W w4 = c(w3);
        System.out.println("w2--->" + c);
        System.out.println("w2" + w3);
    }

    static W c() {
        return c++ <= 0 ? new W() : null;
    }

    static W c(W w) {
        return w.c++ == 1 ? new W() : null;
    }
}