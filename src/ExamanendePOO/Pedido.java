package ExamanendePOO;

import java.util.List;

public class Pedido {
    private final int id;
    private final String cliente;
    private final List<Producto> productos;
    private final String estado; // pendiente, enviado, entregado

    public Pedido(int id, String cliente, List<Producto> productos, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public String getEstado() {
        return estado;
    }

    public void mostrarDetalles() {
        System.out.println("Pedido ID: " + id + ", Cliente: " + cliente + ", Estado: " + estado);
        for (Producto producto : productos) {
            producto.mostrarDetalles(); // Polimorfismo
        }
    }
}

