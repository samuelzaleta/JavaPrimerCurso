package com.Main.EjmHerencia;

public class HerenciaMain {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",2500);
        System.out.println("Imprimirmos el objeto empleado1 \n" + empleado1);

        Empleado empleado2 = new Empleado("Rosa", 2700);
        empleado2.setEdad(25);
        empleado2.setGenero('F');
        empleado2.setDireccion("La margarina #702, colonia quiensabeque, Tampico, Tamaulipas");
        System.out.println("\nImprimir el objeto empleado 2 \n" + empleado2);

        //Cliente
        Cliente cliente1 = new Cliente(new java.util.Date(),false);
        System.out.println("\nImrprimimos objeto cliente\n" +  cliente1);

        Cliente cliente2 = new Cliente(new java.util.Date(), true);
        cliente2.setNombre("Karla");
        cliente2.setEdad(28);
        cliente2.setGenero('F');
        cliente2.setDireccion("En algun lugar de puebla");
        System.out.println("\nImprimir Cliente 2\n" + cliente2);


    }
}
