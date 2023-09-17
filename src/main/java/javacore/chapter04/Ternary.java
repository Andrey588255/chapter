// Продемонстрировать применение тернарной операции ?

package javacore.chapter04;

public class Ternary {
    public static void main ( String args [ ]) {
    int i , k ;
    i = 10 ;
    k = i < 0 ? -i : i ; // nолучить абсолютное значения переменной i
    System.out.print ( "Aбcoлютнoe значение " ) ;
        System.out.println ( i + " равно " + k ) ;
    i = - 10 ;
    k = i < 0 ? - i : i ; // получить абсолютное значения переменной i
    System.out.print ( "Aбcoлютнoe значение " ) ;
    System.out.print ( "Абсолютное значение " ) ;
    System.out.println ( i + " равно " + k ) ;
   }
}                                        // Aбcoлютнoe значение 10 равно 10
                                         // Aбcoлютнoe значение Абсолютное значение -10 равно 10
