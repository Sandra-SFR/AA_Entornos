package com.sanvalero.mylunch.domain;

import java.util.ArrayList;

public class Hamburguesa {

    private String pan;
    private String carne;
    private boolean opcionSalsa;
    private String tipoSalsa;
    private boolean opcionAñadirExtra;
    private String extra;
    private int numeroCarne;
    private double precioHamburguesa;

    public Hamburguesa(){

    }
    public Hamburguesa(String pan, String carne, String tipoSalsa, String opcionAñadirExtra, int numeroCarne, double precioHamburguesa) {
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

    public boolean isOpcionSalsa() {
        return opcionSalsa;
    }

    public void setOpcionSalsa(boolean opcionSalsa) {
        this.opcionSalsa = opcionSalsa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isOpcionAñadirExtra() {
        return opcionAñadirExtra;
    }

    public void setOpcionAñadirExtra(boolean opcionAñadirExtra) {
        this.opcionAñadirExtra = opcionAñadirExtra;
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

    public double getPrecioHamburguesa() {
        return precioHamburguesa;
    }

    public void setPrecioHamburguesa(double precioHamburguesa) {
        this.precioHamburguesa = precioHamburguesa;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" +
                "pan='" + pan + '\'' +
                ", carne='" + carne + '\'' +
                ", opcionSalsa=" + opcionSalsa +
                ", tipoSalsa='" + tipoSalsa + '\'' +
                ", opcionAñadirExtra=" + opcionAñadirExtra +
                ", extra='" + extra + '\'' +
                ", numeroCarne=" + numeroCarne +
                ", precioHamburguesa=" + precioHamburguesa +
                '}';
    }
}
