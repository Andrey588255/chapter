// Отдельные части оператора цикла for могут отсутствовать
package javacore.chapter05;

public class ForVar {
    public static void main(String args[]) {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println(" i равно " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}           // рівно від 0 до 10
