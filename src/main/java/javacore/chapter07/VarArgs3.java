//  Аргументы переменной длины и перегрузка

package javacore.chapter07;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("vaTest ( int ... ) " + "" +
                ": " + " Количество аргументов : " + v.length + " Содержимое : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest ( boolean ... ) " +
                " Количество аргументов : " + v.length +
                " Содержимое : ");
        System.out.println();
        for (boolean x : v)
            System.out.print(x + " ");
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest ( String, int ... ) : " +
                msg + v.length +
                " Содержимое : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest(1, 2, 3);
        vaTest("Проверка : ", 10, 20);
        vaTest(true, false, false);
    }
}
// vaTest ( int ... ) :  Количество аргументов : 3 Содержимое : 1 2 3
//vaTest ( String, int . . . ) : Проверка : 2 Содержимое : 10 20
//vaTest ( boolean ... )  Количество аргументов : 3 Содержимое :
//true false false
//Process finished with exit code 0