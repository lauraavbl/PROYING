/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proy.modeladoras;

import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class Sucursal {

    String nombre;
    int id;

    static ArrayList<Sucursal> sucursales;

    public static void addSucursal(Sucursal su) {
        sucursales.add(su);
    }

    public ArrayList<Persona> getPacientes() {
        ArrayList<Persona> ret = new ArrayList<Persona>();
        for (Persona p : Persona.personas) {
            if (p.sucursal == id) {
                ret.add(p);
            }
        }
        return ret;
    }
}
