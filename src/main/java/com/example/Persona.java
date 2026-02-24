package com.example;

// Esta es la clase molde para crear personas.
public class Persona {
    
    // atributos que identican a una persona
    private int cedula;
    private String nombre;
    public String correo;
    protected int telefono;

    // constructor metodo inicial de la clase se ejecuta inmediantamente creemos un objeto o una instancia de la clase.
    public Persona() {
        System.out.println("Aqui se ejecuto el constructor vacio");
    }

    public Persona(int cedula) {
        System.out.println("Se ejecuto el contructor con la cedula");
        this.cedula = cedula;
    }

    public Persona(int cedula, String nombre, String correo) {
        System.out.println("Se ejecuto el constructor con todos los parametros");
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
    }

    // Aqui creamos los metodos que indican las acciones que puede ejecutar o hacer una persona.
    public String hablar(String saludo) {
        System.out.println("El metodo hablar se ejecuto");
        return saludo + ": " + this.nombre;
    }

    public void caminar() {
        System.out.println("El metodo caminar se ejecuto");
    }

    private int dormir() {
        System.out.println("El metodo dormir se ejecuto");
        return 8;
    }
}
