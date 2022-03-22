/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proy.modeladoras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laura
 */
public class Persona {

    public String nombre;
    public String apellido;
    public String ci;
    public String sexo;
    public String fecha;
    public String estadoCivil;
    public String direccion;
    public String telefono;
    public String ocupacion;
    public String profesion;
    public String rol;
    public String telefonoref;
    public int sucursal;
    public String password;

    static public List<Persona> personas = new ArrayList<Persona>();

    public Persona(String nombre, String apellido, String ci, String sexo, String fecha,
            String estadoCivil, String direccion, String telefono,
            String ocupacion, String profesion, String rol, String telefonoref, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.sexo = sexo;
        this.fecha = fecha;
        this.estadoCivil = estadoCivil;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.profesion = profesion;
        this.rol = rol;
        this.telefonoref = telefonoref;
        this.password = password;
        this.sucursal = 0; //random TODO
    }

    static public void addPerson(Persona user) {
        personas.add(user);
    }
}
