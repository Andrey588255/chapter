//Применение оператора break во вложенных циклах
package javacore.chapter05;

public class BreakLoopЗ {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд " + i + " : ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break; // выход из цикла , значение
                // переменной j равно 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
            System.out.println(" Циклы завершены . ");
    }
}
//Пpoxoд 0 : 0 1 2 3 4 5 6 7 8 9
//Пpoxoд 1 : 0 1 2 3 4 5 6 7 8 9
//Пpoxoд 2 : 0 1 2 3 4 5 6 7 8 9
// Циклы завершены .
