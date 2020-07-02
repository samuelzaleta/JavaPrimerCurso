package com.Main.EjmHerencia;

public class Persona {
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;

    public Persona(){

    }
    //constructor de un argumento, por cada  vaina que quiero heredar necesito un constructor de un argumento
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' + ", genero=" + genero + ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
