import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> myStack = new Stack<>();
        myStack.push('X');
        myStack.push('Y');
        myStack.push('Z');
        char element = myStack.get(0);
        System.out.println(element);
    }
}