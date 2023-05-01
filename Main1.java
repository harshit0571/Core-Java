import java.util.Scanner;

final class Complex {
    private double re, im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    Complex(Complex c) {
        System.out.println("Copy constructor called");
        re = c.re;
        im = c.im;
    }

    public String toString() {
        return "toString";
    }
}

class Main1 {
    public static void main(String[] args) {

        float a = 75f;
        float b = 65f;
        float c = 98f;
        float sum = ((a + b + c) / 300) * 100;
        System.out.println(String.format("%.2f", sum));
    }

}