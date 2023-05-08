// // public class ExceptionHandling {
// // public static void main(String[] args) {

// // }
// // }
// import java.io.*;

// class Parent {
// void msg() {
// System.out.println("parent");
// }
// }

// public class ExceptionHandling extends Parent{

// void msg()throws IOException{
// System.out.println("Child");
// }
// public static void main(String args[]){
// Parent p=new ExceptionHandling();
// p.msg();
// }
// }
// Compile time error
// // exeption handling by method overriding

// import java.io.*;

// class Parent {
// void msg() {
// System.out.println("parent");
// }
// }

// class ExceptionHandling extends Parent {
// void msg() throws ArithmeticException {
// System.out.println("child");
// }

// public static void main(String args[]) {
// Parent p = new ExceptionHandling();
// p.msg();
// }
// }

// import java.io.*;

// class Parent {
// void msg() throws Exception {
// System.out.println("parent");
// }
// }

// class ExceptionHandling extends Parent {
// void msg() throws Exception {
// System.out.println("child");
// }

// public static void main(String args[]) {
// Parent p = new ExceptionHandling();
// try {
// p.msg();
// } catch (Exception e) {
// }
// }
// }
