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
public class Computadoras2 extends Productos2{
    String tarjetag;
    String procesador;
    int discoduro;
    
    public Computadoras2(String nombre, int codbarra, float precio, String tarjetag, String procesador, int discoduro) {
        super(nombre, codbarra, precio);
        this.tarjetag = tarjetag;
        this.procesador = procesador;
        this.discoduro = discoduro;
    }

    public String getTarjetag() {
        return tarjetag;
    }

    public void setTarjetag(String tarjetag) {
        this.tarjetag = tarjetag;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(int discoduro) {
        this.discoduro = discoduro;
    }

    @Override
    public String toString() {
        return super.toString()+ "Computadora de{" + "Tarjeta Grafica=" + tarjetag + ", procesador=" + procesador + " gigabytes" +", discoduro=" + discoduro + " gigabytes" + '}';
    }
    
}
