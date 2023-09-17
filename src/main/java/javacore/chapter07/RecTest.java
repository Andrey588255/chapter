// Еще один пример рекурсии

package javacore.chapter07;

public class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    // вывести рекурсивно элементы массива
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println(" [ " + (i - 1) + " ] " + values[i - 1]);
    }
}
        class Recursion2 {
            public static void main(String[] args) {

                RecTest ob = new RecTest(10);
                int i;
                for (i = 0; i < 10; i++) ob.values[i] = i;
                ob.printArray(10);
            }
        }
        //[ 0 ] 0
// [ 1 ] 1
// [ 2 ] 2
// [ 3 ] 3
// [ 4 ] 4
// [ 5 ] 5
// [ 6 ] 6
// [ 7 ] 7
// [ 8 ] 8
// [ 9 ] 9
