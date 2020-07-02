package com.Main;

public class PalabraNull {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juanelo");
        Persona persona2 = persona1;
        System.out.println("P1 " + persona1.obtenerNombre());
        System.out.println("P2 " + persona2.obtenerNombre());
        persona1 = null; // ya no tiene valor de persona y no agarra espacio en memoria, no se puede imprimir
        System.out.println("Probando persona 2 " + persona2.obtenerNombre());
        if (persona1 != null) System.out.println("no estoy vacio..." + persona1);

    }
    static class Persona{
        String nombre;
        public Persona(String nombre){ //constructor
            this.nombre = nombre;
        }
        public String obtenerNombre(){ //metodo para retornar el valor
            return this.nombre;
        }
    }
}
