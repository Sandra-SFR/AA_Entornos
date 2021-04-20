package com.sanvalero.mylunch.domain;

public class Batido {

    private String leche;
    private String sabor;
    private boolean opcionSirope;
    private String tipoSirope;
    private boolean opcionTooping;
    private String tooping;
    private int numeroBatidos;
    private double precioBatido;

    public Batido(){

    }

    public String getLeche() {
        return leche;
    }

    public void setLeche(String leche) {
        this.leche = leche;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
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

    public int getNumeroBatidos() {
        return numeroBatidos;
    }

    public void setNumeroBatidos(int numeroBatidos) {
        this.numeroBatidos = numeroBatidos;
    }

    public double getPrecioBatido() {
        return precioBatido;
    }

    public void setPrecioBatido(double precioBatido) {
        this.precioBatido = precioBatido;
    }

    @Override
    public String toString() {
        return "Batido{" +
                "leche='" + leche + '\'' +
                ", sabor='" + sabor + '\'' +
                ", opcionSirope=" + opcionSirope +
                ", tipoSirope='" + tipoSirope + '\'' +
                ", opcionTooping=" + opcionTooping +
                ", tooping='" + tooping + '\'' +
                ", numeroBatidos=" + numeroBatidos +
                ", precioBatido=" + precioBatido +
                '}';
    }
}
