// Объекты передаются по ссылке на них

package javacore.chapter07;

public class Test1 {
    int a, b;

    Test1(int i, int j) {
        a = i;
        b = j;
    }

    // передать объект
    void meth(Test1 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
            class PassObjRe {
                public static void main(String[] args) {

                    Test ob = new Test(15, 20);
                    System.out.println(" ob.a и ob.b до вызова : " + ob.a + " " + ob.b);
                    ob.meth(ob);
                    System.out.println(" ob.a и ob.b после вызова : " + ob.a + " " + ob.b);
                }
            }
            // ob.a и ob.b до вызова : 15 20
// ob.a и ob.b после вызова : 15 20
