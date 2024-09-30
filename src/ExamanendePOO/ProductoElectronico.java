package ExamanendePOO;

public class ProductoElectronico extends Producto {
    private final String marca;

    public ProductoElectronico(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    public void mostrarDetalles() {
        System.out.println("Producto Electrónico: " + getNombre() + ", Precio: " + getPrecio() + ", Marca: " + marca);
    }
}

