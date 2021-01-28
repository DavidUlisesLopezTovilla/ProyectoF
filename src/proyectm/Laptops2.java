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
public class Laptops2 extends Productos2{
     String marca;
     String tipo;
     int memoriaram;

    public Laptops2(String nombre, int codbarra, float precio, String marca, String tipo, int memoriaram) {
        super(nombre, codbarra, precio);
        this.marca = marca;
        this.tipo = tipo;
        this.memoriaram = memoriaram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMemoriaram() {
        return memoriaram;
    }

    public void setMemoriaram(int memoriaram) {
        this.memoriaram = memoriaram;
    }

    @Override
    public String toString() {
        return super.toString()+ "Laptop de{" + "marca=" + marca + ", tipo=" + tipo + ", memoriaram =" + memoriaram + " gigabytes"+'}';
    }
    
    
     
}
