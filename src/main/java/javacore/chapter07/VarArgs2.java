// Исполь зовать аргументы переменной длины вместе
// со стандартными аргументами
package javacore.chapter07;

public class VarArgs2 {
    // В данном примере msg - обычный параметр,
// // а v - параметр переменной длины
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Содержимое : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(" Один параметр переменной длины : ", 10);
        vaTest("Tpи параметра переменной длины : ", 1, 2, 3);
        vaTest("Бeз параметров переменной длины : ");
    }
}
//  Один параметр переменной длины : 1 Содержимое : 10
// Tpи параметра переменной длины : 3 Содержимое : 1 2 3
// Бeз параметров переменной длины : 0 Содержимое :