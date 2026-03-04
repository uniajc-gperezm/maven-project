package com.example;

import java.time.LocalDate;
import java.time.Period;

// Esta es la clase molde para crear personas.
public class Persona {
    
    // atributos que identican a una persona
    private int cedula;
    private String nombre;
    private String correo;
    protected int telefono;
    private LocalDate fechaNacimiento;

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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdadAnios() {
        if (this.fechaNacimiento == null) {
            return 0;
        }
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
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
