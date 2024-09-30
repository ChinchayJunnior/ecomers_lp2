package ExamanendePOO;

public class ProductoRopa extends Producto {
    private final String talla;

    public ProductoRopa(String nombre, double precio, String talla) {
        super(nombre, precio);
        this.talla = talla;
    }

    public void mostrarDetalles() {
        System.out.println("Producto de Ropa: " + getNombre() + ", Precio: " + getPrecio() + ", Talla: " + talla);
    }
}
