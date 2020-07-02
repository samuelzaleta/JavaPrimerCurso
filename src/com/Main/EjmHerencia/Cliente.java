package com.Main.EjmHerencia;
import java.util.Date;
public class Cliente extends Persona{
    private int idCliente;
    private java.util.Date ferchaRegristro;
    private boolean vip;
    private static int contadorClientes;

    public Cliente(Date ferchaRegristro, boolean vip){
        this.idCliente =++contadorClientes;
        this.ferchaRegristro = ferchaRegristro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFerchaRegristro() {
        return ferchaRegristro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente{" +
                "idCliente=" + idCliente +
                ", ferchaRegristro=" + ferchaRegristro +
                ", vip=" + vip +
                '}';
    }
}
