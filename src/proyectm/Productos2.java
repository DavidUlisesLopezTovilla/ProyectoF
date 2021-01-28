package proyectm;
/**
 *
 * @author David Ulises
 */

public class Productos2{
    String nombre;
    int codbarra;
    float precio;

    public Productos2(String nombre, int codbarra, float precio) {
        this.nombre = nombre;
        this.codbarra = codbarra;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodbarra() {
        return codbarra;
    }

    public void setCodbarra(int codbarra) {
        this.codbarra = codbarra;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return " Productos{" + "nombre=" + nombre + ", codbarra=" + codbarra + ", precio=" + precio + '}';
    }
    
    
    
    
}