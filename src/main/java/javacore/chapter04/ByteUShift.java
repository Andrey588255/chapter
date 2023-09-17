// Беззнаковый сдвиг двоичных разрядов значения типа bуtе

package javacore.chapter04;

public class ByteUShift {
    public static  void main(String args[]) {
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'а', 'Ь', 'с', 'd', 'е', 'f'
        };
        byte b = (byte) 0xf1;
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0xff) >>> 4);


        System.out.println(" b = 0х "
                + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println(" b >> 4 = 0х"
                + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println(" b >>> 4 = Ох "
                + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println(" ( b & Oxf f ) >> 4 = Ох "
                + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
    }
}                                             // b = 0х f1
                                              // b >> 4 = 0хff
                                              // b >>> 4 = Ох ff
                                             // ( b & Oxf f ) >> 4 = Ох 0f
