// Применение оператора break для выхода из вложенных циклов

package javacore.chapter05;

public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд " + i + " : ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer; // выход из обоих циклов
                System.out.print(j + " ");
            }
            System.out.println("Этa строка не будет выводиться");
        }
        System.out.println(" Циклы завершены . ");
    }
}
//Пpoxoд 0 : 0 1 2 3 4 5 6 7 8 9  Циклы завершены
