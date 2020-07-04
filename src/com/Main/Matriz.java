package com.Main;

public class Matriz {
    public static void main(String[] args) {
        //1. Declaramos una matriz de enteros
        int edades[][];
        //2. Instanciamos la matriz de enteros
        edades = new int[3][2];
        //3. Inicializamos los valores de la matriz de enteros
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;
        //Imprimimos los valores a la salida estandar
        //4. leemos los valores de cada elemento de la matriz
        System.out.println("Matriz enteros indice 0-0: " + edades[0][0]);
        System.out.println("Matriz enteros indice 0-1: " + edades[0][1]);
        System.out.println("Matriz enteros indice 1-0: " + edades[1][0]);
        System.out.println("Matriz enteros indice 1-1: " + edades[1][1]);
        System.out.println("Matriz enteros indice 2-0: " + edades[2][0]);
        System.out.println("Matriz enteros indice 2-1: " + edades[2][1]);

        //1. Matriz de tipo String, notacion simplificada
        String nombres[][] = {{"Teresa", "Cesar", "William"},{"Yesenia", "Esteban",
                "Maria"}};
        System.out.println("");
        System.out.println("largo matriz renglones:" + nombres.length);
        //Seleccionando cualquier renglon valido nos regresa el no. de columnas
        System.out.println("largo matriz columnas:" + nombres[0].length);
        //Imprimimos los valores a la salida estandar
        //2. Iteramos la matriz de String con un for anidado
        System.out.println("");
        for (int i = 0; i < nombres.length; i++) {
            for(int j= 0; j < nombres[i].length; j++){
                System.out.println("Matriz String indice : " + i + "-"+ j + ": " +
                        nombres[i][j]);
            }
        }
    }
}
