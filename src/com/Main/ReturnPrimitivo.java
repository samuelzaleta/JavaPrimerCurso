package com.Main;

import java.util.Scanner;

public class ReturnPrimitivo {
    public static void main(String[] args) {
        Scanner scan1  = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Dime el primer numero de la suma");
        int num1 = scan1.nextInt();
        System.out.println("Dime el segun numeor de la suma");
        int num2 = scan2.nextInt();
        int resultado = sumar(num1,num2);

        System.out.println("Resultado de la suma: " +  resultado);
    }
    public  static int sumar(int a, int b){
        if (a ==0 && b==0){
            return 0;
        } else return (a + b);
    }
}
