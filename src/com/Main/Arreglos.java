package com.Main;

public class Arreglos {
    public static void main(String[] args) {
        //declarar arreglos
        int edades [] = {20,21,23,19,40,41,42,45}; //solo es util para saber la cantidad de valores
        int edades2 [];
        edades2 = new int[3];
        edades2[0] = 10;
        edades2[1] = 15;
        System.out.println("arreglo edades indice 0 " + edades2[0]);
        System.out.println("arrgelo edades indice 5 " +  edades[4]);
        //arreglo de objetos
        Persona persona[] = new Persona[4];
        Persona persona1[];
        persona1 = new Persona[4];
        persona[0] =new Persona("Juan","Zaleta","Toxqui");
        persona1[0] = new Persona("Pablo","Gomez","Zaleta");
        System.out.println("Objeto personas indice 0" +  persona[0]);
        System.out.println("Objeto personas2 indice 0" +  persona1[0]);


    }

}
