package com.Main;

public class ContextoStatic {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Samuel", "Zaleta","Vazquez");
        Persona persona2 = new Persona("Alan Eduardo", "Zaleta","Magaña");
        System.out.println("Estado p1:" + persona1);
        System.out.println("Estado p2" + persona2);
        System.out.println("Contado de personas: " + Persona.getContadorPersonas());
    }
}
class Persona{
    private int idPersona;
    private String nombre;
    private String apellido1;
    private String apellido2;
    //los metodos estaticos pertenecen a la clase y no a los objetos
    private static int ContadorPersonas;
    public Persona(String nombre, String apellido1, String apellido2){
        ContadorPersonas++;
        idPersona = ContadorPersonas;

        this.nombre =nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    //no olvidar que lo que quieres mandar a la clase main necesita un get
    public static int getContadorPersonas() {
        return ContadorPersonas;
    }

    //como no quiero cambiar u obtener valores individeales no necesito los get y set
    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                '}';
    }
}