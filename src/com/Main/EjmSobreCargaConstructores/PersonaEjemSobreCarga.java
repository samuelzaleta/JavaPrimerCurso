package com.Main.EjmSobreCargaConstructores;

public class PersonaEjemSobreCarga {
    private  int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    private PersonaEjemSobreCarga(){
        idPersona = ++contadorPersonas;
    }
    public PersonaEjemSobreCarga(String nombre, int edad){
        this();//llama al constructor sin argumentos
        this.nombre =nombre;
        this.edad =edad;
    }

    @Override
    public String toString() {
        return "PersonaEjemSobreCarga{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' + ", edad=" + edad +
                '}';
    }


}
