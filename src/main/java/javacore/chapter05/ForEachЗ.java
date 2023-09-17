// Применение цикла for в стиле for each для
// обращения к двухмерному массиву
package javacore.chapter05;

public class ForEachЗ {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];
// присвоить значение элементам массива nums
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);
// исполь зовать цикл for в стиле for each для
// вывода и суммирования значений
        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Знaчeниe равно : " + y);
                sum += y;
            }
        }
        System.out.println("Cyммa: " + sum);
    }
}
//Знaчeниe равно : 1
//Знaчeниe равно : 2
//Знaчeниe равно : 3
//Знaчeниe равно : 4
//Знaчeниe равно : 5
//Знaчeниe равно : 2
//Знaчeниe равно : 4
//Знaчeниe равно : 6
//Знaчeниe равно : 8
//Знaчeниe равно : 10
//Знaчeниe равно : 3
//Знaчeниe равно : 6
//Знaчeниe равно : 9
//Знaчeниe равно : 12
//Знaчeниe равно : 15
//Cyммa: 90