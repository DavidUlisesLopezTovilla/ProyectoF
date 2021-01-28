/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectm;

/**
 *
 * @author David Ulises
 */
public class Empleado2{
       String nombre;
       int nEmpleado;
       String contrasena;
       int nivel;

    public Empleado2(String nombre, int nEmpleado, String contrasena, int nivel) {
        this.nombre = nombre;
        this.nEmpleado = nEmpleado;
        this.contrasena = contrasena;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNEmpleado() {
        return nEmpleado;
    }

    public void setNEmpleado(int nEmpleado) {
        this.nEmpleado = nEmpleado;
    }

    public String getContraseña() {
        return contrasena;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", nEmpleado=" + nEmpleado + '}';
    }

    
       
       
}
