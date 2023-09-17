// Объявить переменную управления циклом в самом цикле for
package javacore.chapter05;

public class ForTick1 {
    public static void main(String[] args) {
// здесь переменная n объявляется в самом цикле for
        for (int n = 10; n > 0; n--)
            System.out.println(" тaкт " + n);
    }
} // такт від 1 до 10
