package Servicios;

import Entidades.Producto;
import Entidades.Bebida;
import Entidades.CuidadoPersonal;
import Entidades.Fruta;
import java.util.ArrayList;
import java.util.Collections;

public class ServicioProductos {

    ArrayList<Producto> productos = new ArrayList();

    public void crearProductos() {

        Producto Bebida = new Bebida(1.5, "Coca-Cola Zero", 20);
        productos.add(Bebida);
        Producto Bebida1 = new Bebida(1.5, "Coca-Cola", 18);
        productos.add(Bebida1);
        Producto CuidadoPersonal = new CuidadoPersonal(500, "Shampoo Sedal", 19);
        productos.add(CuidadoPersonal);
        Producto Fruta = new Fruta("kilo", "Frutillas", 64);
        productos.add(Fruta);

        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("=============================");
        Collections.sort(productos);
    }

    public void ordenInversoProducto() {
        Collections.reverse(productos);
    }

    public void mostrarProductoMasCaro() {
        for (Producto p : productos) {
            System.out.println("Producto más caro: " + p.getNombre());
            break;
        }
    }

    public void mostrarProductoMasBarato() {
        for (Producto p : productos) {
            System.out.println("Producto más barato: " + p.getNombre());
            break;
        }
    }

}
