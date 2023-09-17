//Применение оператора break для выхода из цикла

package javacore.chapter05;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break; // выход из цикла, если значение
            // переменной i равно 10
            System.out.println(" i : " + i);
        }
        System.out.println(" Цикл завершен . ");
    }
}
//i : 0
// i : 1
// i : 2
// i : 3
// i : 4
// i : 5
// i : 6
// i : 7
// i : 8
// i : 9
// Цикл завершен .
