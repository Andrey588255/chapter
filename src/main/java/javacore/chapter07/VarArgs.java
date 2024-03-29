// теперь метод vaTest ( ) объявляется с аргументами переменной длины

package javacore.chapter07;

public class VarArgs {
    // теперь метод vaTest ( ) объявляется с аргументами переменной длины
    static void vaTest(int ...v) {
        System.out.print("Koличecтвo аргументов : " + v.length + " Содержимое : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

// Обратите внимание на возможные способы вызова
// метода vaTest ( ) с аргументами переменной длины
        vaTest(10); // 1 аргумент

       vaTest(1,2,3); // 3 аргумента
        vaTest();     // без аргументов

    }
}
// Koличecтвo аргументов : 1 Содержимое : 10
// Koличecтвo аргументов : 3 Содержимое : 1 2 3
// Koличecтвo аргументов : 0 Содержимое :
