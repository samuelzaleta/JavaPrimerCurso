package com.Main;

public class SobreCargaMetodos {
    public static void main(String[] args) {
        System.out.println("El resultado es " + Operaciones.sumar(3,4));
        System.out.println("El resultado es " + Operaciones.sumar(5,4.1));
        System.out.println("El resultado es " + Operaciones.sumar(7,3.1));
        System.out.println("El resultado es " + Operaciones.sumar(2.2,6.8));

        System.out.println("El resultado es " + Operaciones.sumar(3,1L)); //tipo long L o l
        System.out.println("El resultado es " + Operaciones.sumar(3F,'A'));//tipo float F o f
    }

}
class Operaciones{
    public static int sumar(int a, int b){
        System.out.println("Int + Int");
        return a + b;
    }
    // Sobrecarga de metodos
    public static double sumar(int a, double b){
        System.out.println("Int + Double");
        return a + b;
    }
    public static double sumar(double a , int b){
        System.out.println("Double + Int");
        return a + b;
    }
    public static double sumar(double a, double b){
        System.out.println("Double +  Double");
        return a + b;
    }
}
