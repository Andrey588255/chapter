
package javacore.chapter05;
public class Sample {
    public static void main(String[] args) {
        int a, b;
        b = 4;
        for (a = 1; a < b; a++)
            System.out.println("a = " + a);
        System.out.println("b = " + b);
        b--;
    }
}
  //a = 1
  //a = 2
  //a = 3
  //b = 4
