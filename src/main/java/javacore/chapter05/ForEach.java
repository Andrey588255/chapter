// Применение цикла for в стиле for each
package javacore.chapter05;

public class ForEach {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        // исполь зовать цил в стиле for each для вывода и
        // суммирования значений
        for (int x : nums) {
            System.out.println(" Знaчeниe равно : " + x);
            sum += x;

        }
        System.out.println("Cyммa равна : " + sum);
    }
}
//Знaчeниe равно : 1
// Знaчeниe равно : 2
// Знaчeниe равно : 3
// Знaчeниe равно : 4
// Знaчeниe равно : 5
// Знaчeниe равно : 6
// Знaчeниe равно : 7
// Знaчeниe равно : 8
// Знaчeниe равно : 9
// Знaчeниe равно : 10
//Cyммa равна : 55