// Эта программа содержит ошибку

package javacore.chapter05;

public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд " + i + "· ");
        }
            for (int j = 0; j < 100; j++) {
                //if (j == 10) break one; // ОШИБКА !
                System.out.print(j + " ");
            }
        }
    }
