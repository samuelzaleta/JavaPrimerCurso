package com.Main;

public class Caja {
    float alto;
    float ancho;
    float profundo;
    Caja(){}
    Caja(float alto, float ancho, float profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    float volumen(){
        return alto*ancho*profundo;
    }
    float areaCubo(){
        float resultado =2*((ancho*alto) +(ancho*profundo) +(alto*profundo));
        return resultado;
    }
    /*
    * public static void main(String[] args) {
        Caja caja = new Caja(7.5f,4,6);
        System.out.println("Volumen de la caja " + caja.volumen());
        System.out.println("Area de la caja " + caja.areaCubo());
    }
    * */
}
