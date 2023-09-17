// Продемонстрировать приведение типов

package javacore.chapter03;

public class Conversion {
    public static void main(String[] args) {

        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println(" \nПpeoбpaзoвaниe типа int в тип byte . ");
        b = (byte) i;
        System.out.println( " i и b " + i + " " + b ) ;

        System.out.println(" \nПpeoбpaзoвaниe типа double в тип int . ");
        i = (int) d;
        System.out.println("d и i " + d + " " + i);
        System.out.println(" \nПpeoбpaзoвaниe типа double в тип byte . ");
        b = (byte) d;
        System.out.println("d и Ь " + d + " " + b);  // Пpeoбpaзoвaниe типа int в тип byte. i и b 257
                                                    // Пpeoбpaзoвaниe типа double в тип int .  d и i 323.142 323
                                                   //  Пpeoбpaзoвaниe типа double в тип byte .  d и Ь 323.142 67




    }
}
