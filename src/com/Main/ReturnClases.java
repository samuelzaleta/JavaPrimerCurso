package com.Main;

public class ReturnClases {

    public static void main(String[] args) {
        Suma s = crearObjetos();
        int resultado = s.a + s.b;
        System.out.println("Resultado " + resultado);
    }
    public static Suma crearObjetos(){
        Suma s = new Suma(3,4);
        return s;

    }
    static class Suma{
        int a;
        int b;
        Suma(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
}
