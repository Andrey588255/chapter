// Продемонстрировать статические переменные, методы и блоки кода

package javacore.chapter07;

public class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x " + x);
        System.out.println("a  " + a);
        System.out.println("b " + b);
    }

    static {
        System.out.println("Cтaтичecкий блок инициализирован . ");

    b = a * 4;
}

    public static void main(String[] args) {
    meth ( 42 ) ;
}
}
// x 42
//a  3
//b 12
