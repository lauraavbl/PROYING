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
public class Historia {

    Cita[] registro;
    int id;
    int peso;
    int talla;
    int imc;
    int ta;
    int ppm;

    static ArrayList<Historia> historias;

    public static void addHistoria(Historia hi) {
        historias.add(hi);
    }

    public static Historia getHistoria(int id) {
        for (Historia hi : historias) {
            if (hi.id == id) {
                return hi;
            }
        }
        return null;
    }
}
