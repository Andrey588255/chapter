// Вычисление среднего из массива значений

package javacore.chapter03;

public class Average {
    public static void main(String[] args) {
        double nums [] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++)
            result = result + nums[i];
        System.out.println("Cpeднee значение равно " + result / 5);  // Cpeднee значение равно 12.299999999999999
    }
}
