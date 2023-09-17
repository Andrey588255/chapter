// Динамическая диспетчеризация методов

package javacore.Box;

public class A {
    void callme() {
        System.out.println("B методе callme ( ) из класса А ");
    }

    static class B extends A {
        // переопределить метод callme ( )
        public void callme() {
            System.out.println("B методе callme ( ) из класса В ");
        }
    }

    static class C extends A {
        // переопределить метод callme( )
        public void callme() {
            System.out.println(" B методе callme ( ) из класса С");
        }
    }

     class Dispatch {
        public  static void main ( String args [ ] ){
            A a = new A ( ); // объект класса А

            B b = new B ( );  // объект класса в

            C c = new C ( ); // объект класса с

            A r ; // получить ссылку на объект типа А

            r = a ; // переменная r ссылается н а объект
            r.callme ( ) ; // вызвать вариант метода callllle( ) ,
            // определенный в классе А
            r = b ; // переменная r ссылается н а объект типа B
            r.callme ( ) ; // вызвать вариант метода callllle( )
            // определенный в классе В
            r = c ; // переменная r ссылается н а объект
            r.callme ( );  // определенный в классе С

        }
    }
}
//B методе callme ( ) из класса А
//B методе callme ( ) из класса В
// B методе callme ( ) из класса С
