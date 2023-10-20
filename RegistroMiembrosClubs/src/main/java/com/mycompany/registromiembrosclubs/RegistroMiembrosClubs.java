/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registromiembrosclubs;

import java.util.List;
import java.util.Scanner;
/**
 *
 * @author r3xzz 
 */

public class RegistroMiembrosClubs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClubDeportivo club = new ClubDeportivo();

        System.out.println("Registro de Miembros de Club Deportivo");
        System.out.println("1. Miembro Regular");
        System.out.println("2. Miembro VIP");

        System.out.print("Seleccione el tipo de miembro (1/2): ");
        int tipoMiembro = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Número de Socio: ");
        int numeroSocio = scanner.nextInt();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        if (tipoMiembro == 1) {
            System.out.print("Categoría (Bronce/Plata/Oro): ");
            String categoria = scanner.next();
            MiembroRegular miembroRegular = new MiembroRegular(nombre, numeroSocio, edad, categoria);
            club.agregarMiembro(miembroRegular);
        } else if (tipoMiembro == 2) {
            System.out.print("Nivel de Acceso (Básico/Avanzado): ");
            String nivelAcceso = scanner.next();
            MiembroVIP miembroVIP = new MiembroVIP(nombre, numeroSocio, edad, nivelAcceso);
            club.agregarMiembro(miembroVIP);
        }

        List<Miembro> miembrosRegistrados = club.obtenerMiembrosRegistrados();

        System.out.println("Miembros Registrados:");
        for (Miembro miembro : miembrosRegistrados) {
            miembro.mostrarInformacion();
        }

        // Calcular la cuota de membresía para cada miembro y mostrarla
        System.out.println("\nCuota de Membresía:");
        for (Miembro miembro : miembrosRegistrados) {
            System.out.println(miembro.getNombre() + ": " + miembro.getCuotaMembresia());
        }

        // Obtener la cantidad de miembros de cada tipo
        int cantidadMiembrosRegulares = 0;
        int cantidadMiembrosVIP = 0;
        for (Miembro miembro : miembrosRegistrados) {
            if (miembro instanceof MiembroRegular) {
                cantidadMiembrosRegulares++;
            } else if (miembro instanceof MiembroVIP) {
                cantidadMiembrosVIP++;
            }
        }

        System.out.println("\nCantidad de Miembros:");
        System.out.println("Miembros Regulares: " + cantidadMiembrosRegulares);
        System.out.println("Miembros VIP: " + cantidadMiembrosVIP);
    }
}
