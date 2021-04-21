package com.sanvalero.mylunch.domain;

import java.util.ArrayList;
import java.util.Objects;

public class Batido {

    private String leche;
    private String sabor;
    private String tipoSirope;
    private String tooping;
    private int numeroBatidos;
    private float precioBatido;

    public Batido(){
    }

    public Batido(String leche, String sabor, String tipoSirope, String tooping, int numeroBatidos, float precioBatido) {
        this.leche = leche;
        this.sabor = sabor;
        this.tipoSirope = tipoSirope;
        this.tooping = tooping;
        this.numeroBatidos = numeroBatidos;
        this.precioBatido = precioBatido;

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

    public String getTipoSirope() {
        return tipoSirope;
    }

    public void setTipoSirope(String tipoSirope) {
        this.tipoSirope = tipoSirope;
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

    public float getPrecioBatido() {
        return precioBatido;
    }

    public void setPrecioBatido(float precioBatido) {
        this.precioBatido = precioBatido;
    }


    @Override
    public String toString() {
        return "Batido{" +
                "leche='" + leche + '\'' +
                ", sabor='" + sabor + '\'' +
                ", tipoSirope='" + tipoSirope + '\'' +
                ", tooping='" + tooping + '\'' +
                ", numeroBatidos=" + numeroBatidos +
                ", precioBatido=" + precioBatido +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Batido batido = (Batido) o;
        return Objects.equals(leche, batido.leche);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leche);
    }
}
