// Исполь зовать массив для передачи методу переменного
// количества аргументов . Это старый подход к обработке
// аргументов переменной длины

package javacore.chapter07;

public class PassArray {
    static void vaTest(int v[]) {
        System.out.print(" Koличecтвo аргументов : " + v.length + " Содержимое : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        // Обратите внимание на порядок создания массива
        int n1[] = {10};
        int n2[] = {1, 2, 3};
        int n3[] = {};
        vaTest(n1); // 1 аргумент
        vaTest(n2); // 3 аргумента
        vaTest(n3); // без аргументов
    }
}
// Koличecтвo аргументов : 1 Содержимое : 10
// Koличecтвo аргументов : 3 Содержимое : 1 2 3
// Koличecтвo аргументов : 0 Содержимое :
