// Продемонстрировать применение значений типа Ьoolean

package javacore.chapter03;

public class BoolTest {
    public static void main(String[] args) {

    boolean b;
     b = false ;
    System.out.println ( "b равно " + b ) ;
    b = true ;
    System.out.println ( "b равно " + b) ;
//значение типа boolean может управлять оператором if
            if (b) System.out.println ( " Этoт код выполняется . " ) ;
    b = false;
    if ( b ) System.out.println ( "Этoт код не выполняется . " ) ;
// резуль тат сравнения - значение типа boolean
   System.out.println ( " 10 > 9 равно " + ( 10 > 9 ) ) ;  // b равно false; b равно true;  Этoт код выполняется .
                                                           // 10 > 9 равно true
   }
}   //  результатом выполнения операции сравнения вроде < является
    // логическое значение типа boolean. Именно поэтому выражение l О > 9 приводитк выводу слова "true".
