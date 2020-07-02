package com.Main.Encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {

        PersonaEncapsulamiento person1 = new PersonaEncapsulamiento("Samuel","Zaleta","Magaña",false);
        System.out.println("Nombre de la persona 1: " + person1.getNombre());
        System.out.println("Estado de la persona 1:" + person1);
        person1.setApellidoPaterno("Zavaleta");
        person1.setApellidoMaterno("Magañon");
        System.out.println("Persona1: " +  person1.getNombre() + " " + person1.getApellidoPaterno() + " " + person1.getApellidoMaterno());
        PersonaEncapsulamiento person2 = new PersonaEncapsulamiento("Alejandro", "Carrillo","Guarneros", false);
        System.out.println("Estado de la persona 2: " + person2);
        //Marcamos como persona borrada
        person2.setBorrado(true);
        //volvemos a imprimir
        System.out.println("Estado actualizado de persona 2: " + person2);

        PersonaEncapsulamiento person3 = new PersonaEncapsulamiento();
        System.out.println("Estado del objeto persona 3:" + person3);

    }
}
