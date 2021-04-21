package com.sanvalero.mylunch.domain;

public class Pancake {

    private String extra;
    private String masa;
    private String tipoSirope;
    private String tooping;
    private int numeroPancake;
    private float precioPancake;

    public Pancake(){

    }

    public Pancake(String masa, String tipoSirope, String tooping, String extra, int numeroPancake, float precioPancake) {
        this.masa = masa;
        this.tipoSirope = tipoSirope;
        this.tooping = tooping;
        this.extra = extra;
        this.numeroPancake = numeroPancake;
        this.precioPancake = precioPancake;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getTipoSirope() {
        return tipoSirope;
    }

    public void setTipoSirope(String tipoSirope) {
        this.tipoSirope = tipoSirope;
    }

    public String getTooping() {
        return tooping;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
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

    public float getPrecioPancake() {
        return precioPancake;
    }

    public void setPrecioPancake(float precioPancake) {
        this.precioPancake = precioPancake;
    }

    @Override
    public String toString() {
        return "Pancake{" +
                "masa='" + masa + '\'' +
                ", tipoSirope='" + tipoSirope + '\'' +
                ", tooping='" + tooping + '\'' +
                ", numeroPancake=" + numeroPancake +
                ", precioPancake=" + precioPancake +
                '}';
    }
}

