// Исполь зовать ключевое слово super с целью предотвратить сокрытие имен

package javacore.chapter08;

public class A {
    int i;

    public void callme() {
    }

    //создать подкласс путем расширения класса А
    class В extends A {
        int i;

        // этот член i скрывает член i из класса А
        В(int a, int b) {
            super.i = a; // член i из класса А
            i = b; // член i из класса В
        }

        void show() {
            System.out.println("Члeн i в суперклассе : " + super.i);
            System.out.println("Члeн i в подклассе : " + i);
        }
    }

    class UseSuper {
        public static void main(String[] args) {
            B subOb = new B();
            subOb.show();
        }
    }
}
// Член i в суперклассе : 1
//Член i в подклассе : 2
