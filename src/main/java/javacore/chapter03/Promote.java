package javacore.chapter03;

public class Promote {
    public static void main ( String args [ ]) {
    byte b = 42 ;
    char с = 'а' ;
    short s = 1024 ;
    int i = 50000 ;
    float f = 5.67f ;
    double d = .1234 ;
    double result = ( f * b ) + ( i / с ) - ( d * s ) ;
System.out.println ( ( f * b ) + " + " + ( i / с ) + " - " + ( d * s ) ) ;
System.out.println ( " result = " + result ) ;  // 238.14 + 46 - 126.3616;  result = 157.7784146484375

    }
 }
