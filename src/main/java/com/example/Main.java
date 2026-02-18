package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Persona persona1 = new Persona(123, "Gabriel", "email@email.com");

        String obtenerSaludo = persona1.hablar("Hola como estas?");

        System.out.println(obtenerSaludo);
        System.out.println("Termino!");

    }
}