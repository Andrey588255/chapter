package javacore.chapter07;

public class CallByValue {
    public static void main(String[] args) {

       Testt ob = new Testt();
        int a = 15, b = 20;
        System.out.println(" a и b до вызова : " + a + " " + b);
        ob.meth(a, b);
        System.out.println(" a и b после вызова : " + a + " " + b);
    }
}
