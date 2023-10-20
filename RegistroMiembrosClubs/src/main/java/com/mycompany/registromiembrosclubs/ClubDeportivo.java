/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registromiembrosclubs;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author r3xzz
 */
public class ClubDeportivo {
    private List<Miembro> miembros = new ArrayList<>();

    public void agregarMiembro(Miembro miembro) {
        boolean existe = false;
        for (Miembro m : miembros) {
            if (m.getNumeroSocio() == miembro.getNumeroSocio()) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            miembros.add(miembro);
        } else {
            System.out.println("El miembro con el número de socio " + miembro.getNumeroSocio() + " ya está registrado.");
        }
    }

    public List<Miembro> obtenerMiembrosRegistrados() {
        return miembros;
    }
}
