// Простой пример применения оператора switch

package javacore.chapter05;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i равно нулю . ");
                    break;
                case 1:
                    System.out.println(" i равно единице . ");
                    break;
                case 2:
                    System.out.println("i равно двум . ");
                    break;
                case 3:
                    System.out.println(" i равно трем . ");
                    break;
                default:
                    System.out.println(" i больше трех . ");
            }
    }
}                    //i равно нулю .
                     // i равно единице .
                     // i равно двум .
                     // i  равно трем .
                     // i больше трех .
                     // i больше трех .