package com.Main;

public class ConstructorAritmetica {
    int a,b;
    ConstructorAritmetica(){}
    ConstructorAritmetica(int a, int b){
        this.a =a;
        this.b =b;
    }
    int sumar(){
        return a+b;
    }
    /*
    * public static void main(String[] args) {
        ConstructorAritmetica  aritmetica = new ConstructorAritmetica(3,4);
        System.out.println(aritmetica.sumar());
    }
    * */
}
