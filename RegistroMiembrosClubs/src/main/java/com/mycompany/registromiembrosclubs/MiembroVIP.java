/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registromiembrosclubs;

/**
 *
 * @author r3xzz
 */
public class MiembroVIP extends Miembro implements RegistroMiembros {
    private String nivelAcceso;

    public MiembroVIP(String nombre, int numeroSocio, int edad, String nivelAcceso) {
        super(nombre, numeroSocio, edad);
        this.nivelAcceso = nivelAcceso;
        calcularCuotaMembresia();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Miembro VIP:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Número de Socio: " + getNumeroSocio());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nivel de Acceso: " + nivelAcceso);
        System.out.println("Cuota de Membresía: " + getCuotaMembresia());
    }

    @Override
    public int calcularCuotaMembresia() {
        int cuota = 0;
        if (nivelAcceso.equals("Básico")) {
            cuota = CUOTA_VIP;
        } else if (nivelAcceso.equals("Avanzado")) {
            cuota = CUOTA_VIP * 2;
        }
        setCuotaMembresia(cuota);
        return cuota;
    }
}
