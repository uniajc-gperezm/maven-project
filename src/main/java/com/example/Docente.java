package com.example;

public class Docente extends Persona {
    
    public String imparteMateria;

    public Docente() {
        super();
    }

    public int calificar(String materia) {
        System.out.println("Calificacion para la materia: " + materia);
        
        // La idea es que esta nota se guarde en la base de datos, pero por ahora solo vamos a retornar un numero fijo."
        return 5;
    }

}
