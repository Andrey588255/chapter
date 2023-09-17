// // Продемонстрировать применение логических операций

package javacore.chapter04;

class BoolLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println("          а = " + a);
        System.out.println("          b = " + b);
        System.out.println("      a | b = " + c);
        System.out.println("      a & b    " + d);
        System.out.println("      a ^ b = " + e);
        System.out.println("!a&b | a&!b = " + f);
        System.out.println("         !a = " + g);
    }
}                                   // а = true
                                    // b = false
                                    // a | b = true
                                    // a & b false
                                    //  a ^ b = true
                                    // !a&b | a&!b = true
                                    // !a = false

