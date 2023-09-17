// Продемонстрировать применение оператора цикла do-while

package javacore.chapter05;

public class DoWhile {
    public static void main(String args[]) {
        int n = 10;
        do {
            System.out.println(" тaкт " + n);
            n--;
        } while (n > 0);
    }
}  // такт від 1 до 10