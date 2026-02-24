package com.example;

public class Estudiante extends Persona {
    
    public String estudiaCurso;

    public Estudiante() {
        super();
    }

    public void entregarTarea(String materia) {
        System.out.println("Entregando tarea del materia: " + materia);
    }

    private int revisarNota(String materia) {
        System.out.println("Revisando nota del materia: " + materia);

        // La idea es que esta nota se consulte en la base de datos, pero por ahora solo vamos a retornar un numero fijo."
        return 4;
    }

}
