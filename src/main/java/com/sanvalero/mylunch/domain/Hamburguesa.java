package com.sanvalero.mylunch.domain;

import java.util.ArrayList;

public class Hamburguesa {

    private String pan;
    private String carne;
    private String salsa;
    private String extra;
    private int numeroCarne;
    private float precioHamburguesa;

    public Hamburguesa(){

    }
    public Hamburguesa(String pan, String carne, String salsa, String extra, int numeroCarne, float precioHamburguesa) {
        this.pan = pan;
        this.carne = carne;
        this.salsa = salsa;
        this.extra = extra;
        this.numeroCarne = numeroCarne;
        this.precioHamburguesa = precioHamburguesa;
    }
    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getTipoSalsa() {
        return salsa;
    }
    public void setTipoSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public int getNumeroCarne() {
        return numeroCarne;
    }

    public void setNumeroCarne(int numeroCarne) {
        this.numeroCarne = numeroCarne;
    }

    public float getPrecioHamburguesa() {
        return precioHamburguesa;
    }

    public void setPrecioHamburguesa(float precioHamburguesa) {
        this.precioHamburguesa = precioHamburguesa;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" +
                "pan='" + pan + '\'' +
                ", carne='" + carne + '\'' +
                ", tipoSalsa='" + salsa + '\'' +
                ", extra='" + extra + '\'' +
                ", numeroCarne=" + numeroCarne +
                ", precioHamburguesa=" + precioHamburguesa +
                '}';
    }
}
