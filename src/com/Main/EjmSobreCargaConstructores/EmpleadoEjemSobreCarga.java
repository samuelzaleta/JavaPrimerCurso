package com.Main.EjmSobreCargaConstructores;

public class EmpleadoEjemSobreCarga extends PersonaEjemSobreCarga { // necesitas el extense
    private double sueldo;

    public EmpleadoEjemSobreCarga(String nombre, int edad, double sueldo) {
        super(nombre, edad);//llama al constructor con dos argumentos en la clase PersonaEjemSobreCarga
        this.sueldo = sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo; //necesario para asignar sueldo
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() +"EmpleadoEjemSobreCarga{" + //super.toString() sirve para atraer el toString de la case padre PersonaEjemSobreCarga
                "sueldo=" + sueldo +
                '}';
    }

}
