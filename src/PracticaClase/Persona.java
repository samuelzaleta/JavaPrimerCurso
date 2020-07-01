package PracticaClase;

public class Persona {
    //atributos de clase
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    //metodo
    public void despeglarNombre(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Primer apellido: " + apellidoPaterno);
        System.out.println("Segundo apellido: " +  apellidoMaterno);

    }
}
