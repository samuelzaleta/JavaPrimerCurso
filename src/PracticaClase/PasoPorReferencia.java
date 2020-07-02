package PracticaClase;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.cambiarNombre("Carlos");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }
    public static void modificarPersona(Persona arg){
        arg.cambiarNombre("Juanito");
    }
    public static void imprimirNombre(Persona persona){
        System.out.println("Valor recibido: " + persona.obtenerNombre());
    }
}
