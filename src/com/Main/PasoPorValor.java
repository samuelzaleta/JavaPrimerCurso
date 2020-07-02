package com.Main;

public class PasoPorValor {
    public static void main(String[] args) {
        int x =10;
        imprimir(x);
        cambiarValor(x);
        int pasoValor= cambiarValor(x);
        System.out.println("Se cambio temporar el valor: " + pasoValor);
        imprimir(x);
    }
    public static int cambiarValor(int i){
        i =100;
        return i;
    }
    public static void imprimir(int argumento){
        System.out.println("Valor recibido: " + argumento);
    }

}
