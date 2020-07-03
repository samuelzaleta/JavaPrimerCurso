package com.Main.EjmSobreCargaConstructores;

import com.Main.EjmHerencia.Empleado;

public class MainSobreCarga {
    public static void main(String[] args) {
        PersonaEjemSobreCarga persona1 = new PersonaEjemSobreCarga("ELia Martel", 26);
        System.out.println("Persona 1\n" + persona1);
        PersonaEjemSobreCarga persona2 = new PersonaEjemSobreCarga("John Snow", 26);
        System.out.println("Persona 2\n" + persona2);

        EmpleadoEjemSobreCarga empleado1 = new EmpleadoEjemSobreCarga("Juan Pablo",22,2700);
        System.out.println("Empleado 1\n " + empleado1);
        EmpleadoEjemSobreCarga empleado2 = new EmpleadoEjemSobreCarga("Sarita",21, 3400);
        System.out.println("Empleado 2\n " + empleado2);

    }
}
