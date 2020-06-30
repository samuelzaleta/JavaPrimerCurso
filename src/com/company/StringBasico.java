package com.company;

public class StringBasico {
    public static void main(String[] args) {
        //CADENAS String
        String nombre ="Karla";
        String apellido = "Ezperanza";

        System.out.println("Concanetacion:" + nombre + apellido);
        System.out.println("Nueva linea:\n" + nombre + " " + apellido );
        System.out.println("Tabulador: \t" + nombre + " " + apellido);
        System.out.println("Retroceso:\b" + nombre + " " + apellido);
        System.out.println("Retroceso de carro: \r" + nombre + " " + apellido);
        System.out.println("Comilla simple \'" + nombre + " " + apellido + "\'");
        System.out.println("Comilla doble \"" + nombre + " " + apellido + "\"");
    }
}
