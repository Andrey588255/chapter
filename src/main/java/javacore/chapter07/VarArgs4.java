// Аргументы переменной длины , перегрузка и неоднозначность
// Эта программа содержит ошиСку, и поэтому не может Сыть скомпилирована !

package javacore.chapter07;

public class VarArgs4 {
    static void vaTest(int... v) {
        System.out.print("vaTest ( int ... ) :" +
                " " + "Количество аргументов : " + v.length + " Содержимое : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest ( boolean . . . ) " +
                " Количество аргументов : " + v.length +
                " Содержимое : ");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest(1, 2, 3); // Верно !
        vaTest(true, false, false); // Верно !
       // vaTest(); // ОшиОка : неоднозначность !

    }
}
// В этой программе перегрузка метода vaTe st ( ) задается вполне корректно. Тем
//не менее скомпилировать ее не удастся из-за следующего вызова:
//vaTest ( ) ; / / ОШИБКА : неоднозначность !
