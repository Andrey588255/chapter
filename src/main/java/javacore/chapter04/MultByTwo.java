// Применение сдвига влево в качестве быстрого способа умножения на 2

package javacore.chapter04;

public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;
        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
                                   // 536870908
                                   // 1073741816
                                   // 2147483632
                                   // -32