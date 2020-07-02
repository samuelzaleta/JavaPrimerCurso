package com.Main.Encapsulamiento;

public class PersonaEncapsulamiento {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private boolean borrado;

    PersonaEncapsulamiento(){

    }
    PersonaEncapsulamiento(String nombre, String apellidoPaterno, String apellidoMaterno, boolean borrado){
        this.nombre = nombre;
        this.apellidoPaterno= apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.borrado = borrado;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    public boolean isBorrado() {
        return borrado;
    }
    //Metodo que imprime el estado del objeto
    @Override
    public String toString() {
        return "PersonaEncapsulamiento{" +
                "nombre='" + nombre + '\'' + ", apellidoPaterno='" + apellidoPaterno + '\'' + ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", isborrado=" + borrado +
                '}';
    }
}
