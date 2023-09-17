// Продемонстрировать применение блока кода .
// Присвоить исходному файлу имя "BlockTest . java"

package javacore.chapter02;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;
//адресатом э того оператора цикла служит блок кода
        for (x = 0; x < 10; x++){
            System.out.println("Знaчeниe х : " + x);
            System.out.println ("Знaчeниe у : " + y);
            y = y - 2;
        } // x =  від 0 до 9;  y = від 20 до 2 кожного разу мінус 2
    }
}
