package PracticaClase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        String apellido1;
        String apellido2;
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Dime el nombre");
        nombre = scan1.nextLine();
        System.out.println("Dime el primer apellido");
        apellido1 =scan2.nextLine();
        System.out.println("Dime el segundo apellido");
        apellido2 =scan3.nextLine();
        System.out.println(nombre + " " + apellido1 + " " + apellido2);
        p1.nombre = nombre;
        p1.apellidoPaterno =apellido1;
        p1.apellidoMaterno = apellido2;
        System.out.println("Llamando a la clase");
        p1.despeglarNombre();
        p2.nombre ="Alan";
        p2.apellidoPaterno ="Zaleta";
        p2.apellidoMaterno ="Magaña";
        p2.despeglarNombre();

    }
}
