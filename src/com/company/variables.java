package com.company;

public class variables {
    public static void main(String[] args) {
        //hola mundo
        System.out.println("Hola mundo");
        //VARIABLES
        //Variables boolean, declaracion
        boolean bool1;
        //inicializacion
        bool1 = true;
        //declaracion e inicializacion
        boolean bool2 = false;
        System.out.println("El valor de bool1:"+ bool1);
        System.out.println("El valor de bool2:"+ bool2);
        System.out.println("");

        //variables
        byte b1 =10;
        //ltera en dexadecimal
        byte b2 = 0xa;
        System.out.println("El valor de b1:"+ b1);
        System.out.println("El valor de b2:" +  b2);
        System.out.println("");

        //short
        short s1 = 2;
        System.out.println("El valor de s1:" + s1);
        System.out.println("");

        //variable char
        char ch1 = 65, ch2 ='A';
        System.out.println("El valor de ch1:" + ch1);
        System.out.println("El valor de ch2:"+ ch2);
        System.out.println("");

        //variables enterar
        int decimal = 100;
        int octal = 0144;// el valor octal inicia con 0
        int hexa = 0x64;// el valor hexadecimal inicia con 0x
        System.out.println("El valor int decimal:" + decimal);
        System.out.println("El valor int octal1:"+ octal);
        System.out.println("El valor int hexadecimal:" + hexa);
        System.out.println();

        //variables long
        long long1 = 10, long2 = 20L;
        System.out.println("El valor long1:" + long1);
        System.out.println("El valor long1:" + long2);
        System.out.println();

        //variables float
        float fl1 = 15, fl2 = 22.3F;
        System.out.println("El valor de fl1:" +fl1);
        System.out.println("El valor de fl1:" + fl2);
        System.out.println();

        //variables doble
        double doble1 = 11.0 , doble2=30.15D;
        System.out.println("El valor de doble1" + doble1);
        System.out.println("El valor de doble1" + doble2);
        System.out.println();
    }
}
