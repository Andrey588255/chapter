// Продемонстрировать применение операции инкремента ++

package javacore.chapter04;

public class IncDec {
    public static void main(String[] args) {

    int a = 1;
    int b = 2;
    int c;
    int d;
    c = ++b;
    d = a++;
    c++;
    System.out.println("a =" +a);
    System.out.println("b =" +b);
    System.out.println("c =" +c);
    System.out.println("d =" +d); // a = 2; b = 3; c = 4; d = 1;

   }
}

