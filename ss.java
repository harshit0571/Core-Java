interface StringFunction {
    String run(String str);
}

public class lambdaExpression {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
// 1.Write a lambda expression that takes two integers as parameters and returns
// their sum.
// 2.Write a lambda expression to sort a list of integers in ascending order.
// 3.Given a list of integers, use a lambda expression to calculate the sum of
// all even numbers.
// 4.Write a lambda expression to find the maximum value in a list of integers.
// 5.Write a lambda expression to convert a list of strings into a single
// concatenated string.