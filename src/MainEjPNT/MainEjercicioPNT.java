package MainEjPNT;

import Servicios.ServicioProductos;

public class MainEjercicioPNT {

    public static void main(String[] args) {

        ServicioProductos servicio = new ServicioProductos();

        servicio.crearProductos();
        servicio.ordenInversoProducto();
        servicio.mostrarProductoMasCaro();
        servicio.ordenInversoProducto();
        servicio.mostrarProductoMasBarato();
    }

}
