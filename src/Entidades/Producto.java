package Entidades;

public class Producto implements Comparable<Producto> {

    protected String nombre;
    protected Integer precio;

    public Producto() {
    }

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

    @Override
    public int compareTo(Producto o) {
        if (this.precio > o.precio) {
            return 1;
        } else if (this.precio < o.precio) {
            return -1;
        } else {
            return 0;
        }
    }

}
