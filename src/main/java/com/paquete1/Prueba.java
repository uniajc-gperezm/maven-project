package com.paquete1;

import com.example.Persona;

public class Prueba {

    public static void main(String[] args) {

        Persona persona2 = new Persona(456, "María", "maria@email.com");

        String obtenerSaludo = persona2.hablar("Hola como estas?");

        System.out.println("Termino!");

        System.out.println("Saludo: " + obtenerSaludo);
        System.out.println("Persona correo: " + persona2.correo);

    }
}
