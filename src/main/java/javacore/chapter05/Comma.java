// Исполь зование запятой в операторе цикла for
package javacore.chapter05;

public class Comma {
    public static void main(String args[]) {
        int a, b;
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}     // a = 1
      // b = 4
      // a = 2
      // b = 3

