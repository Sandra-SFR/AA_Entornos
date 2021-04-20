package com.sanvalero.mylunch.domain;

public class Pancake {

    private String masa;
    private boolean opcionSirope;
    private String tipoSirope;
    private boolean opcionTooping;
    private String tooping;
    private int numeroPancake;
    private double precioPancake;

    public Pancake(){

    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean isOpcionSirope() {
        return opcionSirope;
    }

    public void setOpcionSirope(boolean opcionSirope) {
        this.opcionSirope = opcionSirope;
    }

    public String getTipoSirope() {
        return tipoSirope;
    }

    public void setTipoSirope(String tipoSirope) {
        this.tipoSirope = tipoSirope;
    }

    public boolean isOpcionTooping() {
        return opcionTooping;
    }

    public void setOpcionTooping(boolean opcionTooping) {
        this.opcionTooping = opcionTooping;
    }

    public String getTooping() {
        return tooping;
    }

    public void setTooping(String tooping) {
        this.tooping = tooping;
    }

    public int getNumeroPancake() {
        return numeroPancake;
    }

    public void setNumeroPancake(int numeroPancake) {
        this.numeroPancake = numeroPancake;
    }

    public double getPrecioPancake() {
        return precioPancake;
    }

    public void setPrecioPancake(double precioPancake) {
        this.precioPancake = precioPancake;
    }

    @Override
    public String toString() {
        return "Pancake{" +
                "masa='" + masa + '\'' +
                ", opcionSirope=" + opcionSirope +
                ", tipoSirope='" + tipoSirope + '\'' +
                ", opcionTooping=" + opcionTooping +
                ", tooping='" + tooping + '\'' +
                ", numeroPancake=" + numeroPancake +
                ", precioPancake=" + precioPancake +
                '}';
    }
}

