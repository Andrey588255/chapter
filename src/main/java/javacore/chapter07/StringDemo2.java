// Продемонстрировать некоторые методы из класса Strinq

package javacore.chapter07;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = " Первая строка";
        String str0b2 = " Вторая строка";
        String strObЗ = strOb1;
        System.out.println("Длинa строки strOb1 : " + strOb1.length());
        System.out.println("Cимвoл по индексу 3 в строке strOb1 : " + strOb1.charAt(3));
        if (strOb1.equals(str0b2))
            System.out.println(" strOb1 == str0b2 ");
        else
            System.out.println(" strOb1 ! = str0b2 ");
        if (strOb1.equals(strObЗ))
            System.out.println(" strOb1 = strObЗ ");
        else
            System.out.println(" strOb1 ! = st rObЗ ");
    }
}
// Длинa строки strOb1 : 14
// Cимвoл по индексу 3 в строке strOb1 : р
// strOb1 ! = str0b2
// strOb1 = strObЗ
