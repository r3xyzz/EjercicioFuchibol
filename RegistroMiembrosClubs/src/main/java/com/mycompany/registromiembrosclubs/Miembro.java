/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registromiembrosclubs;

/**
 *
 * @author r3xzz
 */
public abstract class Miembro {
    private String nombre;
    private int numeroSocio;
    private int edad;
    private int cuotaMembresia;

    public Miembro(String nombre, int numeroSocio, int edad) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.edad = edad;
    }

    // Métodos abstractos para mostrar información específica de cada tipo de miembro
    public abstract void mostrarInformacion();

    public abstract int calcularCuotaMembresia();

    public String getNombre() {
        return nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public int getEdad() {
        return edad;
    }

    public int getCuotaMembresia() {
        return cuotaMembresia;
    }

    public void setCuotaMembresia(int cuotaMembresia) {
        this.cuotaMembresia = cuotaMembresia;
    }
}
