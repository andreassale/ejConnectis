package Entidades;

public class Bebida extends Producto {

    private double litros;

    public Bebida() {
    }

    public Bebida(double litros) {
        this.litros = litros;
    }

    public Bebida(double litros, String nombre, Integer precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// " + "Litros: " + litros + " /// " + "Precio: " + "$" + precio;
    }

}
