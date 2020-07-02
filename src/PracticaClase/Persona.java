package PracticaClase;

public class Persona {
    //atributos de clase
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    //metodo los metodos tienen la notacion camello y debe ser una accion
    public void despeglarNombre(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Primer apellido: " + apellidoPaterno);
        System.out.println("Segundo apellido: " +  apellidoMaterno);

    }
    public void cambiarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String obtenerNombre(){
        return nombre;
    }

}
