//Объекты допускается передавать методам в качестве параметров

package javacore.chapter07;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
        // возвратить логическое значение true, если в качестве
        // параметра о указан вызывающий объект
        boolean equals (Test o){
            if (o.a == a && o.b == b) return true;
            else return false;
        }

    public void meth(Test ob) {
    }

    public void meth(int a, int b) {
    }
}

     class PassOb {
        public static void main(String[] args) {
            Test ob1 = new Test(100, 22);
            Test ob2 = new Test(100, 22);
            Test ob3 = new Test(-1, -1);
            System.out.println("ob1 == ob2 : " + ob1.equals(ob2));
            System.out.println("ob1 == ob3 : " + ob1.equals(ob3));
        }
    }
    //ob1 == ob2 : true
    //ob1 == ob3 : false

