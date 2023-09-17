// Символьные переменные ведут себя как целочисленные значения

package javacore.chapter03;

public class CharDemo2 {
    public static void main(String[] args) {
            char ch1;
            ch1 = 'x';
            System.out.println("ch1 содержит " + ch1);

            ch1++; // увеличить на единицу значение переменной chl
            System.out.println("ch1 теперь содержит " + ch1);
        }    // ch1 содержит x; ch1 теперь содержит y
    }       // У - следующий по порядку в наборе символов в коде ASCII (и Юникоде).