package com.company;

public class IfelsesSwitchcase {
    public static void main(String[] args) {
        //ejemplo 1 if
        int x = 10;
        if (x < 5)
        {
            System.out.println("X es menor a 5");
        }
        else {
            System.out.println("X es mayor a 5");
        }
        // Problema en operador ternario
        int resultadoEj1 = (x <5)? x:5;
        System.out.println("El valor mayor es " + resultadoEj1);
        // ejemplo 2 if
        int y = 15;
        if (y == 10)
        {
            System.out.println("Y es igual a 10");
        } else if (y == 15){
            System.out.println("Y es igual a 15");
        } else if (y == 5){
            System.out.println("Y es igual a 5");
        } else System.out.println("Pues y tiene otro valor");
        //Problema en operador ternario
        int cuantoValeY= (y ==10)? 10:(y ==15)? 15:(y ==5)? 5:0;
        System.out.println("El valor de y es " + cuantoValeY);
        int mes = 1;
        String estacion;
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5){
            estacion ="Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8){
            estacion ="Verano";
        } else if (mes == 9 || mes == 10 || mes == 11){
            estacion ="Otoño";
        } else estacion ="Ese numero de mes no existe";
        System.out.println("La estacion para el mes " + mes + " es:" + estacion);
        // Inviable para operador ternario, pero se puede con switch case
        switch (mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion ="Primavera";
                break;
            case 6: case 7: case 8:
                estacion ="Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default: estacion ="numero de mes invalido";
        }
        System.out.println("La estacion para el mes " + mes + " es:" + estacion);
    }
}
