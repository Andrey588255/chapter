// Сдвиг влево значения типа byte

package javacore.chapter04;

public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Пepвoнaчaльнoe значение а : " + a);
        System.out.println(" i and b : " + i + " " + b);
    }
}
                            // Пepвoнaчaльнoe значение а : 64
                            // i and b : 256 0