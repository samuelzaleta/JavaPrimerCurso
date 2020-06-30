package com.company;

import java.util.Scanner;

public class CiclosJava {
    public static void main(String[] args) {
        int cont =1;
        int inciador =10;
        while (cont <= inciador){
            System.out.println("contador = " + cont);
            cont++;
        }
        System.out.println("dime el numero iteraciones del ciclo que quieres"); //solicitamos
        int maxElemntos;
        Scanner entradaElementos = new Scanner(System.in); //los escanea
        maxElemntos = entradaElementos.nextInt();
        int contador = 1;
        while (contador <= maxElemntos){
            System.out.println("contador = " + contador);
            contador++;
        }
        int conta = 1;
        int limite = 10;
        do {
            System.out.println("contador = " + conta);
            conta++;
        }while (conta <= limite);
        for (int i =1;i<=100;i++ ){
            System.out.println("contador = " + i);
        }
    }
}
