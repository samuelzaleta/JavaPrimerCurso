package com.Main;

public class PalabraThis {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
    }

    static class Persona{
        String nombre;
        Persona(String nombre){
            this.nombre = nombre;
            Imprimir i = new Imprimir();
            i.imprimir(this);
        }

    }
    static class Imprimir{
        public void imprimir(Object o){ // Object o = p
            System.out.println("Imprimir parametro: " + o);
            System.out.println("Imprimir objeto actual (this): " + this);
        }
    }
}
