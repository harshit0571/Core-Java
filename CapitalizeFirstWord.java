// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;


class HelloWorld {
    public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
      String s=inp.nextLine();
       
       
      String[] arr=s.split(" ");
       
       int a='A';
       System.out.println(a);
       
      for(int i=0;i<arr.length;i++){
          if(arr[i].charAt(0) >=97 && arr[i].charAt(0)<=122){
              StringBuilder sb=new StringBuilder(arr[i]);
                char ch=(char)(arr[i].charAt(0) - 32);
              sb.setCharAt(0, ch);
              
              arr[i]=sb.toString();
          }
      }
      
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      }
    }
}
