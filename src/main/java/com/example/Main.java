package com.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Persona persona1 = new Persona(123, "Gabriel", "email@email.com");


        String obtenerSaludo = persona1.hablar("Hola como estas?" + persona1.getCorreo());

        LocalDate fechaNacimiento = LocalDate.of(1999, 01, 20);

        persona1.setFechaNacimiento(fechaNacimiento);

        System.out.println("Fecha de nacimiento: " + persona1.calcularEdadAnios() + " años");

        System.out.println(obtenerSaludo);
        System.out.println("Termino!");

    }
}