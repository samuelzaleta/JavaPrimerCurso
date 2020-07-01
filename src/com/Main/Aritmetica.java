package com.Main;

public class Aritmetica {

    int a,b;
    Aritmetica(){}

    Aritmetica(int a , int b){
        this.a =a;
        this.b =b;
    }
    int sumar(){return a + b;}
    int restar(){return  a-b;}
    int multiplicar(){return  a*b;}
    float dividir(){return (float) a/(float) b;}
    /*
    *   public static void main(String[] args) {
        int num1 =6, num2 =4;
        Aritmetica aritmetica = new Aritmetica(num1,num2);
        System.out.println("Numero 1: " + num1 + " Numero 2: " + num2);
        System.out.println("Resultado de suma: " + aritmetica.sumar());
        System.out.println("Resultado de restar:" +  aritmetica.restar());
        System.out.println("Resultado de multiplicar: " + aritmetica.multiplicar());
        System.out.println("Resultado de dividir: " + aritmetica.dividir());
    }
    * */
}
