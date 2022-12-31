package Entidades;

public class Fruta extends Producto {

    private String unidadDeVenta;

    public Fruta() {
    }

    public Fruta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    public Fruta(String unidadDeVenta, String nombre, Integer precio) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// " + "Precio: " + "$" + precio + " /// " + "Unidad de venta: " + unidadDeVenta;
    }

}
