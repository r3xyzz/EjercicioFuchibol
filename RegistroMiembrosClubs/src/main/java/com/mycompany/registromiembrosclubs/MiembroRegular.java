/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registromiembrosclubs;

/**
 *
 * @author r3xzz
 */
public class MiembroRegular extends Miembro implements RegistroMiembros {
    private String categoria;

    public MiembroRegular(String nombre, int numeroSocio, int edad, String categoria) {
        super(nombre, numeroSocio, edad);
        this.categoria = categoria;
        calcularCuotaMembresia();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Miembro Regular:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Número de Socio: " + getNumeroSocio());
        System.out.println("Edad: " + getEdad());
        System.out.println("Categoría: " + categoria);
        System.out.println("Cuota de Membresía: " + getCuotaMembresia());
    }

    @Override
    public int calcularCuotaMembresia() {
        int cuota = 0;
        if (categoria.equals("Bronce")) {
            cuota = CUOTA_REGULAR;
        } else if (categoria.equals("Plata")) {
            cuota = CUOTA_REGULAR * 2;
        } else if (categoria.equals("Oro")) {
            cuota = CUOTA_REGULAR * 3;
        }
        setCuotaMembresia(cuota);
        return cuota;
    }
}
