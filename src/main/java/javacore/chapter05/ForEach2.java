// Применение оператора break в цикле for в стиле for each
package javacore.chapter05;

public class ForEach2 {
    public static void main(String[] args) {
        int surn = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // использовать цикл for в стиле for each для
        // вывода и суммирования значений из части массива
        for (int x : nums) {
            System.out.println("Знaчeниe равно : " + x);
            surn += x;
            if (x == 5) break; // прервать цикл после
            // получения 5 значений
        }
        System.out.println("Cyммa пяти первых элементов равна : " + surn);
    }
}
//Знaчeниe равно : 1
//Знaчeниe равно : 2
//Знaчeниe равно : 3
//Знaчeниe равно : 4
//Знaчeниe равно : 5
//Cyммa пяти первых элементов равна : 15

