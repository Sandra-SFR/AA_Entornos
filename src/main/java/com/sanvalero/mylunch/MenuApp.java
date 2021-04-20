package com.sanvalero.mylunch;

import com.sanvalero.mylunch.domain.Batido;
import com.sanvalero.mylunch.domain.Hamburguesa;
import com.sanvalero.mylunch.domain.Pancake;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuApp {

    private boolean salir;
    private Scanner sc = new Scanner(System.in);
    private Hamburguesa hamburguesa;
    private Batido batido;
    private Pancake pancake;

    ArrayList<Batido> listaBatidos = new ArrayList<>();
    ArrayList<Hamburguesa> listaHamburguesas = new ArrayList<>();
    ArrayList<Pancake> listaPancakes = new ArrayList<>();

    public MenuApp(){
        salir = false;
        sc = new Scanner(System.in);
    }

    public void ejecutar(){
        do{
            System.out.println(" ");
            System.out.println("----------------------");
            System.out.println("--------My Luch-------");
            System.out.println("---Elige una opción---");
            System.out.println("1. Crear batido");
            System.out.println("2. Crear hamburguesa");
            System.out.println("3. Crear pancake");
            System.out.println("4. Mostrar batido");
            System.out.println("5. Mostrar hamburguesa");
            System.out.println("6. Mostrar pancake");
            System.out.println("x. Salir");
            System.out.println("----------------------");
            System.out.println(" ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    crearBatido();
                    break;
                case "2":
                    crearHamburguesa();
                    break;
                case "3":
                    crearPancake();
                    break;
                case "4":
                    mostrarBatido(listaBatidos);
                    break;
                case "5":
                    mostrarHamburguesa(listaHamburguesas);
                    break;
                case "6":
                    mostrarPancakes(listaPancakes);
                    break;
                case "x":
                    salir();
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }

        }while(!salir);
    }

    // 1. crear batido
    private void crearBatido(){

        System.out.println("---Elige los siguientes opciones---");
        System.out.println(" ");
        System.out.println("----------------------");
        System.out.println("-- Leche: ");
        System.out.println("----------------------");
        System.out.println("Soja");
        System.out.println("Vaca");
        System.out.println("Almendras");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String leche = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- Sabor: ");
        System.out.println("----------------------");
        System.out.println("Chocolate");
        System.out.println("Fresa");
        System.out.println("Vainilla");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String sabor = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- Sirope: ");
        System.out.println("----------------------");
        System.out.println("Chocolate");
        System.out.println("Fresa");
        System.out.println("Vainilla");
        System.out.println("No");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String tipoSirope = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- Tooping: ");
        System.out.println("----------------------");
        System.out.println("Oreo");
        System.out.println("Kit-kat");
        System.out.println("Kinder");
        System.out.println("No");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String tipoTooping = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- ¿Cuantos batidos como este quieres? ");
        System.out.println("----------------------");
        System.out.println("Introduce un numero:");
        int numeroBatidos = sc.nextInt();

        System.out.println("----------------------");
        System.out.println("-- Introduce el precio: ");
        System.out.println("----------------------");
        System.out.println("Escribe un precio:");
        float precioBatido = sc.nextFloat();

        guardarDatosBatido(leche,sabor,tipoSirope,tipoTooping,numeroBatidos,precioBatido);

        finalRegistro();

    }
    // guardar opciones de 1
    private ArrayList<Batido> guardarDatosBatido(String leche, String sabor, String tipoSirope, String tipoTooping, int numeroBatidos, float precioBatido){

        Batido batido = new Batido(leche,sabor,tipoSirope,tipoTooping,numeroBatidos,precioBatido);
        listaBatidos.add(batido);

        return listaBatidos;
    }
    // 2. crear hamburguesa
    private void crearHamburguesa(){

        System.out.println("---Elige los siguientes opciones---");
        System.out.println(" ");
        System.out.println("----------------------");
        System.out.println("-- Pan: ");
        System.out.println("----------------------");
        System.out.println("Sesamo");
        System.out.println("Bollo");
        System.out.println("Sin gluten");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String pan = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- Carne: ");
        System.out.println("----------------------");
        System.out.println("Ternera");
        System.out.println("Pollo");
        System.out.println("Beyond");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String carne = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- Salsa: ");
        System.out.println("----------------------");
        System.out.println("Bbq");
        System.out.println("Ranchera");
        System.out.println("Mayo");
        System.out.println("No");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String salsa = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- Extra: ");
        System.out.println("----------------------");
        System.out.println("Queso");
        System.out.println("Lechuga");
        System.out.println("Tomate");
        System.out.println("No");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String extra = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- ¿Cuantas hamburguesas como esta quieres? ");
        System.out.println("----------------------");
        System.out.println("Introduce un numero:");
        int numeroCarne = sc.nextInt();

        System.out.println("----------------------");
        System.out.println("-- Introduce el precio: ");
        System.out.println("----------------------");
        System.out.println("Escribe un precio:");
        float precioHamburguesa = sc.nextFloat();

        guardarDatosHamburguesa(pan,carne,salsa,extra,numeroCarne,precioHamburguesa);

        finalRegistro();

    }
    // guardar opciones de 2
    private ArrayList<Hamburguesa> guardarDatosHamburguesa(String pan, String carne, String salsa, String extra, int numeroCarne, float precioHamburguesa) {

        Hamburguesa hamburguesa = new Hamburguesa(pan,carne,salsa,extra,numeroCarne,precioHamburguesa);
        listaHamburguesas.add(hamburguesa);

        return listaHamburguesas;
    }
    // 3. crear pancake
    private void crearPancake(){

        System.out.println("---Elige los siguientes opciones---");
        System.out.println(" ");
        System.out.println("----------------------");
        System.out.println("-- Masa: ");
        System.out.println("----------------------");
        System.out.println("Trigo");
        System.out.println("Avena");
        System.out.println("Sin gluten");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String masa = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- Sirope: ");
        System.out.println("----------------------");
        System.out.println("Arce");
        System.out.println("Agave");
        System.out.println("Chocolate");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String tipoSirope = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- Tooping: ");
        System.out.println("----------------------");
        System.out.println("Fruta");
        System.out.println("Cholate");
        System.out.println("Galletas");
        System.out.println("No");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String tooping = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- Extra: ");
        System.out.println("----------------------");
        System.out.println("Fruta");
        System.out.println("Sirope");
        System.out.println("Nata");
        System.out.println("No");
        System.out.println("----------------------");
        System.out.println("Escribe una opción:");
        String extra = sc.nextLine();

        System.out.println("----------------------");
        System.out.println("-- ¿Cuantos pancakes como este quieres? ");
        System.out.println("----------------------");
        System.out.println("Introduce un numero:");
        int numeroPancake = sc.nextInt();

        System.out.println("----------------------");
        System.out.println("-- Introduce el precio: ");
        System.out.println("----------------------");
        System.out.println("Escribe un precio:");
        float precioPancake = sc.nextFloat();

        guardarDatosPancakes(masa,tipoSirope,tooping,extra,numeroPancake,precioPancake);

        finalRegistro();

    }
    // guardar opciones de 3
    private ArrayList<Pancake> guardarDatosPancakes(String masa, String tipoSirope, String tooping, String extra, int numeroPancake, float precioPancake) {

        Pancake pancake = new Pancake(masa,tipoSirope,tooping,extra,numeroPancake,precioPancake);
        listaPancakes.add(pancake);

        return listaPancakes;
    }
    // 4. mostrar batido
    private void mostrarBatido(ArrayList<Batido>  listaBatidos){

        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("El batido que has registrado es:");
        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println(" ");

        for (Batido batido : listaBatidos) {
            System.out.println(batido);
        }
        correcto();
    }
    // 5. mostrar hamburguesa
    private void mostrarHamburguesa(ArrayList<Hamburguesa> listaHamburguesas){

        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("La hamburguesa que has registrado es:");
        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println(" ");

        for (Hamburguesa hamburguesa : listaHamburguesas) {
            System.out.println(hamburguesa);
        }
        correcto();
    }
    // 6. mostrar pancakes
    private void mostrarPancakes(ArrayList<Pancake> listaPancakes){

        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("El pancakes que has registrado es:");
        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println(" ");

        for (Pancake pancake : listaPancakes) {
            System.out.println(pancake);
        }
        correcto();
    }

    private void finalRegistro(){
        System.out.println(" ");
        System.out.println("Producto registrado");
        System.out.println("----------------------");
        System.out.println("Pulsa cualquier tecla para volver al menú:");
        sc.nextLine();
        sc.nextLine();
    }
    private void correcto(){
        System.out.println(" ");
        System.out.println("----------------------");
        System.out.println("Pulsa cualquier tecla para volver al menú:");
        sc.nextLine();
    }

    private void salir() {
        salir = true;
    }
}
